//Implementing basic arithmetic operations of a simple calculator
package com.example.co1_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View view){
        EditText n1 = (EditText)findViewById(R.id.num1);
        int val1 = Integer.parseInt( n1.getText().toString());
        EditText n2 = (EditText)findViewById(R.id.num2);
        int val2 = Integer.parseInt( n2.getText().toString());
        TextView op  = (TextView)findViewById(R.id.op);
        op.setText(String.valueOf(val1)+" + "+ String.valueOf(val2)+" = "+ String.valueOf(val1+val2));


    }
    public void sub(View view){
        EditText n1 = (EditText)findViewById(R.id.num1);
        int val1 = Integer.parseInt( n1.getText().toString());
        EditText n2 = (EditText)findViewById(R.id.num2);
        int val2 = Integer.parseInt( n2.getText().toString());
        TextView op  = (TextView)findViewById(R.id.op);
        op.setText(String.valueOf(val1)+" - "+ String.valueOf(val2)+" = "+ String.valueOf(val1-val2));


    }
    public void mul(View view){
        EditText n1 = (EditText)findViewById(R.id.num1);
        int val1 = Integer.parseInt( n1.getText().toString());
        EditText n2 = (EditText)findViewById(R.id.num2);
        int val2 = Integer.parseInt( n2.getText().toString());
        TextView op  = (TextView)findViewById(R.id.op);
        op.setText(String.valueOf(val1)+" * "+ String.valueOf(val2)+" = "+ String.valueOf(val1*val2));


    }
    public void div(View view){
        EditText n1 = (EditText)findViewById(R.id.num1);
        int val1 = Integer.parseInt( n1.getText().toString());
        EditText n2 = (EditText)findViewById(R.id.num2);
        int val2 = Integer.parseInt( n2.getText().toString());
        TextView op  = (TextView)findViewById(R.id.op);
        op.setText(String.valueOf(val1)+" / "+ String.valueOf(val2)+" = "+ String.valueOf(val1/val2));


    }

}