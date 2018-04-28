package com.example.jm.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.jm.test.R;

public class MainActivity extends LifecycleLogging {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    //打开新页浏览页面
    public void showMe(View v) {
        EditText url= findViewById(R.id.url);
        startActivity(new Intent(Intent.ACTION_VIEW,
               Uri.parse(url.getText().toString())));
    }
    //Explicit
   public void showOther(View view) {
   startActivity(new Intent( this, Main2Activity.class));
  }

    //extra
    public void showOthers(View view) {
       Intent other=new Intent( this,other .class);
        other.putExtra(com.example.jm.test.other.EXTRA_MESSAGE, getString(R.string.others));
        startActivity(other);
    }
    */

    //fragment
    public void showOther(View v) {
        Intent other = new Intent(this, other.class);

        other.putExtra(com.example.jm.project.other.EXTRA_MESSAGE,
                getString(R.string.other));
        startActivity(other);
    }
}