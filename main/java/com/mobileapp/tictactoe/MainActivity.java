package com.mobileapp.tictactoe;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView win;
//    declaring button;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, restart;
    //maing get the value of button declaring string
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;
//    initializing variable flag so i can put logic on click show X or O;
    int flag = 0;
//    to make condition that 3 of them are correct to win
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        restart = findViewById(R.id.restart);
        init();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

      restart.setOnClickListener(new View.OnClickListener(){
        @Override
          public void onClick(View view){
            restartGame();
        }
      });

    }

    private void init(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }


    public  void Check(View view){
//        typecasting view in Button type
        Button btnCurrent = (Button) view;
        if (btnCurrent.getText().toString().equals("")){
        count ++;
//    to check button is clicked or not
//        shuru me to zero hogi to x ajaega or flag ki value 1 hojae gi
            if(flag==0){
                btnCurrent.setText("X");
                btnCurrent.setTextColor(getResources().getColor(R.color.red));
                flag=1;
            }else{
//            ab flag ki value 1 hai to 0 aaega or flag ki value 0 krddeinge
                btnCurrent.setText("O");
                btnCurrent.setTextColor(getResources().getColor(R.color.blue));
                flag=0;
            }

//        wining decision kam se kam 5th turn k baad hoga islie count ko hm 4 se bara leinge;
            if (count > 4) {

//            getting values
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();

                win = findViewById(R.id.winner);

//            Conditions
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    win.setText("Winner is: " + b1);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    win.setText("Winner is: " + b4);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b7.equals(b8) && b7.equals(b8) && !b7.equals("")) {
                    win.setText("Winner is: " + b7);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    win.setText("Winner is: " + b1);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    win.setText("Winner is: " + b2);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    win.setText("Winner is: " + b3);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    win.setText("Winner is: " + b1);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                }
                else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    win.setText("Winner is: " + b3);
                    Toast.makeText(this, "Congatulation", Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (count==9 || !b1.equals("") && !b2.equals("") && !b3.equals("") && !b4.equals("") && !b5.equals("") && !b6.equals("") && !b7.equals("") && !b8.equals("") && !b9.equals("")) {
                    win.setText("Game is Drawn" );
                    Toast.makeText(this, "Game is Drawn", Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }
    }


    public  void newGame(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Reset the buttons and game state after the delay
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                win.setText("");

                // Reset flags and counters
                if (flag == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
                count = 0;
            }

        },2000);
    }

    public  void restartGame(){
                // Reset the buttons and game state after the delay
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                win.setText("");

                // Reset flags and counters
                if (flag == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
                count = 0;
            }

}
