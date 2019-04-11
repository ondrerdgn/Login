package com.onder.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView user,passwrd;
    Button enter,clear; //onclick metodu çağrılırsa kullanılabilir


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.userName);
        passwrd = findViewById(R.id.password);
        enter = findViewById(R.id.login);    //onClick metodunda kullanılmıyor
        clear = findViewById(R.id.clearAll); //onClick metodunda kullanılmıyor



    }
        // switch case alternatifi.


    public void clickButton(View view){ // bu yöntemde Onclick isimleri aynı olmalı!!
        switch (view.getId()){
            case R.id.login:

                if (user.getText().toString().equals("legend") && passwrd.getText().toString()
                        .equals("1234")){

                    Toast.makeText(this, "entry success!", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "please try again", Toast.LENGTH_SHORT).show();
                }
                break;


            case R.id.clearAll:

                user.setText("");
                passwrd.setText("");
                break;
        }
    }


}

        // bir view tarafından çağrılırsa


    /*public void enter(View view){

        if (user.getText().toString().equals("onder") && password.getText().toString()
                .equals("1234")){

            Toast.makeText(this, "entry success!", Toast.LENGTH_SHORT).show();


        }else{
            Toast.makeText(this, "please try again", Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View view){
        user.setText("");
        password.setText("");
        //password.requestFocus();
    }*/
