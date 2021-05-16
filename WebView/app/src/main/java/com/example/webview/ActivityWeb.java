package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wv = (WebView) findViewById(R.id.wv);
        String URL = getIntent().getStringExtra("SitioWeb");
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl("http://" + URL);
    }
    public void Cerrar(View view){
        finish();
    }
}