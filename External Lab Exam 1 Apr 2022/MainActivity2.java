package com.example.registrationexam;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle extras = getIntent().getExtras();
        String name = extras.getString("name");
        String phone = extras.getString("phone");
        String email = extras.getString("email");
        TextView t1 = (TextView) findViewById(R.id.t1);
        TextView t2 = (TextView) findViewById(R.id.t2);
        TextView t3 = (TextView) findViewById(R.id.t3);
        t1.setText("Name : "+name);
        t2.setText("Phone : "+phone);
        t3.setText("Email : "+email);
     }

}