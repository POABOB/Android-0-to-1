package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCB1, mCB2, mCB3, mCB4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        mCB1 = (CheckBox) findViewById(R.id.cb_1);
        mCB2 = (CheckBox) findViewById(R.id.cb_2);
        mCB3 = (CheckBox) findViewById(R.id.cb_3);
        mCB4 = (CheckBox) findViewById(R.id.cb_4);

        mCB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked?"1選中":"1未選中", Toast.LENGTH_SHORT).show();

            }
        });

        mCB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked?"2選中":"2未選中", Toast.LENGTH_SHORT).show();

            }
        });

        mCB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked?"3選中":"3未選中", Toast.LENGTH_SHORT).show();

            }
        });

        mCB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this, isChecked?"4選中":"4未選中", Toast.LENGTH_SHORT).show();

            }
        });
    }
}