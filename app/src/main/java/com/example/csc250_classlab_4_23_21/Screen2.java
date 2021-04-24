package com.example.csc250_classlab_4_23_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Screen2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.nameTV);
        TextView numberTV = this.findViewById(R.id.numberTV);
        nameTV.setText("Name: " + this.getIntent().getStringExtra("name"));
        numberTV.setText("Number: " + Singleton.number);
    }

    public void onGoToNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        this.startActivity(i);
    }
}