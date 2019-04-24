package com.example.esrapc.gyk_2;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ExampleActivity extends AppCompatActivity {
    RadioGroup genderRG;
    RadioButton femaleRdb, maleRdb;
    EditText nameEd, numberEd, messageEd;
    Button smsBtn, callBtn, sendBtn;
    LinearLayout screenLayout;
    String nameData, numberData, messageData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        initialize();
    }

    private void initialize() {
        screenLayout = findViewById(R.id.screenlayout);
        nameEd = findViewById(R.id.edusername);
        numberEd = findViewById(R.id.edphonenumber);
        messageEd = findViewById(R.id.edmessage);

        sendBtn = findViewById(R.id.sendbutton);
        smsBtn = findViewById(R.id.smsbutton);
        callBtn = findViewById(R.id.callbutton);

        genderRG = findViewById(R.id.genderbuttons);
        femaleRdb = findViewById(R.id.femaleoption);
        maleRdb = findViewById(R.id.maleoption);

        genderRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (femaleRdb.isChecked()) {
                    screenLayout.setBackgroundColor(Color.MAGENTA);
                } else if (maleRdb.isChecked()) {
                    screenLayout.setBackgroundColor(Color.BLUE);
                }
            }
        });

        smsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberData = numberEd.getText().toString();
                messageData = messageEd.getText().toString();

                Uri uri = Uri.parse("smsto:" + numberData);
                Intent smsIntent = new Intent(Intent.ACTION_SENDTO, uri);
                smsIntent.putExtra("sms_body", messageData);
                startActivity(smsIntent);
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberData = numberEd.getText().toString();
                if (numberData.equals(""))
                    Toast.makeText(getApplicationContext(), "Arama yapabilmek için bir numara giriniz."
                            , Toast.LENGTH_LONG).show();
                else {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + numberData));
                    startActivity(callIntent);
                }

            }
        });

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameData = nameEd.getText().toString();
                numberData = numberEd.getText().toString();
                messageData = messageEd.getText().toString();

                Intent sendDataIntent = new Intent(ExampleActivity.this, DataActivity.class);
                sendDataIntent.putExtra("key_name", nameData);
                sendDataIntent.putExtra("key_number", numberData);
                sendDataIntent.putExtra("key_message", messageData);
                startActivity(sendDataIntent);
            }
        });


    }
}
