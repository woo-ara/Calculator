package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // + 버튼 (덧셈)
    public void onClickAdd(View view) {
        EditText number1 = (EditText) findViewById(R. id.editNum1);
        EditText number2 = (EditText) findViewById(R. id.editNum2);
        TextView result = (TextView) findViewById(R. id.result);
        //정수형 계산
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 + n2));
    }

    // - 버튼 (뺄셈)
    public void onClickSub(View view) {
        EditText number1 = (EditText) findViewById(R. id.editNum1);
        EditText number2 = (EditText) findViewById(R. id.editNum2);
        TextView result = (TextView) findViewById(R. id.result);
        //정수형 계산
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 - n2));
    }

    // * 버튼 (곱셈)
    public void onClickMul(View view) {
        EditText number1 = (EditText) findViewById(R. id.editNum1);
        EditText number2 = (EditText) findViewById(R. id.editNum2);
        TextView result = (TextView) findViewById(R. id.result);
        //정수형 계산
        int n1 = Integer.parseInt(number1.getText().toString());
        int n2 = Integer.parseInt(number2.getText().toString());
        result.setText(Integer.toString(n1 * n2));
    }

    // / 버튼 (나눗셈)
    public void onClickDiv(View view) {
        EditText number1 = (EditText) findViewById(R. id.editNum1);
        EditText number2 = (EditText) findViewById(R. id.editNum2);
        TextView result = (TextView) findViewById(R. id.result);
        //정수형 계산
        double n1 = Double.parseDouble(number1.getText().toString());
        double n2 = Double.parseDouble(number2.getText().toString());

        result.setText(Double.toString(Math.round(n1/n2))); //반올림
    }
}