package com.tp1.consigna4
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.nombre)
        val etEdad = findViewById<EditText>(R.id.edad)
        val etDireccion = findViewById<EditText>(R.id.direccion)
        val tvMensaje = findViewById<TextView>(R.id.mensaje)
        val BotonRegistrar = findViewById<Button>(R.id.registrar)
        val BotonLimpiar = findViewById<Button>(R.id.limpiar)


            BotonRegistrar.setOnClickListener {

                val nombre = etNombre.text.toString()
                val edad = etEdad.text.toString()
                val direccion = etDireccion.text.toString()

                    if (nombre.isEmpty()) {

                        Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show()
                    } else if (direccion.length < 10)  {

                        Toast.makeText(this, "El minimo de caracteres para direccion es 10", Toast.LENGTH_SHORT).show()
                    } else if (edad.isEmpty()) {
                        Toast.makeText(this, "Ingrese una edad", Toast.LENGTH_SHORT).show()
                    } else {
                        val edadNumero = edad.toIntOrNull()
                        if (edadNumero == null || edadNumero <= 0) {
                            Toast.makeText(this, "La edad no puede ser 0", Toast.LENGTH_SHORT)
                                .show()
                        } else {
                            tvMensaje.text =
                                ("Hola, $nombre, su edad es $edad su direccion es $direccion")

                            }
                        }
                    }
                BotonLimpiar.setOnClickListener{
                    etNombre.text.clear()
                    etEdad.text.clear()
                    etDireccion.text.clear()
                    tvMensaje.text = ""

                }
                }
            }

