package com.example.todolist

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.widget.ImageView;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val ButtonEditar = findViewById(R.id.btnEditar)
            ButtonEditar.setImageResource(R.drawable.baseline_edit_24)

            val buttonExcluir = findViewById(R.id.btnExcluir)
            buttonExcluir.setImageResource(R.drawable.baseline_delete_forever_24)

            val textView = findViewById(R.id.tvTarefa1)
            textView.text = "Nova Tarefa"

        }
    }

}
