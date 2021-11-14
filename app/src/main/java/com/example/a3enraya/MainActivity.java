package com.example.a3enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    Button btn0_0;
    Button btn0_1;
    Button btn0_2;
    Button btn1_0;
    Button btn1_1;
    Button btn1_2;
    Button btn2_0;
    Button btn2_1;
    Button btn2_2;
    Button btnReset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);
        btn0_0 = findViewById(R.id.btn0_0);
        btn0_1 = findViewById(R.id.btn0_1);
        btn0_2 = findViewById(R.id.btn0_2);
        btn1_0 = findViewById(R.id.btn1_0);
        btn1_1 = findViewById(R.id.btn1_1);
        btn1_2 = findViewById(R.id.btn1_2);
        btn2_0 = findViewById(R.id.btn2_0);
        btn2_1 = findViewById(R.id.btn2_1);
        btn2_2 = findViewById(R.id.btn2_2);
        btnReset = findViewById(R.id.btnReset);

    }

    private static List<String> x = new ArrayList<>();
    private static List<String> o = new ArrayList<>();

    private static int contTurnos = 1;



    private void btn0_0_Click()
    {
        turno("0.0");

        evaluarTurno();
    }

    private void btn1_0_Click()
    {
        turno("1.0");
        evaluarTurno();


    }

    private void btn2_0_Click()
    {
        turno("2.0");
        evaluarTurno();

    }

    private void btn0_1_Click()
    {
        turno("0.1");
        evaluarTurno();

    }

    private void btn1_1_Click()
    {
        turno("1.1");
        evaluarTurno();

    }

    private void btn2_1_Click()
    {
        turno("2.1");
        evaluarTurno();

    }

    private void btn0_2_Click()
    {
        turno("0.2");
        evaluarTurno();

    }

    private void btn1_2_Click()
    {
        turno("1.2");
        evaluarTurno();

    }

    private void btn2_2_Click()
    {
        turno("2.2");
        evaluarTurno();

    }

    public void turno(String boton)
    {
        String turno = "";
        if (contTurnos % 2 == 0)
        {
            turno = "o";
        } else
        {
            turno = "x";
        }

        contTurnos++;

        switch (boton)
        {
            case "0.0":
                if (turno.equals("o"))
                {
                    btn0_0.setText("o");
                    o.add(boton);
                } else
                {
                    btn0_0.setText("x");
                    x.add(boton);
                }
                btn0_0.setEnabled(false);
                break;

            case "0.1":
                if (turno.equals("o"))
                {
                    btn0_1.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn0_1.setText("x");
                    x.add(boton);


                }
                btn0_1.setEnabled(false);

                break;

            case "0.2":
                if (turno.equals("o"))
                {
                    btn0_2.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn0_2.setText("x");
                    x.add(boton);


                }
                btn0_2.setEnabled(false);

                break;

            case "1.0":
                if (turno.equals("o"))
                {
                    btn1_0.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn1_0.setText("x");
                    x.add(boton);


                }
                btn1_0.setEnabled(false);

                break;

            case "1.1":
                if (turno.equals("o"))
                {
                    btn1_1.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn1_1.setText("x");
                    x.add(boton);


                }
                btn1_1.setEnabled(false);

                break;

            case "1.2":
                if (turno.equals("o"))
                {
                    btn1_2.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn1_2.setText("x");
                    x.add(boton);


                }
                btn1_2.setEnabled(false);

                break;

            case "2.0":
                if (turno.equals("o"))
                {
                    btn2_0.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn2_0.setText("x");
                    x.add(boton);


                }
                btn2_0.setEnabled(false);

                break;

            case "2.1":
                if (turno.equals("o"))
                {
                    btn2_1.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn2_1.setText("x");
                    x.add(boton);


                }
                btn2_1.setEnabled(false);

                break;

            case "2.2":
                if (turno.equals("o"))
                {
                    btn2_2.setText("o");
                    o.add(boton);


                }
                else
                {
                    btn2_2.setText("x");
                    x.add(boton);


                }
                btn2_2.setEnabled(false);

                break;


        }

    }

    private void btnReset_Click()
    {
        contTurnos = 1;
        btn0_0.setEnabled(true);
        btn1_1.setEnabled(true);
        btn2_2.setEnabled(true);
        btn0_1.setEnabled(true);
        btn0_2.setEnabled(true);
        btn1_0.setEnabled(true);
        btn2_0.setEnabled(true);
        btn2_1.setEnabled(true);
        btn1_2.setEnabled(true);

        btn0_0.setText("");
        btn1_1.setText("");
        btn2_2.setText("");
        btn0_1.setText("");
        btn0_2.setText("");
        btn1_0.setText("");
        btn2_0.setText("");
        btn2_1.setText("");
        btn1_2.setText("");

        tvResultado.setText("");

        x.clear();
        o.clear();
    }

    private void evaluarTurno()
    {

        System.out.println("O:");

        for (int i = 0; i < o.size(); i++) {
            System.out.print(o.get(i) + ", ");
        }
        System.out.println(" ");
        System.out.println("X:");

        for (int i = 0; i < x.size(); i++)
        {
            System.out.print(x.get(i) + ", ");

        }


        if (x.contains("0.0") && x.contains("1.1") && x.contains("2.2") || (x.contains("2.0") && x.contains("1.1") && x.contains("0.2")) ||
                (x.contains("0.0") && x.contains("0.1") && x.contains("0.2")) || (x.contains("1.0") && x.contains("1.1") && x.contains("1.2")) || (x.contains("2.0") && x.contains("2.1") && x.contains("2.2")) ||
                (x.contains("0.0") && x.contains("1.0") && x.contains("2.0")) || (x.contains("0.1") && x.contains("1.1") && x.contains("2.1")) || (x.contains("0.2") && x.contains("1.2") && x.contains("2.2"))) {
            declararVictoria();
            tvResultado.setText(R.string.victoriaX);
        } else {
            if ((o.contains("0.0") && o.contains("1.1") && o.contains("2.2")) || (o.contains("2.0") && o.contains("1.1") && o.contains("0.2")) ||
                    (o.contains("0.0") && o.contains("0.1") && o.contains("0.2")) || (o.contains("1.0") && o.contains("1.1") && o.contains("1.2")) || (o.contains("2.0") && o.contains("2.1") && o.contains("2.2")) ||
                    (o.contains("0.0") && o.contains("1.0") && o.contains("2.0")) || (o.contains("0.1") && o.contains("1.1") && o.contains("2.1")) || (o.contains("0.2") && o.contains("1.2") && o.contains("2.2"))) {
                declararVictoria();
                tvResultado.setText(R.string.victoriaO);
            } else if (contTurnos == 10) {
                declararVictoria();
                tvResultado.setText(R.string.empate);
            }
        }





    }

    private void declararVictoria()
    {
        btn0_0.setEnabled(false);
        btn1_1.setEnabled(false);
        btn2_2.setEnabled(false);
        btn0_1.setEnabled(false);
        btn0_2.setEnabled(false);
        btn1_0.setEnabled(false);
        btn2_0.setEnabled(false);
        btn2_1.setEnabled(false);
        btn1_2.setEnabled(false);
    }
}