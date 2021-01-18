package com.example.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    TextView summ;
    Button btn;
    private String KEY = "key";
    int  s1, s2, s3;
    String mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn_sum);
        summ = findViewById(R.id.textWiewSum);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);



    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY, mm);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        summ.setText(savedInstanceState.getString(KEY));

    }


    public void setClick(View view) {
        if (!(et1.getText().toString().equals("") && et2.getText().toString().equals("") && et3.getText().toString().equals(""))) {
            s1 = Integer.parseInt(et1.getText().toString());
            s2 = Integer.parseInt(et2.getText().toString());
            s3 = Integer.parseInt(et3.getText().toString());
        }

        int sum = (s1 + s2) / s3;
        mm = String.valueOf(sum);
        summ.setText(mm);
    }
}