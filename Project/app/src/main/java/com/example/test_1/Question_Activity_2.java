package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Question_Activity_2 extends AppCompatActivity {

    private TextView pregunta_box,time_view;
    private Button opcion1,opcion2,opcion3,opcion4;
    private boolean stop_reloj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question__2);

        pregunta_box=(TextView)findViewById(R.id.view_pregunta_2);
        //time_view=(TextView)findViewById(R.id.time_View);
        opcion1=(Button) findViewById(R.id.btn_q2_1);
        opcion2=(Button) findViewById(R.id.btn_q2_2);
        opcion3=(Button) findViewById(R.id.btn_q2_3);
        opcion4=(Button) findViewById(R.id.btn_q2_4);

        cargarDatos();

    }
    private void cargarDatos(){
        String pregunta = "¿Cuántas flores habían en la anterior imágen?";
        String[] opciones= {"Una","Dos","Tres","Cuatro"};

        pregunta_box.setText(pregunta);
        opcion1.setText(opciones[0]);
        opcion2.setText(opciones[1]);
        opcion3.setText(opciones[2]);
        opcion4.setText(opciones[3]);
    }

    public void Acierto(View view) {
        Toast.makeText(this, "Usted ha acertado, Felicidades!",Toast.LENGTH_SHORT).show();
        Intent activities = new Intent(this, Activity_Index.class);
        startActivity(activities);
    }

    public void Error(View view) {
        Toast.makeText(this, "Estuvo muy cerca, buen trabajo, siga intentándolo.",Toast.LENGTH_SHORT).show();
        Intent activities = new Intent(this, Activity_Index.class);
        startActivity(activities);
    }
}