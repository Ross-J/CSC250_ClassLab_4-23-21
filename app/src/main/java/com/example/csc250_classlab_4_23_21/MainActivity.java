package com.example.csc250_classlab_4_23_21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    private EditText nameET;
    private EditText numberET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.nameET = this.findViewById(R.id.nameET);
        this.numberET = this.findViewById(R.id.numberET);
    }

    public void onGoToNextScreenButtonPressed(View v)
    {
        int num = Integer.parseInt(this.numberET.getText().toString());
        Singleton.number = num;
        String name = this.nameET.getText().toString();
        Intent i = new Intent(this, Screen2.class);
        i.putExtra("name", name);
        this.startActivity(i);
    }
}