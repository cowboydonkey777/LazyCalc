package com.example.lazycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator();
    }

    public void calculator(){
        final TextView calcBox = (TextView) findViewById(R.id.textView);
        final String[] calcText = {""};

        Button btnAC = (Button) findViewById(R.id.btnAC);
        Button btnNegPos = (Button) findViewById(R.id.btnNegPos);
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        Button btnDot = (Button) findViewById(R.id.btnDot);
        Button btnEqual = (Button) findViewById(R.id.btnEqual);
        Button btnMod = (Button) findViewById(R.id.btnMod);
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        Button btnPlus = (Button) findViewById(R.id.btnPlus);
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);


        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = "";
                calcBox.setText(calcText[0]);
            }
        });

        btnNegPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" / ");
                calcBox.setText(calcText[0]);
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" . ");
                calcBox.setText(calcText[0]);

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" = ");
                calcBox.setText(calcText[0]);

            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" % ");
                calcBox.setText(calcText[0]);

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" * ");
                calcBox.setText(calcText[0]);

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" + ");
                calcBox.setText(calcText[0]);

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat(" - ");
                calcBox.setText(calcText[0]);

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("0");
                calcBox.setText(calcText[0]);

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("1");
                calcBox.setText(calcText[0]);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("2");
                calcBox.setText(calcText[0]);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("3");
                calcBox.setText(calcText[0]);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("4");
                calcBox.setText(calcText[0]);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("5");
                calcBox.setText(calcText[0]);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("6");
                calcBox.setText(calcText[0]);

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("7");
                calcBox.setText(calcText[0]);

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("8");
                calcBox.setText(calcText[0]);

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcText[0] = calcText[0].concat("9");
                calcBox.setText(calcText[0]);

            }
        });
    }

}
