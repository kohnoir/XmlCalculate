package com.example.xmlcalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnPoint;
    private Button btnC;
    private Button btnPlusMinus;
    private Button btnProcent;
    private Button btnPlus;
    private Button btnX;
    private Button btnMinus;
    private Button btnDivision;
    private  Button btnEqual;
    private  String line ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trener);
        init();
        writingString();
    }
    private  void init(){
        btn1 = findViewById(R.id.one);
        btn2 = findViewById(R.id.two);
        btn3 = findViewById(R.id.three);
        btn4 = findViewById(R.id.four);
        btn5 = findViewById(R.id.five);
        btn6 = findViewById(R.id.six);
        btn7 = findViewById(R.id.seven);
        btn8 = findViewById(R.id.eight);
        btn9 = findViewById(R.id.nine);
        btn0 = findViewById(R.id.zero);

        btnPoint = findViewById(R.id.point);
        btnC = findViewById(R.id.Ca);

        btnProcent = findViewById(R.id.percent);
        btnPlus = findViewById(R.id.plus);
        btnMinus = findViewById(R.id.minus);
        btnX = findViewById(R.id.X);
        btnDivision = findViewById(R.id.division);
        btnPlusMinus = findViewById(R.id.plus_minus);
        btnEqual = findViewById(R.id.equal);
    }
    private void writingString(){

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "1";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "2";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "3";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "4";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "5";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "6";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "7";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "8";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "9";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = line + "0";
                String outcome  = line;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(line);
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                line = "";
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText("");
                String outcome  ="";
                TextView textOutcome = findViewById(R.id.outcome);
                textOutcome.setText(outcome);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(line.matches("\\S*")){
                    line = line + " + ";
                    String outcome  = line;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(line.matches("\\d*")){
                    line = line + " - ";
                    String outcome  = line;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(line.matches("\\d*")){
                    line = line + " x ";
                    String outcome  = line;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }

            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(line.matches("\\d*")){
                    line = line + " ÷ ";
                    String outcome  = line;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }
            }
        });
        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(line.matches("\\d*")){
                    double chislo = Double.parseDouble(line);
                    chislo = chislo * (-1);
                    TextView textView = findViewById(R.id.ViewCalculate);
                    String outcome = String.valueOf(chislo);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите число", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] pointNumber = line.split(" ");
                if(pointNumber.length == 1 & line.matches("\\d*")){
                    line = line + ".";
                    String outcome  = line;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }else if(pointNumber.length == 3 & line.matches("\\.{2}")){
                    line = line + ".";
                    String outcome  = line;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(line);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] lineParts = line.split(" ");//Я хотел создать метод в методе но оказалось что это невозможно и так
                // как все вычисления завязаны на знаке равно я не могу вынести это в другой класс и проще просто продублировать вычисления
                if (lineParts.length == 3) {
                    if (!lineParts[0].matches("//D") & !lineParts[2].matches("//D")) {
                        double firstNumber = Double.parseDouble(lineParts[0]);
                        double secondNumber = Double.parseDouble(lineParts[2]);

                        line = line + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(line);
                        TextView textOutcome = findViewById(R.id.outcome);
                        textOutcome.setText(line);

                        if (lineParts[1].equals("x")) {
                            double outcome = firstNumber * secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("+")) {
                            double outcome = firstNumber + secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("-")) {
                            double outcome = firstNumber - secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("÷")) {
                            double outcome = firstNumber / secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        line = "";
                    } else if (!lineParts[0].matches("//D") & lineParts[2].matches("//D")) {
                        int doubleFirstNumber = Integer.parseInt(lineParts[0]);
                        double secondNumber = Double.parseDouble(lineParts[2]);

                        line = line + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(line);
                        TextView textOutcome = findViewById(R.id.outcome);
                        textOutcome.setText(line);

                        if (lineParts[1].equals("x")) {
                            double outcome = (double) doubleFirstNumber * secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("+")) {
                            double outcome = (double) doubleFirstNumber + secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("-")) {
                            double outcome = (double) doubleFirstNumber - secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("÷")) {
                            double outcome = (double) doubleFirstNumber / secondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        line = "";
                    } else if (lineParts[0].matches("//D") & !lineParts[2].matches("//D")) {
                        double firstNumber = Double.parseDouble(lineParts[0]);
                        int doubleSecondNumber = Integer.parseInt(lineParts[2]);

                        line = line + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(line);
                        TextView textOutcome = findViewById(R.id.outcome);
                        textOutcome.setText(line);

                        if (lineParts[1].equals("x")) {
                            double outcome = firstNumber * (double) doubleSecondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("+")) {
                            double outcome = firstNumber + (double) doubleSecondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("-")) {
                            double outcome = firstNumber - (double) doubleSecondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("÷")) {
                            double outcome = firstNumber / (double) doubleSecondNumber;
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        line = "";
                    } else {

                        line = line + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(line);
                        TextView textOutcome = findViewById(R.id.outcome);
                        textOutcome.setText(line);

                        if (lineParts[1].equals("x")) {
                            double outcome = (double) Integer.parseInt(lineParts[0]) * (double) Integer.parseInt(lineParts[2]);
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("+")) {
                            double outcome = (double) Integer.parseInt(lineParts[0]) + (double) Integer.parseInt(lineParts[2]);
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("-")) {
                            double outcome = (double) Integer.parseInt(lineParts[0]) - (double) Integer.parseInt(lineParts[2]);
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        if (lineParts[1].equals("÷")) {
                            double outcome = (double) Integer.parseInt(lineParts[0]) / (double) Integer.parseInt(lineParts[2]);
                            String stringOutcome = String.valueOf(outcome);
                            textOutcome.setText(stringOutcome);
                        }
                        line = "";
                    }
                }
            }
        });
        btnProcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(line.matches("\\d*")){
                    double chislo = Long.parseLong(line);
                    double procent = chislo / 100;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    String outcome = String.valueOf(procent);
                    TextView textOutcome = findViewById(R.id.outcome);
                    textOutcome.setText(outcome);
                    textView.setText(line);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите число", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
