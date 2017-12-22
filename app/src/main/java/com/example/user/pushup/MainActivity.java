package com.example.user.pushup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void holaMundo(){
        String i ="Hola Mundo";
        System.out.println(i);
        int j =1+1;
    }
}
