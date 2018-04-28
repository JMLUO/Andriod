package com.example.jm.project;

import android.os.Bundle;
import android.widget.TextView;

import com.example.jm.test.R;

public class other extends LifecycleLogging {

    public static final String EXTRA_MESSAGE="msg";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        TextView tv=(TextView)findViewById(R.id.msg);
        tv.setText(getIntent().getStringExtra(EXTRA_MESSAGE));
    }



}
