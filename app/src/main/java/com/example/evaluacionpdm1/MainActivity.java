package com.example.evaluacionpdm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_name, et_mail;
    private LinearLayout prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9;
    private TextView cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9;

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

        cont1 = findViewById(R.id.cont_1);
        cont2 = findViewById(R.id.cont_2);
        cont3 = findViewById(R.id.cont_3);
        cont4 = findViewById(R.id.cont_4);
        cont5 = findViewById(R.id.cont_5);
        cont6 = findViewById(R.id.cont_6);
        cont7 = findViewById(R.id.cont_7);
        cont8 = findViewById(R.id.cont_8);
        cont9 = findViewById(R.id.cont_9);


    }

}
