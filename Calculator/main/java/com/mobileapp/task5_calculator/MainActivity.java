package com.mobileapp.task5_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double firstNum;
    String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        numbers button
        Button num0 = findViewById(R.id.num0);
        Button num1 = findViewById(R.id.num1);
        Button num2 = findViewById(R.id.num2);
        Button num3 = findViewById(R.id.num3);
        Button num4 = findViewById(R.id.num4);
        Button num5 = findViewById(R.id.num5);
        Button num6 = findViewById(R.id.num6);
        Button num7 = findViewById(R.id.num7);
        Button num8 = findViewById(R.id.num8);
        Button num9 = findViewById(R.id.num9);


//        special bbuttons
        Button on = findViewById(R.id.on);
        Button off = findViewById(R.id.off);
        Button ac = findViewById(R.id.ac);
        Button del = findViewById(R.id.del);
        Button div = findViewById(R.id.div);
        Button mul = findViewById(R.id.mul);
        Button sub = findViewById(R.id.sub);
        Button add = findViewById(R.id.add);
        Button point = findViewById(R.id.point);
        Button equal = findViewById(R.id.equal);

//        screen
        TextView screen = findViewById(R.id.screen);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ac.setOnClickListener(view -> {
            firstNum = 0;
            screen.setText("0");
        });

        off.setOnClickListener(view -> screen.setVisibility(View.GONE));
        on.setOnClickListener(view -> {
            screen.setVisibility(View.VISIBLE);
            screen.setText("0");
        });

        ArrayList<Button> numbers = new ArrayList<>();
        numbers.add(num0);
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);
        numbers.add(num5);
        numbers.add(num6);
        numbers.add(num7);
        numbers.add(num8);
        numbers.add(num9);

        for (Button b : numbers){
            b.setOnClickListener(view -> {
                if (!screen.getText().toString().equals("0")){
                    screen.setText(screen.getText().toString() + b.getText().toString());
                }
                else{
                    screen.setText(b.getText().toString());
                }
            });
        }

        ArrayList<Button> special = new ArrayList<>();
        special.add(div);
        special.add(mul);
        special.add(sub);
        special.add(add);

        for (Button b : special){
            b.setOnClickListener(view -> {
                firstNum = Double.parseDouble(screen.getText().toString());
                operation = b.getText().toString();
                screen.setText("0");
            });

        }

        del.setOnClickListener(view -> {
            String num = screen.getText().toString();
            if (num.length()>1){
                screen.setText(num.substring(0, num.length()-1));
            }else if (num.length() == 1 && !num.equals("0")){
                screen.setText("0");
            }
        });

        point.setOnClickListener(view -> {
            if (!screen.getText().toString().contains(".")){
                screen.setText(screen.getText().toString() + ".");
            }
        });

        equal.setOnClickListener(view -> {
            double secondNum = Double.parseDouble(screen.getText().toString());
            double result;

            switch (operation){
                case "/":
                    result = firstNum/secondNum;
                    break;

                case "*":
                    result = firstNum*secondNum;
                    break;

                case "-":
                    result = firstNum-secondNum;
                    break;

                case "+":
                    result = firstNum+secondNum;
                    break;

                default:
                    result = firstNum+secondNum;
            }
            screen.setText(String.valueOf(result));
            firstNum = result;
        });
    }
}




