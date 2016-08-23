package com.example.satanat.game;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //private EditText editText;
    //private EditText editText1;
    public Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
//      editText = (EditText)findViewById(R.id.editText);
  //      editText1 = (EditText)findViewById(R.id.editText2);
    }
   // SharedPreferences localSettings = getPreferences(MODE_PRIVATE);
    //SharedPreferences localSettings1 = getPreferences(MODE_PRIVATE);
    //String textState = localSettings.getString("text_state", "");
    //String textState1 = localSettings1.getString("text_state1", "");




    public void init() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }


    }

