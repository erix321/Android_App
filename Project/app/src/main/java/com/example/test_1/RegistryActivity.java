package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistryActivity extends AppCompatActivity {

    private EditText name;
    private EditText ape;
    private EditText password;
    private EditText email;
    private EditText edad;
    private EditText genero;
    private DatabaseReference mBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);

        name = (EditText)findViewById(R.id.usr_name);
        ape = (EditText)findViewById(R.id.usr_apellido);
        password = (EditText)findViewById(R.id.usr_password);
        email = (EditText)findViewById(R.id.usr_email);
        edad = (EditText)findViewById(R.id.usr_edad);
        genero = (EditText)findViewById(R.id.usr_genero);

    }

    public void Register(View view){

        //Toast.makeText(this, "dfsfds",Toast.LENGTH_SHORT).show();

        String name_in = name.getText().toString();
        String ape_in = ape.getText().toString();
        String pass_in = password.getText().toString();
        //int edad_in = Integer.parseInt(edad.getText().toString());
        String genero_in = genero.getText().toString();
        String email_in = email.getText().toString();
/*
            mBD= FirebaseDatabase.getInstance().getReference();
            Usuario us=new Usuario(email_in,name_in,ape_in,pass_in,edad_in,genero_in);
            mBD.child("users").child(email_in).setValue(us);

 */
            Toast.makeText(this, "Registro Finalizado",Toast.LENGTH_SHORT).show();
            Intent index = new Intent(this,Activity_Index.class);
 //           index.putExtra("email",email_in);
            startActivity(index);
    }
}
