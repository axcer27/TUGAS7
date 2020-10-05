package com.example.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {
    private EditText angka1;
    private EditText angka2;
    private TextView hasilText;
    private Button Clear;
    private Button country;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        country = findViewById(R.id.btn_negara);
        country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Kalkulator.this, Listnegara.class));
            }
        });

        angka1=findViewById(R.id.angkaawal);
        angka2=findViewById(R.id.angkakedua);
        hasilText=findViewById(R.id.hasilText);
        Clear=findViewById(R.id.bersih);

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = angka1.getText().toString();
                String text2 = angka2.getText().toString();
                if (text.isEmpty()&&text2.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Sudah Kosong", Toast.LENGTH_SHORT).show();
                }else{
                    angka1.setText("");
                    angka2.setText("");
                }
            }
        });
    }

    public void tambah(View view) {
        int a = Integer.parseInt(angka1.getText().toString());
        int b = Integer.parseInt(angka2.getText().toString());
        int jawaban = a + b;
        hasilText.setText(String.valueOf(jawaban));
    }

    public void kurang(View view) {
        int a = Integer.parseInt(angka1.getText().toString());
        int b = Integer.parseInt(angka2.getText().toString());
        int jawaban = a - b;
        hasilText.setText(String.valueOf(jawaban));
    }

    public void kali(View view) {
        int a = Integer.parseInt(angka1.getText().toString());
        int b = Integer.parseInt(angka2.getText().toString());
        int jawaban = a * b;
        hasilText.setText(String.valueOf(jawaban));
    }

    public void bagi(View view) {
        int a = Integer.parseInt(angka1.getText().toString());
        int b = Integer.parseInt(angka2.getText().toString());
        float jawaban = (float) a / b;
        hasilText.setText(String.valueOf(jawaban));
    }
}