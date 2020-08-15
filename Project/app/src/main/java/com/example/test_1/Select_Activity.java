package com.example.test_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class Select_Activity extends AppCompatActivity {

    CheckBox c1,c2,c3,c4,c5,c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_);
        //checks=new ArrayList<CheckBox>();
        c1=(CheckBox)findViewById(R.id.check1);
        c2=(CheckBox)findViewById(R.id.check2);
        c3=(CheckBox)findViewById(R.id.check3);
        c4=(CheckBox)findViewById(R.id.check4);
        c5=(CheckBox)findViewById(R.id.check5);
        c6=(CheckBox)findViewById(R.id.check6);
    }

    public void Comprobate(View v){
        boolean res=true;

        if(c1.isChecked()){
            if(c4.isChecked()) {
                if(c2.isChecked()||c3.isChecked()||c5.isChecked()||c6.isChecked()){
                    res = true;
                }else {
                    res = false;
                }
            }
        }

        //if(checks.get(1).isSelected()){
         //   if(checks.get(4).isSelected()){
          //      Toast.makeText(this, "Usted ha Acertado", Toast.LENGTH_SHORT).show();
           //     res=false;
           // }
        //}
        if(res){
            Toast.makeText(this, "No se rinda, siga intentando.", Toast.LENGTH_SHORT).show();
            Intent activities = new Intent(this, Activity_Index.class);
            startActivity(activities);
        }else {
            Toast.makeText(this, "Usted ha acertado, felicidades!", Toast.LENGTH_SHORT).show();
            Intent activities = new Intent(this, Activity_Index.class);
            startActivity(activities);
        }
    }
}
