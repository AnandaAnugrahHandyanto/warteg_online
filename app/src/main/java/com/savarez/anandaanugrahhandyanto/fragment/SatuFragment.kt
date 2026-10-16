package com.savarez.anandaanugrahhandyanto.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.TimePicker
import android.widget.ToggleButton
import androidx.fragment.app.Fragment
import com.savarez.anandaanugrahhandyanto.R

class SatuFragment : Fragment() {

    private lateinit var etNamaUsaha: EditText
    private lateinit var tvReview: TextView
    private lateinit var btnSubmit: Button
    private lateinit var cbSotoAyam: CheckBox
    private lateinit var cbNasiPecel: CheckBox
    private lateinit var cbNasiRames: CheckBox
    private lateinit var tbStatusUsaha: ToggleButton
    private lateinit var swStatusPromo: Switch
    private lateinit var rgKategoriUsaha: RadioGroup
    private lateinit var tpWaktuBuka: TimePicker
    private lateinit var dpWaktuPromoUtama: DatePicker

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_satu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        etNamaUsaha = view.findViewById(R.id.nama_usaha)
        tvReview = view.findViewById(R.id.review)
        btnSubmit = view.findViewById(R.id.submit)
        cbSotoAyam = view.findViewById(R.id.soto_ayam)
        cbNasiPecel = view.findViewById(R.id.nasi_pecel)
        cbNasiRames = view.findViewById(R.id.nasi_rames)
        tbStatusUsaha = view.findViewById(R.id.status_usaha)
        swStatusPromo = view.findViewById(R.id.status_promo)
        rgKategoriUsaha = view.findViewById(R.id.kategori_usaha)
        tpWaktuBuka = view.findViewById(R.id.waktu_buka)
        dpWaktuPromoUtama = view.findViewById(R.id.waktu_promo_utama)

        btnSubmit.setOnClickListener {
            getReview()
        }
    }

    private fun getReview() {
        var reviewText = ""

        reviewText += "Nama Usaha Anda : " + etNamaUsaha.text.toString()

        reviewText += "\nMenu Masakan : "
        if (cbSotoAyam.isChecked) reviewText += "Soto Ayam, "
        if (cbNasiPecel.isChecked) reviewText += "Nasi Pecel, "
        if (cbNasiRames.isChecked) reviewText += "Nasi Rames, "

        reviewText += "\nStatus Usaha : " + tbStatusUsaha.text

        reviewText += "\nStatus Promo : "
        reviewText += if (swStatusPromo.isChecked) "Promo Aktif" else "Promo Tidak Aktif"

        val idRadioChecked = rgKategoriUsaha.checkedRadioButtonId
        val rbKategori: RadioButton = view?.findViewById(idRadioChecked) ?: return
        reviewText += "\nKategori Usaha : " + rbKategori.text

        val jam = tpWaktuBuka.hour
        val menit = tpWaktuBuka.minute
        reviewText += "\nWaktu Buka : $jam:$menit"

        val hari = dpWaktuPromoUtama.dayOfMonth
        val bulan = dpWaktuPromoUtama.month + 1
        val tahun = dpWaktuPromoUtama.year
        reviewText += "\nWaktu Promosi Utama : $hari-$bulan-$tahun"

        tvReview.text = reviewText
    }
}