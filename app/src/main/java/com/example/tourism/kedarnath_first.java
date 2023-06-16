package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kedarnath_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kedarnath_first);
    }
    public void openAct1(View v)
    {
        Toast.makeText(this, "Opening Description ", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,kedarnath_des.class);
        startActivity(intent);
    }
    public void openAct2(View v)
    {
        Toast.makeText(this, "Opening Attractions ", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,kedarnath_att.class);
        startActivity(intent);
    }
}