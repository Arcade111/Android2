package com.example.one.android2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.FitWindowsLinearLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
//    GridLayout gridLayout;
//    String[] chars = new String[]
//            {
//                    "7","8","9","÷",
//                    "4","5","6","×",
//                    "1","2","3","-",
//                    ".","0","=","+",
//            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//        gridLayout =(GridLayout)findViewById(R.id.root);
//                for(int i=0;i<chars.length;i++)
//                {
//                    Button bn = new Button(this);
//                    bn.setText(chars[i]);
//                    bn.setTextSize(40);
//                    bn.setPadding(5,35,5,35);
//                    GridLayout.Spec rowSpec=GridLayout.spec(i/4+2);
//                    GridLayout.Spec columnSpec = GridLayout.spec(i%4);
//                    GridLayout.LayoutParams params =new GridLayout.LayoutParams(rowSpec,columnSpec);
//                    params.setGravity(Gravity.FILL);
//                    gridLayout.addView(bn,params);
//
//                }
        Button bn1 =(Button)findViewById(R.id.m1);
        bn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1= new Intent(MainActivity.this,FirActivity.class);
                startActivity(intent1);
            }
        });
        Button bn2 = (Button)findViewById(R.id.m2);
        bn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 =new Intent(MainActivity.this,ScdActivity.class);
                startActivity(intent2);
            }
        });
        Button bn3 = (Button)findViewById(R.id.m3);
        bn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this,ThdActivity.class);
                startActivity(intent3);
            }
        });
        Button bn4 = (Button)findViewById(R.id.m4);
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this,FthActivity.class);
                startActivity(intent4);
            }
        });
    }
}
