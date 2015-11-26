package com.example.user.elwica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_selectable_list_item, mainArray);
        listMain.setAdapter(adapter);

    }
}
