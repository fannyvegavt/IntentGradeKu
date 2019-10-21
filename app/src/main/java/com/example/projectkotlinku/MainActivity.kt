package com.example.projectkotlinku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var InputNim: EditText = findViewById(R.id.inputkan_nim)
        var InputNama: EditText = findViewById(R.id.inputkan_nama)
        var InputNilai: EditText = findViewById(R.id.inputkan_nilai)

        btn_cek.setOnClickListener() {
            intent = Intent(this, NextActivity::class.java)
            intent.putExtra("nim", InputNim.getText())
            intent.putExtra("nama", InputNama.getText())
            intent.putExtra("nil", InputNilai.getText())
            startActivity(intent)
        }
    }
}