package com.example.android.listviewadditemprogrammatically;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //instantiate class utk akses ke property
    List<MyProperty> property = new ArrayList<MyProperty>();

    ArrayAdapter<MyProperty> adapter=null;

    ListView listView;

    Button button;

    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView)findViewById(R.id.myListView);

        button=(Button)findViewById(R.id.button1);

        editText=(EditText)findViewById(R.id.editText1);

        adapter=new ArrayAdapter<MyProperty>(getBaseContext(),R.layout.support_simple_spinner_dropdown_item,property);

        listView.setAdapter(adapter);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyProperty prop=new MyProperty();
                prop.setKalimat(editText.getText().toString());

                adapter.add(prop);
            }
        });


    }
}
