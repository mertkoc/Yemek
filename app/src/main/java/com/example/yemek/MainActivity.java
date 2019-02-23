package com.example.yemek;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get Data from SQLite
        final myDBClass myDb = new myDBClass(this);

		myDb.InsertData("1","Picture 1", "pic_a.png");
		myDb.InsertData("2","Picture 2", "pic_b.png");
		myDb.InsertData("3","Picture 3", "pic_c.png");
		myDb.InsertData("4","Picture 4", "pic_d.png");
		myDb.InsertData("5","Picture 5", "pic_e.png");
		myDb.InsertData("6","Picture 6", "pic_f.png");
		myDb.InsertData("7","Picture 7", "pic_g.png");
		myDb.InsertData("8","Picture 8", "pic_h.png");
		myDb.InsertData("9","Picture 9", "pic_i.png");

        final String [] myData = {"menemen", "corba"};
        //final String [] myData = myDBClass.SelectAllData();

        // autoCompleteTextView1
        final AutoCompleteTextView autoCom = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, myData);

        autoCom.setAdapter(adapter);

        // button1
        final Button btn1 = (Button)findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        String.valueOf("Your Input : " + autoCom.getText().toString()),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

}