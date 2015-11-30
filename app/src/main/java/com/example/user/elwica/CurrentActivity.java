package com.example.user.elwica;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import android.widget.TextView;

public class CurrentActivity extends AppCompatActivity implements OnClickListener{
    public int POW;
    public int VOL;
    int curInt;
    float condInt;
    int secInt;
    int CurrentCu[][] = {
            {11, 15, 17, 23, 30, 41, 50, 80, 100, 140, 170, 215, 270, 330, 385},
            {0, 0, 16, 19, 27, 38, 46, 70, 85, 115, 135, 185, 225, 275, 315},
            {0, 0, 15, 17, 25, 35, 42, 60, 80, 100, 125, 170, 210, 255, 290},
            {0, 0, 14, 16, 25, 30, 40, 50, 75, 90, 115, 150, 185, 225, 260},
            {0, 0, 15, 18, 25, 32, 40, 55, 80, 100, 125, 160, 195, 245, 295},
            {0, 0, 14, 15, 21, 27, 34, 50, 70, 85, 100, 135, 175, 215, 250}
    };
    int CurrentAl[][] = {
            {11, 15, 17, 23, 30, 41, 50, 80, 100, 140, 170, 215, 270, 330, 385},
            {0, 0, 16, 19, 27, 38, 46, 70, 85, 115, 135, 185, 225, 275, 315},
            {0, 0, 15, 17, 25, 35, 42, 60, 80, 100, 125, 170, 210, 255, 290},
            {0, 0, 14, 16, 25, 30, 40, 50, 75, 90, 115, 150, 185, 225, 260},
            {0, 0, 15, 18, 25, 32, 40, 55, 80, 100, 125, 160, 195, 245, 295},
            {0, 0, 14, 15, 21, 27, 34, 50, 70, 85, 100, 135, 175, 215, 250}
    };

    EditText etPow, etVol;
    Spinner spinner;
    Current cur;
    TextView result;

 Button Count;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current);

        String[] type = getResources().getStringArray(R.array.phase);
        spinner = (Spinner) findViewById(R.id.spin);
        ArrayAdapter<String> spin = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, type);
        spin.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spin);
        etPow = (EditText) findViewById(R.id.etPow);


        etVol = (EditText) findViewById(R.id.etVol);


        Count = (Button) findViewById(R.id.butCount);
        Count.setOnClickListener(this);
        cur = new Current();
        result = (TextView) findViewById(R.id.result);

    }

    @Override
    public void onClick( View v ) {
        POW = Integer.parseInt(etPow.getText().toString());
        VOL = Integer.parseInt(etVol.getText().toString());
        switch (v.getId()){
            case R.id.butCount:
                curInt = cur.Intensity(POW,VOL,1);
                condInt = cur.Conductor(curInt);
                result.setText(String.valueOf(curInt) + " "+ String.valueOf(condInt));
        }
    }
}
