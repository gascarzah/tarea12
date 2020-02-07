package com.gafahtec.tarea1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_button.setOnClickListener {
            val usuario = usuario_edittext.text
            val password = password_textview.text

            if (!usuario.isNullOrEmpty() && !password.isNullOrEmpty()){
                startActivity( Intent(this,BienvenidaActivity::class.java))
            }else{
                Toast.makeText(this, "Favor de volver a intentarlo", Toast.LENGTH_SHORT).show()
            }
        }

        registrarse_button.setOnClickListener {
            startActivity(Intent (this, Registro::class.java))
        }
    }
}
