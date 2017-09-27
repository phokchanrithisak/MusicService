package com.example.phokchanrithisak.serviceexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button starting, stopping ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //parameter of Intent method we can use either "MainActivity.this or simply this"

    //Another way
//    Intent i;
//    public void startMethod (View v){
//        i = new Intent(MainActivity.this, MyServices.class);
//        startService(i);
//    }
//    public void stopMethod (View v){
//        i = new Intent(this, MyServices.class);
//        stopService(i);
//    }
    public void startMethod (View v){
        Intent i = new Intent(MainActivity.this, MyServices.class);
        startService(i);
    }
    public void pauseMethod (View v){
        MyServices myServices  = new MyServices();
        myServices.pauseSong();
    }
    public void stopMethod (View v){
        Intent i = new Intent(this, MyServices.class);
        stopService(i);
    }
}
