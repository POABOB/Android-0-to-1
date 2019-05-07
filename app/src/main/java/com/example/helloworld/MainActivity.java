package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtn, mBtn2, mBtn3, mBtn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = (Button) findViewById(R.id.btn_1);
        mBtn2 = (Button) findViewById(R.id.btn_2);
        mBtn3 = (Button) findViewById(R.id.btn_3);
        mBtn4 = (Button) findViewById(R.id.btn_4);
        setListeners();
    }

    private void setListeners(){
        Onclick onClick = new Onclick();
        mBtn.setOnClickListener(onClick);
        mBtn2.setOnClickListener(onClick);
        mBtn3.setOnClickListener(onClick);
        mBtn4.setOnClickListener(onClick);
    }

    private class Onclick implements View.OnClickListener{
        Intent intent = null;

        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btn_1:
                    //跳轉頁面當click事件發生，從Main跳到TextView頁面
                    intent =new Intent(MainActivity.this, TextViewActivity.class);
                    break;

                case R.id.btn_2:
                    //跳轉頁面當click事件發生，從Main跳到Button頁面
                    intent =new Intent(MainActivity.this, ButtonActivity.class);
                    break;

                case R.id.btn_3:
                    //跳轉頁面當click事件發生，從Main跳到EditText頁面
                    intent =new Intent(MainActivity.this, EditTextActivity.class);
                    break;

                case R.id.btn_4:
                    //跳轉頁面當click事件發生，從Main跳到RadioButton頁面
                    intent =new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}
