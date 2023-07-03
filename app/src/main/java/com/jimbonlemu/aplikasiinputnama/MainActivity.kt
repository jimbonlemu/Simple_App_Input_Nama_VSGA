package com.jimbonlemu.aplikasiinputnama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Input Nama"
        var nameField = findViewById<EditText>(R.id.editTextNama)

        findViewById<MaterialButton>(R.id.buttonShow).setOnClickListener {

            if (nameField.text.isNotEmpty()){
                toast("Halo ${nameField.text} selamat datang di pemrograman kotlin")
            }else{
                toast("Kolom nama tidak boleh kosong jika ingin tampil")
            }

        }
    }

    private fun toast(msg:String){
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}