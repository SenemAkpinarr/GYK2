package com.example.esrapc.gyk_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {

    TextView nameText, numberText, messageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        initialize();
    }

    private void initialize() {
        nameText = findViewById(R.id.nametxt);
        numberText = findViewById(R.id.numbertxt);
        messageText = findViewById(R.id.messagetxt);

        Intent incomingData = getIntent();
        Bundle bundle = incomingData.getExtras();

        String name = bundle.getString("key_name");
        String number = bundle.getString("key_number");
        String message = bundle.getString("key_message");

        nameText.setText(name);
        numberText.setText(number);
        messageText.setText(message);
    }
}