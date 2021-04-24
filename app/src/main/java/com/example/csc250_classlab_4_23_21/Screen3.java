package com.example.csc250_classlab_4_23_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        TextView numTV = this.findViewById(R.id.numTV);
        numTV.setText("Number: " + Singleton.number);
    }
}