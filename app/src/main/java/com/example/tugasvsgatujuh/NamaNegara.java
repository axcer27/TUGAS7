package com.example.tugasvsgatujuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class NamaNegara extends AppCompatActivity {
    private ListView listView;
    private Button exit;
    private String[] negara = new String[]{"Indonesia", "Malaysia", "Singapore", "Italia", "Inggris", "Belanda", "Argentina", "Chile", "Mesir", "Uganda"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namanegara);

        exit = findViewById(R.id.btn_back);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NamaNegara.this, MainActivity.class));
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(NamaNegara.this,
                android.R.layout.simple_list_item_1,android.R.id.text1,negara);

        listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(NamaNegara.this, negara[position], Toast.LENGTH_LONG).show();
            }
        });
    }
}