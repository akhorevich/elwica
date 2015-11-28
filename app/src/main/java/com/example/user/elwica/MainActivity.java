package com.example.user.elwica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends AppCompatActivity implements OnItemClickListener{
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
        listMain.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                Intent i = new Intent(this, CurrentActivity.class);
                startActivity(i);
                break;
        }
    }
}
