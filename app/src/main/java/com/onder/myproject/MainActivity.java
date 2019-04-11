package com.onder.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView email,password;
    Button enter,clear; //onclick metodu çağrılırsa kullanılabilir



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        //enter = findViewById(R.id.enter);
        //clear = findViewById(R.id.clear);



    }
        // bir view tarafından çağrılırsa

    public void enter(View view){
        switch (view.getId()){
            case R.id.enter:

                if (email.getText().toString().equals("legend") && password.getText().toString()
                        .equals("1234")){

                    Toast.makeText(this, "entry success!", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(this, "please try again", Toast.LENGTH_SHORT).show();
                }

                break;


            case R.id.clear:

                email.setText("");
                password.setText("");


                break;
        }
    }


}

        // switch case alternatifi.


    /*public void enter(View view){

        if (email.getText().toString().equals("onder") && password.getText().toString()
                .equals("1234")){

            Toast.makeText(this, "entry success!", Toast.LENGTH_SHORT).show();


        }else{
            Toast.makeText(this, "please try again", Toast.LENGTH_SHORT).show();
        }
    }

    public void clear(View view){
        email.setText("");
        password.setText("");
        //password.requestFocus();
    }*/
