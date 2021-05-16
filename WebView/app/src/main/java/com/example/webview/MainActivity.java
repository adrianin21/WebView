package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText we;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        we = (EditText)findViewById(R.id.we);
    }

    public void Navegar(View view) {
        Intent i = new Intent(this,ActivityWeb.class);
        i.putExtra("SitioWeb", we.getText().toString());
        startActivity(i);
    }
}