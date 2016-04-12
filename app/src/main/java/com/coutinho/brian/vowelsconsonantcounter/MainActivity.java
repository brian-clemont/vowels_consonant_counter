package com.coutinho.brian.vowelsconsonantcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button check;
    EditText input_string;
    TextView res;
    int count=0,consonants=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check = (Button) findViewById(R.id.button_count);
        input_string = (EditText) findViewById(R.id.input_string);
        res = (TextView) findViewById(R.id.result);
        check.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String s = input_string.getText().toString();

count=0;

        for (int i = 0; i < s.length(); i++) {
           Character.valueOf(s.charAt(i)).toString();
            if (Character.valueOf(s.charAt(i)).toString().matches(".*[AEIOUaeiou].*")) {

                count++;
            }
            else if(Character.valueOf(s.charAt(i)).toString().matches(".*[ -_,.\\[\\{\\]}\\?=()].*"))
                    // to check the characters which are not consonants
            {
            }
            else {
                consonants++;
            }
        }
        res.setText(getString(R.string.final_Statement)+count+ getString(R.string.consonant_res)+(consonants));
        count =0;
        consonants=0;
    }
}