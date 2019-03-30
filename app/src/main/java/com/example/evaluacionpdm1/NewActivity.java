package com.example.evaluacionpdm1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {
    private TextView user, mail, total, tv_1, tv_2, tv_3, tv_4, tv_5, tv_6, tv_7, tv_8, tv_9;
    private LinearLayout prod1, prod2, prod3, prod4, prod5, prod6, prod7, prod8, prod9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent mIntent = getIntent();

        user = findViewById(R.id.showUser);
        mail = findViewById(R.id.showMail);
        total = findViewById(R.id.showTotal);
    }
}
