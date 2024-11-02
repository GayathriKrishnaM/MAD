package com.example.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void newScreen(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(i);
    }
}
