package com.example.projectkotlinku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val bundle:Bundle? = intent.extras
        val ltNim = bundle?.get("nim")
        val ltNama = bundle?.get("nama")
        val ltNilai = bundle?.get("nil")

        var nilai_angka = ltNilai.toString()
        var nilai_huruf = nilai_angka.toInt()

        if (nilai_huruf >= 80) {
            lt_has_ket.setText("A")
        } else if (nilai_huruf >= 60){
            lt_has_ket.setText("B")
        } else if (nilai_huruf >= 40) {
            lt_has_ket.setText("C")
        } else if (nilai_huruf >= 20) {
            lt_has_ket.setText("D")
        }
        else {
            lt_has_ket.setText("E")
        }
        lt_has_nim.setText(""+ltNim)
        lt_has_nama.setText(""+ltNama)
        lt_has_nilai.setText(""+ltNilai)
    }
}
