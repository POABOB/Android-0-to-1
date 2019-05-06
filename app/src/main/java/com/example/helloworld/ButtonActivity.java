package com.example.helloworld;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    private Button mBtn3;
    private TextView TextView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        //另一種onclick寫法
        mBtn3 = (Button) findViewById(R.id.btn_3);
        mBtn3.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Hello, 我是Toast3^^",Toast.LENGTH_SHORT).show();
            }

        });

        TextView1 = (TextView) findViewById(R.id.text_1);
        TextView1.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Hello, 我是Text1^^",Toast.LENGTH_SHORT).show();
            }

        });

    }



    //類似js的class onclick方法
    public void showToast(View view){
        Toast.makeText(this, "Hello, 我是Toast4^^",Toast.LENGTH_SHORT).show();
    }
}
