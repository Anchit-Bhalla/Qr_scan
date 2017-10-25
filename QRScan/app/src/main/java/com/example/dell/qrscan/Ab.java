package com.example.dell.qrscan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Ab extends AppCompatActivity {
    TextView a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab);
        a = (TextView)findViewById(R.id.textView);
        final String h,j;
        h =getIntent().getExtras().getString("a");
        a.setText(h);


    }
}
