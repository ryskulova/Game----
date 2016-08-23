package com.example.satanat.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {
    // private ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        Intent intent = getIntent();
        String user = " ";
        user = getIntent().getExtras().getString("username");
        TextView infoTextView = (TextView)findViewById(R.id.editText3);
        infoTextView.setText(user + " , вам передали " );
    }
}


