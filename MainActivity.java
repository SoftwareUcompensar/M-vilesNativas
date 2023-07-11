package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

import com.example.crud.db.DBHelper;

public class MainActivity extends AppCompatActivity {


    Button btnCrear;

    private static final String TAG = "Informacion";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnCrear = findViewById(R.id.btnCrear);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                DBHelper dbHelper = new DBHelper(MainActivity.this);
                SQLiteDatabase db = dbHelper.getWritableDatabase();

                if(dbHelper !=null){
                   // Toast.makeText(MainActivity.this,"BASE DE DATOS CREADA", Toast.LENGTH_LONG).show();
                    Log.i(TAG, "BASE DE DATOS CREADA"); // Información importante


                }
                else
                {
                   // Toast.makeText(MainActivity.this,"ERROR AL CREAR LA BASE DE DATOS", Toast.LENGTH_LONG).show();
                    Log.i(TAG, "ERROR AL CREAR LA BASE DE DATOS");
                }

            }
        });

    }
}