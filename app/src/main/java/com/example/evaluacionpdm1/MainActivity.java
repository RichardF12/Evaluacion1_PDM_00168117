package com.example.evaluacionpdm1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.evaluacionpdm1.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private EditText et_name, et_mail;
    private LinearLayout prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9;
    private TextView tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9;
    private Button btn_send;

    int contador1;
    int contador2;
    int contador3;
    int contador4;
    int contador5;
    int contador6;
    int contador7;
    int contador8;
    int contador9;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.username);
        et_mail = findViewById(R.id.mail);

        prod1 = findViewById(R.id.prod_1);
        prod2 = findViewById(R.id.prod_2);
        prod3 = findViewById(R.id.prod_3);
        prod4 = findViewById(R.id.prod_4);
        prod5 = findViewById(R.id.prod_5);
        prod6 = findViewById(R.id.prod_6);
        prod7 = findViewById(R.id.prod_7);
        prod8 = findViewById(R.id.prod_8);
        prod9 = findViewById(R.id.prod_9);

        tv_1 = findViewById(R.id.cont_1);
        tv_2 = findViewById(R.id.cont_2);
        tv_3 = findViewById(R.id.cont_3);
        tv_4 = findViewById(R.id.cont_4);
        tv_5 = findViewById(R.id.cont_5);
        tv_6 = findViewById(R.id.cont_6);
        tv_7 = findViewById(R.id.cont_7);
        tv_8 = findViewById(R.id.cont_8);
        tv_9 = findViewById(R.id.cont_9);

        btn_send.findViewById(R.id.btn_send);

        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        contador4 = 0;
        contador5 = 0;
        contador6 = 0;
        contador7 = 0;
        contador8 = 0;
        contador9 = 0;

        prod1.setOnClickListener(v ->{
            contador1++;
            tv_1.setText(contador1+"");
        });

        prod2.setOnClickListener(v ->{
            contador2++;
            tv_2.setText(contador2+"");
        });

        prod3.setOnClickListener(v ->{
            contador3++;
            tv_3.setText(contador3+"");
        });

        prod4.setOnClickListener(v ->{
            contador4++;
            tv_4.setText(contador4+"");
        });

        prod5.setOnClickListener(v ->{
            contador5++;
            tv_5.setText(contador5+"");
        });

        prod6.setOnClickListener(v ->{
            contador6++;
            tv_6.setText(contador6+"");
        });

        prod7.setOnClickListener(v ->{
            contador7++;
            tv_7.setText(contador7+"");
        });

        prod8.setOnClickListener(v ->{
            contador8++;
            tv_8.setText(contador8+"");
        });

        prod9.setOnClickListener(v ->{
            contador9++;
            tv_9.setText(contador9+"");
        });

        btn_send.setOnClickListener(v -> {
            Intent mIntent = new Intent(MainActivity.this, NewActivity.class);
            total = contador1+contador2+contador3+contador4+contador5+contador6+contador7+contador8+contador9;
            mIntent.putExtra(AppConstants.NAME_KEY,et_name.getText().toString());
            mIntent.putExtra(AppConstants.MAIL_KEY,et_mail.getText().toString());
            mIntent.putExtra(AppConstants.PROD1_KEY,tv_1.getText().toString() );
            mIntent.putExtra(AppConstants.PROD2_KEY,tv_2.getText().toString() );
            mIntent.putExtra(AppConstants.PROD3_KEY,tv_3.getText().toString() );
            mIntent.putExtra(AppConstants.PROD4_KEY,tv_4.getText().toString() );
            mIntent.putExtra(AppConstants.PROD5_KEY,tv_5.getText().toString() );
            mIntent.putExtra(AppConstants.PROD6_KEY,tv_6.getText().toString() );
            mIntent.putExtra(AppConstants.PROD7_KEY,tv_7.getText().toString() );
            mIntent.putExtra(AppConstants.PROD8_KEY,tv_8.getText().toString() );
            mIntent.putExtra(AppConstants.PROD9_KEY,tv_9.getText().toString() );
            mIntent.putExtra(AppConstants.TOTAL_KEY, total+"");

            startActivity(mIntent);
        });
    }

}
