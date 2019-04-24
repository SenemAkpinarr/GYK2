package com.example.esrapc.gyk_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        initialize();
    }

    private void initialize() {
        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(false);
        webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr/");
    }
}