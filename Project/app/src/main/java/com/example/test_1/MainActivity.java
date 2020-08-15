package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText)findViewById(R.id.usr_email);
        password = (EditText)findViewById(R.id.usr_pass);
    }

    public void Login(View view){
        String email_in = email.getText().toString();
        String pass_in = password.getText().toString();

        if(email_in.equals("equispepari@unsa.edu.pe")){
            if(pass_in.equals("E123")){
                Toast.makeText(this, "Login Realizado Correctamente",Toast.LENGTH_SHORT).show();
                Intent activities = new Intent(this, Activity_Index.class);
                activities.putExtra("email",email_in);
                startActivity(activities);
                return;
            }
        }
        Toast.makeText(this, "Login Ha Fallado",Toast.LENGTH_SHORT).show();
    }

    public void Abrir_Registro(View view){
        Intent registro = new Intent(this, RegistryActivity.class);
        startActivity(registro);
    }
}
