package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity_Index extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__index);
    }

    public void Question_Activity(View v){
        Intent question_a = new Intent(this, Actividad_Preguntas.class);
        startActivity(question_a);
    }

    public void Select_Activity(View v){
        Intent select_a = new Intent(this, Select_Activity.class);
        startActivity(select_a);
    }

    public void Memory_Activity(View v){
        Intent movile_a = new Intent(this, Mobile_Activity.class);
        startActivity(movile_a);
    }

    public void Exit(View v){
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void Perfil(View v){
        Intent perfil=new Intent(this,Perfil.class);
        startActivity(perfil);
    }
}
