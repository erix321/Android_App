package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad_Preguntas extends AppCompatActivity {

    private TextView pregunta_box,time_view;
    private Button opcion1,opcion2,opcion3,opcion4;
    private boolean stop_reloj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad__preguntas);

        pregunta_box=(TextView)findViewById(R.id.view_pregunta);
        //time_view=(TextView)findViewById(R.id.time_View);
        opcion1=(Button) findViewById(R.id.b_op1);
        opcion2=(Button) findViewById(R.id.b_op2);
        opcion3=(Button) findViewById(R.id.b_op3);
        opcion4=(Button) findViewById(R.id.b_op4);

        cargarDatos();
        //super.onResume();
        //reloj(20);
    }

    /*
    protected void onResume(Bundle savedInstanceState){
        super.onResume();
        stop_reloj=false;
        reloj(20);
    }
    */

    private void cargarDatos(){
        String pregunta = "Mi padre es una buena persona, el siempre me ...";
        String[] opciones= {"Castiga","Anima","Ignora","Grita"};

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

        private void reloj(int value_time){
        for(int i=value_time;i>=0;i--){
            if(stop_reloj){
                break;
            }
            time_view.setText("Tiempo: "+i);
            try{Thread.sleep(1000);}
            catch(Exception e){e.printStackTrace();}
        }

    }
}
