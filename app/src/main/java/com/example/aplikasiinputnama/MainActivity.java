package com.example.aplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lblHasil;
    EditText inputNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblHasil = findViewById(R.id.lblTampil);
        inputNama = findViewById(R.id.txtNama);

    }

    public void TampilNama(View view){

        String nama = inputNama.getText().toString();
        lblHasil.setText("Nama Anda : " + nama);

    }
}