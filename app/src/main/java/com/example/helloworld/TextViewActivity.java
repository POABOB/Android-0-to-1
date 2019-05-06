package com.example.helloworld;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv4, mtv5, mt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv4 = (TextView) findViewById(R.id.text_4);
        mtv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mtv4.getPaint().setAntiAlias(true); //去除鋸齒狀

        mtv5 = (TextView) findViewById(R.id.text_5);
        mtv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mt6 = (TextView) findViewById(R.id.text_6);
        mt6.setText(Html.fromHtml("<u>我要發財~</u>"));
    }
}
