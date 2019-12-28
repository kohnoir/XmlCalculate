package com.example.xmlcalculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnPoint;
    Button btnC;
    Button btnPlusMinus;
    Button btnProcent;
    Button btnPlus;
    Button btnX;
    Button btnMinus;
    Button btnDivvision;
    Button btnEquall;
    String stroka ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zapisStroki();

    }
    private void zapisStroki(){
        btn1 = findViewById(R.id.One);
        btn2 = findViewById(R.id.Two);
        btn3 = findViewById(R.id.Three);
        btn4 = findViewById(R.id.Four);
        btn5 = findViewById(R.id.Five);
        btn6 = findViewById(R.id.Six);
        btn7 = findViewById(R.id.Seven);
        btn8 = findViewById(R.id.Eight);
        btn9 = findViewById(R.id.Nine);
        btn0 = findViewById(R.id.Zero);

        btnPoint = findViewById(R.id.Point);
        btnC = findViewById(R.id.Ca);

        btnProcent = findViewById(R.id.percent);
        btnPlus = findViewById(R.id.Plus);
        btnMinus = findViewById(R.id.Minus);
        btnX = findViewById(R.id.X);
        btnDivvision = findViewById(R.id.division);
        btnPlusMinus = findViewById(R.id.PlusMinus);
        btnEquall = findViewById(R.id.equall);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "1";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "2";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "3";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "4";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "5";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "6";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "7";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "8";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "9";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = stroka + "0";
                String vivod  = stroka;
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText(stroka);
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stroka = "";
                TextView textView = findViewById(R.id.ViewCalculate);
                textView.setText("");
                String vivod  ="";
                TextView textVivod = findViewById(R.id.Vivod);
                textVivod.setText(vivod);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stroka.matches("\\S*")){
                    stroka = stroka + " + ";
                    String vivod  = stroka;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                }

            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stroka.matches("\\d*")){
                    stroka = stroka + " - ";
                    String vivod  = stroka;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                }
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stroka.matches("\\d*")){
                    stroka = stroka + " x ";
                    String vivod  = stroka;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                }

            }
        });
        btnDivvision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stroka.matches("\\d*")){
                    stroka = stroka + " ÷ ";
                    String vivod  = stroka;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                }
            }
        });
        btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stroka.matches("\\d*")){
                    double chislo = Double.parseDouble(stroka);
                    chislo = chislo * (-1);
                    TextView textView = findViewById(R.id.ViewCalculate);
                    String vivod = String.valueOf(chislo);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
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
                String [] pointChisla = stroka.split(" ");
                if(pointChisla.length == 1 & stroka.matches("\\d*")){
                    stroka = stroka + ".";
                    String vivod  = stroka;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                }else if(pointChisla.length == 3 & stroka.matches("\\.{2}")){
                    stroka = stroka + ".";
                    String vivod  = stroka;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    textView.setText(stroka);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                }
            }
        });
        btnEquall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] kuskiStroki = stroka.split(" ");//Я хотел создать метод в методе но оказалось что это невозможно и так
                // как все вычисления завязаны на знаке равно я не могу вынести это в другой класс и проще просто продублировать вычисления
                if (kuskiStroki.length == 3) {
                    if (!kuskiStroki[0].matches("//D") & !kuskiStroki[2].matches("//D")) {
                        double PervoeChislo = Double.parseDouble(kuskiStroki[0]);
                        double VtoroeChislo = Double.parseDouble(kuskiStroki[2]);

                        stroka = stroka + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(stroka);
                        TextView textVivod = findViewById(R.id.Vivod);
                        textVivod.setText(stroka);

                        if (kuskiStroki[1].equals("x")) {
                            double vivod = PervoeChislo * VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("+")) {
                            double vivod = PervoeChislo + VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("-")) {
                            double vivod = PervoeChislo - VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("÷")) {
                            double vivod = PervoeChislo / VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        stroka = "";
                    } else if (!kuskiStroki[0].matches("//D") & kuskiStroki[2].matches("//D")) {
                        int doublePervoeChislo = Integer.parseInt(kuskiStroki[0]);
                        double PervoeChislo = doublePervoeChislo;
                        double VtoroeChislo = Double.parseDouble(kuskiStroki[2]);

                        stroka = stroka + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(stroka);
                        TextView textVivod = findViewById(R.id.Vivod);
                        textVivod.setText(stroka);

                        if (kuskiStroki[1].equals("x")) {
                            double vivod = PervoeChislo * VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("+")) {
                            double vivod = PervoeChislo + VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("-")) {
                            double vivod = PervoeChislo - VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("÷")) {
                            double vivod = PervoeChislo / VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        stroka = "";
                    } else if (kuskiStroki[0].matches("//D") & !kuskiStroki[2].matches("//D")) {
                        double PervoeChislo = Double.parseDouble(kuskiStroki[0]);
                        int doubleVtoroeChislo = Integer.parseInt(kuskiStroki[2]);
                        double VtoroeChislo = doubleVtoroeChislo;

                        stroka = stroka + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(stroka);
                        TextView textVivod = findViewById(R.id.Vivod);
                        textVivod.setText(stroka);

                        if (kuskiStroki[1].equals("x")) {
                            double vivod = PervoeChislo * VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("+")) {
                            double vivod = PervoeChislo + VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("-")) {
                            double vivod = PervoeChislo - VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("÷")) {
                            double vivod = PervoeChislo / VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        stroka = "";
                    } else {
                        int doublePervoeChislo = Integer.parseInt(kuskiStroki[0]);
                        double PervoeChislo = doublePervoeChislo;
                        int doubleVtoroeChislo = Integer.parseInt(kuskiStroki[2]);
                        double VtoroeChislo = doubleVtoroeChislo;

                        stroka = stroka + " =";
                        TextView textView = findViewById(R.id.ViewCalculate);
                        textView.setText(stroka);
                        TextView textVivod = findViewById(R.id.Vivod);
                        textVivod.setText(stroka);

                        if (kuskiStroki[1].equals("x")) {
                            double vivod = PervoeChislo * VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("+")) {
                            double vivod = PervoeChislo + VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("-")) {
                            double vivod = PervoeChislo - VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        if (kuskiStroki[1].equals("÷")) {
                            double vivod = PervoeChislo / VtoroeChislo;
                            String stringVivod = String.valueOf(vivod);
                            textVivod.setText(stringVivod);
                        }
                        stroka = "";
                    }
                }
            }
        });
        btnProcent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(stroka.matches("\\d*")){
                    double chislo = Long.parseLong(stroka);
                    double procent = chislo / 100;
                    TextView textView = findViewById(R.id.ViewCalculate);
                    String vivod = String.valueOf(procent);
                    TextView textVivod = findViewById(R.id.Vivod);
                    textVivod.setText(vivod);
                    textView.setText(stroka);
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Введите число", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}
