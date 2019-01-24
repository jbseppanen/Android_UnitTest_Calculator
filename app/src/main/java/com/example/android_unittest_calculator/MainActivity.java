package com.example.android_unittest_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "ClickingTag";
    Calculator calculator;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator("");
        textView = findViewById(R.id.text_display);
    }

    public void userClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();
        Log.i(TAG, "userClick: " + buttonText);

        if (Calculator.isDigitsOnly(buttonText)) {
            calculator.addDigit(buttonText);
        } else if (Arrays.asList(Calculator.ALLOWED_SYMBOLS).contains(buttonText)) {

        } else {
            switch (buttonText) {
                case ".":

                case "=":

                case "CLR":
                    calculator.clear();
            }
        }
        textView.setText(calculator.displayString);
    }
}
