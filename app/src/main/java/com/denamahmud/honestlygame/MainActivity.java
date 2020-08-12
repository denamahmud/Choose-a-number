package com.denamahmud.honestlygame;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.denamahmud.honestlygame.Questions.Ques_1;
import com.denamahmud.honestlygame.Questions.Ques_10;
import com.denamahmud.honestlygame.Questions.Ques_2;
import com.denamahmud.honestlygame.Questions.Ques_3;
import com.denamahmud.honestlygame.Questions.Ques_4;
import com.denamahmud.honestlygame.Questions.Ques_5;
import com.denamahmud.honestlygame.Questions.Ques_6;
import com.denamahmud.honestlygame.Questions.Ques_7;
import com.denamahmud.honestlygame.Questions.Ques_8;
import com.denamahmud.honestlygame.Questions.Ques_9;

public class MainActivity extends AppCompatActivity {

    String[] numbers;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        numbers = getResources().getStringArray(R.array.numbers);

        listView = findViewById(R.id.listView);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers) {
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                // Get the Item from ListView
                View view = super.getView(position, convertView, parent);

                // Initialize a TextView for ListView each Item
                TextView tv = (TextView) view.findViewById(android.R.id.text1);

                // Set the text color of TextView (ListView Item)

                String color_string = "#ffffff";
                int myColor = Color.parseColor(color_string);
                tv.setTextColor(myColor);

                tv.setFontFeatureSettings(String.valueOf(FontStyle.FONT_WEIGHT_BOLD));
                tv.setGravity(Gravity.CENTER);

                // Generate ListView Item using TextView
                return view;
            }
        };
        listView.setAdapter(arrayAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                    Intent intent0 = new Intent(MainActivity.this, Ques_1.class);
                    startActivity(intent0);
                        break;

                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, Ques_2.class);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, Ques_3.class);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, Ques_4.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, Ques_5.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, Ques_6.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(MainActivity.this, Ques_7.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(MainActivity.this, Ques_8.class);
                        startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(MainActivity.this, Ques_9.class);
                        startActivity(intent8);
                        break;

                    case 9:
                        Intent intent9 = new Intent(MainActivity.this, Ques_10.class);
                        startActivity(intent9);
                        break;











                }

            }
        });
    }
}