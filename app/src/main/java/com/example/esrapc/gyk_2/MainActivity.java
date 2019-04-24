package com.example.esrapc.gyk_2;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button listBtn, webViewBtn, exampleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
    }

    private void initialize() {
        listBtn = findViewById(R.id.openlistbtn);
        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listIntent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(listIntent);
            }
        });

        webViewBtn = findViewById(R.id.openwebviewbtn);
        webViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(webIntent);
            }
        });

        exampleBtn = findViewById(R.id.openexample);
        exampleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exampleIntent = new Intent(MainActivity.this, ExampleActivity.class);
                startActivity(exampleIntent);
            }
        });
    }
}