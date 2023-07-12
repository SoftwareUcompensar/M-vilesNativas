package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.example.crud.db.DBHelper;

public class MainActivity extends AppCompatActivity {

    Button btnCrear;
    private static final String TAG = "Informacion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener referencia al botón con id "btnCrear" del layout
        btnCrear = findViewById(R.id.btnCrear);

        // Asignar un listener al botón "btnCrear"
        btnCrear.setOnClickListener(v -> {
            // Crear una instancia de DBHelper para administrar la base de datos
            DBHelper dbHelper = new DBHelper(MainActivity.this);
            // Obtener una instancia de la base de datos en modo escritura
            SQLiteDatabase db = dbHelper.getWritableDatabase();

            if (dbHelper != null) {
                // Mostrar un mensaje en un Toast indicando que la base de datos se ha creado correctamente
                Toast.makeText(MainActivity.this, "BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
                // Registrar un mensaje en el registro de Logcat con información importante (comentado en este caso)
                //Log.i(TAG, "BASE DE DATOS CREADA");
            } else {
                // Mostrar un mensaje en un Toast indicando que ha ocurrido un error al crear la base de datos
                Toast.makeText(MainActivity.this, "ERROR AL CREAR LA BASE DE DATOS", Toast.LENGTH_LONG).show();
                // Registrar un mensaje en el registro de Logcat con información de error (comentado en este caso)
                //Log.i(TAG, "ERROR AL CREAR LA BASE DE DATOS");
            }
        });
    }
}
