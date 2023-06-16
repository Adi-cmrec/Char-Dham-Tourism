package com.example.tourism;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class yamnotri_first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yamnotri_first);
    }
    public void oAct2(View view){
        Toast.makeText(this, "Opening attractions ", Toast.LENGTH_SHORT).show();
        Intent intent =new Intent(this,yam_first_att.class);
        startActivity(intent);
    }
    public void oAct1(View v)
    {
        Toast.makeText(this, "Showing Description ", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(this,yamunotri_des.class);
        startActivity(intent);
    }
}