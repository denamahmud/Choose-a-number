package com.denamahmud.honestlygame.Questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.denamahmud.honestlygame.R;
import com.denamahmud.honestlygame.Results.Res_1;
import com.denamahmud.honestlygame.Results.Res_2;

public class Ques_10 extends AppCompatActivity {

    Button btn_yes_10,btn_no_10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques_10);


        btn_yes_10 = findViewById(R.id.btn_yes_10);
        btn_no_10 = findViewById(R.id.btn_no_10);


        btn_yes_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Res_1.class);

                startActivity(intent);
            }

        });


        btn_no_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Res_2.class);

                startActivity(intent);
            }
        });
    }
}