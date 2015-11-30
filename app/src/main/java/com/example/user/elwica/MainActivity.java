package com.example.user.elwica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{
    ListView listMain;
    String[] mainArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainArray = getResources().getStringArray(R.array.mainArray);
        View head = getLayoutInflater().inflate(R.layout.header, null);
        listMain = (ListView) findViewById(R.id.listMain);

        listMain.addHeaderView(head);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mainArray);
        listMain.setAdapter(adapter);

        listMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position,
                                    long id) {

                switch (position){
                    case 1:
                        startActivity(new Intent(getApplication(),CurrentActivity.class));
                        break;
                    case 2:
                        //startActivity(new Intent(getApplication(), Resistance.class));
                        break;
                }
            }
        });

    }



}
