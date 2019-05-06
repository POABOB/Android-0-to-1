package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtn, mBtn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = (Button) findViewById(R.id.btn_1);
        mBtn.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //跳轉頁面當click事件發生，從Main跳到TextView頁面
                Intent intent =new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }

        });

        mBtn2 = (Button) findViewById(R.id.btn_2);
        mBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳轉頁面當click事件發生，從Main跳到Button頁面
                Intent intent =new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}
