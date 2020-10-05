package com.example.tugasvsgatujuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button hitungkalkulator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hitungkalkulator = findViewById(R.id.btn_hitung);
        hitungkalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Perhitungan.class));
            }
        });

        };

    public void tampilkan(View view) {
        EditText namaEditText = findViewById(R.id.namaEditText);
        String nama = namaEditText.getText().toString();
        TextView namaTextView =findViewById(R.id.namaTextView);
        namaTextView.setText(getString(R.string.nama_anda, nama));
    }
}