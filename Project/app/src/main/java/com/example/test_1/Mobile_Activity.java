package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mobile_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_);
    }

    public void iniciarPregunta(View view){
        Intent intent =new Intent(this, Question_Activity_2.class);
        startActivity(intent);
    }
}
