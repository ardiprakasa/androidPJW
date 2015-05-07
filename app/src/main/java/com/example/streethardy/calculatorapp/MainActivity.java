package com.example.streethardy.calculatorapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnTambah, btnKurang, btnKali, btnBagi;
    EditText editTextInput1, editTextInput2, editTextOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextInput1= (EditText) findViewById(R.id.input1);
        editTextInput2= (EditText) findViewById(R.id.input2);
        editTextOutput= (EditText) findViewById(R.id.output);

        btnTambah= (Button) findViewById(R.id.buttonTambah);
        btnKurang= (Button) findViewById(R.id.buttonKurang);
        btnKali= (Button) findViewById(R.id.buttonBagi);
        btnBagi= (Button) findViewById(R.id.buttonBagi);

        btnTambah.setOnClickListener(this);
        btnKurang.setOnClickListener(this);
        btnKali.setOnClickListener(this);
        btnBagi.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonTambah:
                String angka1=editTextInput1
                break;
            case R.id.buttonKurang:

                break;
            case R.id.buttonKali:

                break;
            case R.id.buttonBagi:

                break;

        }

    }
}
