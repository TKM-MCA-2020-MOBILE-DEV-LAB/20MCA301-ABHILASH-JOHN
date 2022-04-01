package com.example.registrationexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String name = "";
    String phone = "";
    String email = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view){
        EditText edname = (EditText) findViewById(R.id.name);
        EditText edphone = (EditText) findViewById(R.id.phone);
        EditText edemail = (EditText) findViewById(R.id.email);
        name = edname.getText().toString();
        phone = edphone.getText().toString();
        email = edemail.getText().toString();

        if(name.isEmpty()){
            edname.setError("Name Cannot be Empty");
        }
        else if(phone.isEmpty()){
            edphone.setError("Phone no cannot be empty");
        }
        else if(email.isEmpty()){
            edemail.setError("Email Cannot be empty");
        }
        else {
            Intent i = new Intent(getApplicationContext(), MainActivity2.class);
            i.putExtra("name", name);
            i.putExtra("email", email);
            i.putExtra("phone", phone);
            startActivity(i);
            SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE);
            SharedPreferences.Editor myEdit = sharedPreferences.edit();
            myEdit.putString("name", name);
            myEdit.putString("phone", phone);
            myEdit.putString("email", email);
            myEdit.apply();
            edname.setText("");
            edphone.setText("");
            edemail.setText("");
        }
    }
    @Override
    protected void onResume() {
        super.onResume();
        TextView name = (TextView) findViewById(R.id.on);
        TextView  phone = (TextView) findViewById(R.id.op);
        TextView  email = (TextView) findViewById(R.id.oe);
        SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);
        name.setText("Name :  "+sh.getString("name",""));
        phone.setText("Phone :  "+sh.getString("phone",""));
        email.setText("Email :  "+sh.getString("email",""));
    }

}