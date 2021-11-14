package com.example.a3enraya;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre1;
    EditText txtNombre2;
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
    RelativeLayout rlFondo;
    RadioButton rdbtnIA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre1 = findViewById(R.id.txtNombre1);
        txtNombre2 = findViewById(R.id.txtNombre2);
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
        rlFondo = findViewById(R.id.rlFondo);
        rdbtnIA = findViewById(R.id.rdbtnIA);

        declararVictoria();

        rlFondo.setBackgroundColor(getResources().getColor(R.color.blue));

    }

    Random rd = new Random();

    List<String> x = new ArrayList<>();
    List<String> o = new ArrayList<>();
    List<String> btnUsados = new ArrayList<>();
    List<String> btnPosibles = new ArrayList<>();
    private static Boolean acabado = false;
    private static  boolean iaActivated = false;

    private static int contTurnos = 1;
    private static int centinelaReset = 0;

    String nombreX = "";
    String nombreO = "";

    public void btn0_0_Click(View view)
    {
        turno("0.0");

        evaluarTurno();

        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn1_0_Click(View view)
    {
        turno("1.0");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }

    }

    public void btn2_0_Click(View view)
    {
        turno("2.0");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn0_1_Click(View view)
    {
        turno("0.1");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn1_1_Click(View view)
    {
        turno("1.1");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn2_1_Click(View view)
    {
        turno("2.1");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn0_2_Click(View view)
    {
        turno("0.2");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn1_2_Click(View view)
    {
        turno("1.2");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void btn2_2_Click(View view)
    {
        turno("2.2");
        evaluarTurno();
        if (iaActivated) {
            turno(maquina());
            evaluarTurno();
        }
    }

    public void turno(String boton)
    {
        String turno;

        if (contTurnos % 2 == 0)
        {
            turno = "o";
            if (!iaActivated) {
                tvResultado.setText("Turno " + nombreX);
            }

            rlFondo.setBackgroundColor(getResources().getColor(R.color.blue));
        } else
        {
            turno = "x";
            if (!iaActivated) {
                tvResultado.setText("Turno " + nombreO);
            }

            rlFondo.setBackgroundColor(getResources().getColor(R.color.red));

        }

        contTurnos++;

        btnUsados.add(boton);

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

                default:

                break;

        }

    }

    public void btnReset_Click(View view)
    {
        if (centinelaReset == 0) {
            nombreX = txtNombre1.getText().toString();
            if (nombreX.length() == 0) {
                nombreX = "x";
            }

            nombreO = txtNombre2.getText().toString();
            if (nombreO.length() == 0) {
                nombreO = "o";
            }

            if (rdbtnIA.isChecked()) {
                iaActivated = true;
            }
            btnPosibles.add("0.0");
            btnPosibles.add("1.0");
            btnPosibles.add("2.0");
            btnPosibles.add("0.1");
            btnPosibles.add("1.1");
            btnPosibles.add("2.1");
            btnPosibles.add("0.2");
            btnPosibles.add("1.2");
            btnPosibles.add("2.2");

            txtNombre1.setEnabled(false);
            txtNombre2.setEnabled(false);
            rdbtnIA.setEnabled(false);
            btnReset.setText(R.string.reiniciar);
            centinelaReset++;
        } else {
            contTurnos = 1;


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
            btnUsados.clear();
            acabado = false;
            rlFondo.setBackgroundColor(getResources().getColor(R.color.blue));

        }

        if (!iaActivated) {
            tvResultado.setText("Turno " + nombreX);
        }

        btn0_0.setEnabled(true);
        btn1_1.setEnabled(true);
        btn2_2.setEnabled(true);
        btn0_1.setEnabled(true);
        btn0_2.setEnabled(true);
        btn1_0.setEnabled(true);
        btn2_0.setEnabled(true);
        btn2_1.setEnabled(true);
        btn1_2.setEnabled(true);
    }

    public void evaluarTurno()
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
            tvResultado.setText("GANA " + nombreX.toUpperCase());
            manageBlinkEffect(getResources().getColor(R.color.blue));

        } else {
            if ((o.contains("0.0") && o.contains("1.1") && o.contains("2.2")) || (o.contains("2.0") && o.contains("1.1") && o.contains("0.2")) ||
                    (o.contains("0.0") && o.contains("0.1") && o.contains("0.2")) || (o.contains("1.0") && o.contains("1.1") && o.contains("1.2")) || (o.contains("2.0") && o.contains("2.1") && o.contains("2.2")) ||
                    (o.contains("0.0") && o.contains("1.0") && o.contains("2.0")) || (o.contains("0.1") && o.contains("1.1") && o.contains("2.1")) || (o.contains("0.2") && o.contains("1.2") && o.contains("2.2"))) {
                declararVictoria();
                tvResultado.setText("GANA " + nombreO.toUpperCase());
                manageBlinkEffect(getResources().getColor(R.color.red));

            } else if (contTurnos == 10) {
                declararVictoria();
                tvResultado.setText("EMPATE");
                manageBlinkEffect(getResources().getColor(R.color.yellow));

            }
        }





    }

    private String maquina()
    {
        String decision = "";
        int btnSelect =0;
        Boolean repetido = true;
        List<String>btnIntentados = new ArrayList<>();
        
        if (!btnUsados.contains("1.1") && !btnUsados.contains("1.0") && !btnUsados.contains("0.1") && !btnUsados.contains("2.1") && !btnUsados.contains("1.2"))
        {
            decision = "1.1";
        }
        else if ((o.contains("0.0") && o.contains("1.1") && !btnUsados.contains("2.2")))
        {
            decision = "2.2";
        }
        else if ((o.contains("0.0") && !btnUsados.contains("1.1") && o.contains("2.2")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("0.0") && o.contains("1.1") && o.contains("2.2")))
        {
            decision = "0.0";
        }
        else if ((o.contains("2.0") && o.contains("1.1") && !btnUsados.contains("0.2")))
        {
            decision = "0.2";
        }
        else if ((o.contains("2.0") && !btnUsados.contains("1.1") && o.contains("0.2")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("2.0") && o.contains("1.1") && o.contains("0.2")))
        {
            decision = "2.0";
        }
        else if ((o.contains("0.0") && o.contains("0.1") && !btnUsados.contains("0.2")))
        {
            decision = "0.2";
        }
        else if ((o.contains("0.0") && !btnUsados.contains("0.1") && o.contains("0.2")))
        {
            decision = "0.1";
        }
        else if ((!btnUsados.contains("0.0") && o.contains("0.1") && o.contains("0.2")))
        {
            decision = "0.0";
        }
        else if ((o.contains("1.0") && o.contains("1.1") && !btnUsados.contains("1.2")))
        {
            decision = "1.2";
        }
        else if ((o.contains("1.0") && !btnUsados.contains("1.1") && o.contains("1.2")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("1.0") && o.contains("1.1") && o.contains("1.2")))
        {
            decision = "1.0";
        }
        else if ((o.contains("2.0") && o.contains("2.1") && !btnUsados.contains("2.2")))
        {
            decision = "2.2";
        }
        else if ((o.contains("2.0") && !btnUsados.contains("2.1") && o.contains("2.2")))
        {
            decision = "2.1";
        }
        else if ((!btnUsados.contains("2.0") && o.contains("2.1") && o.contains("2.2")))
        {
            decision = "2.0";
        }
        else if ((o.contains("0.0") && o.contains("1.0") && !btnUsados.contains("2.0")))
        {
            decision = "2.0";
        }
        else if ((o.contains("0.0") && !btnUsados.contains("1.0") && o.contains("2.0")))
        {
            decision = "1.0";
        }
        else if ((!btnUsados.contains("0.0") && o.contains("1.0") && o.contains("2.0")))
        {
            decision = "0.0";
        }
        else if ((o.contains("0.1") && o.contains("1.1") && !btnUsados.contains("2.1")))
        {
            decision = "2.1";
        }
        else if ((o.contains("0.1") && !btnUsados.contains("1.1") && o.contains("2.1")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("0.1") && o.contains("1.1") && o.contains("2.1")))
        {
            decision = "0.1";
        }
        else if ((o.contains("0.2") && o.contains("1.2") && !btnUsados.contains("2.2")))
        {
            decision = "2.2";
        }
        else if ((o.contains("0.2") && !btnUsados.contains("1.2") && o.contains("2.2")))
        {
            decision = "1.2";
        }
        else if ((!btnUsados.contains("0.2") && o.contains("1.2") && o.contains("2.2")))
        {
            decision = "0.2";
        }
        else if ((x.contains("0.0") && x.contains("0.1") && !btnUsados.contains("0.2")))
        {
            decision = "0.2";
        }
        else if ((x.contains("0.0") && !btnUsados.contains("0.1") && x.contains("0.2")))
        {
            decision = "0.1";
        }
        else if ((!btnUsados.contains("0.0") && x.contains("0.1") && x.contains("0.2")))
        {
            decision = "0.0";
        }
        else if ((x.contains("1.0") && x.contains("1.1") && !btnUsados.contains("1.2")))
        {
            decision = "1.2";
        }
        else if ((x.contains("1.0") && !btnUsados.contains("1.1") && x.contains("1.2")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("1.0") && x.contains("1.1") && x.contains("1.2")))
        {
            decision = "1.0";
        }
        else if ((x.contains("2.0") && x.contains("2.1") && !btnUsados.contains("2.2")))
        {
            decision = "2.2";
        }
        else if ((x.contains("2.0") && !btnUsados.contains("2.1") && x.contains("2.2")))
        {
            decision = "2.1";
        }
        else if ((!btnUsados.contains("2.0") && x.contains("2.1") && x.contains("2.2")))
        {
            decision = "2.0";
        }
        else if ((x.contains("0.0") && x.contains("1.0") && !btnUsados.contains("2.0")))
        {
            decision = "2.0";
        }
        else if ((x.contains("0.0") && !btnUsados.contains("1.0") && x.contains("2.0")))
        {
            decision = "1.0";
        }
        else if ((!btnUsados.contains("0.0") && x.contains("1.0") && x.contains("2.0")))
        {
            decision = "0.0";
        }
        else if ((x.contains("0.1") && x.contains("1.1") && !btnUsados.contains("2.1")))
        {
            decision = "2.1";
        }
        else if ((x.contains("0.1") && !btnUsados.contains("1.1") && x.contains("2.1")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("0.1") && x.contains("1.1") && x.contains("2.1")))
        {
            decision = "0.1";
        }
        else if ((x.contains("0.2") && x.contains("1.2") && !btnUsados.contains("2.2")))
        {
            decision = "2.2";
        }
        else if ((x.contains("0.2") && !btnUsados.contains("1.2") && x.contains("2.2")))
        {
            decision = "1.2";
        }
        else if ((!btnUsados.contains("0.2") && x.contains("1.2") && x.contains("2.2")))
        {
            decision = "0.2";
        }
        else if (x.contains("1.1") && !btnUsados.contains("0.0"))
        {
            decision = "0.0";
        }
        else if (x.contains("1.1") && !btnUsados.contains("2.0"))
        {
            decision = "2.0";
        }
        else if (x.contains("1.1") && !btnUsados.contains("0.2"))
        {
            decision = "0.2";
        }
        else if (x.contains("1.1") && !btnUsados.contains("2.2"))
        {
            decision = "2.2";
        }
        else if ((x.contains("0.0") && x.contains("1.1") && !btnUsados.contains("2.2")))
        {
            decision = "2.2";
        }
        else if ((x.contains("0.0") && !btnUsados.contains("1.1") && x.contains("2.2")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("0.0") && x.contains("1.1") && x.contains("2.2")))
        {
            decision = "0.0";
        }
        else if ((x.contains("2.0") && x.contains("1.1") && !btnUsados.contains("0.2")))
        {
            decision = "0.2";
        }
        else if ((x.contains("2.0") && !btnUsados.contains("1.1") && x.contains("0.2")))
        {
            decision = "1.1";
        }
        else if ((!btnUsados.contains("2.0") && x.contains("1.1") && x.contains("0.2")))
        {
            decision = "2.0";
        }
        else if (x.contains("0.0") && x.contains("2.2") && !btnUsados.contains("1.0"))
        {
            decision = "1.0";
        }
        else if (x.contains("0.0") && x.contains("2.2") && !btnUsados.contains("2.1"))
        {
            decision = "2.1";
        }
        else if (x.contains("0.0") && x.contains("2.2") && !btnUsados.contains("0.1"))
        {
            decision = "0.1";
        }
        else if (x.contains("0.0") && x.contains("2.2") && !btnUsados.contains("1.2"))
        {
            decision = "1.2";
        }
        else if (x.contains("2.0") && x.contains("0.2") && !btnUsados.contains("1.0"))
        {
            decision = "1.0";
        }
        else if (x.contains("2.0") && x.contains("0.2") && !btnUsados.contains("2.1"))
        {
            decision = "2.1";
        }
        else if (x.contains("2.0") && x.contains("0.2") && !btnUsados.contains("0.1"))
        {
            decision = "0.1";
        }
        else if (x.contains("2.0") && x.contains("0.2") && !btnUsados.contains("1.2"))
        {
            decision = "1.2";
        }else
        {


            do
            {
                btnSelect = rd.nextInt(9 - 0) + 0;
                System.out.println(" ");
                System.out.println("id decision maquina: " + btnSelect);
                System.out.println(" ");

                decision = btnPosibles.get(btnSelect);
                System.out.println(" ");
                System.out.println("decision maquina: " + decision);
                System.out.println(" ");
                if (!btnIntentados.contains(decision))
                {
                    btnIntentados.add(decision);

                }

                if (btnIntentados.size() >= 9)
                {
                    acabado = true;
                    decision = "";

                }

                if (!btnUsados.contains(decision) || btnIntentados.size() >= 9)
                {
                    repetido = false;
                }

                System.out.println("Botones intentados:");

                for (int i = 0; i < btnIntentados.size(); i++)
                {
                    System.out.println(btnIntentados.get(i) + ", ");

                }
                System.out.println(" ");

            } while (repetido);
        }


        return decision;

    }

    public void declararVictoria()
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

    @SuppressLint("WrongConstant")
    private void manageBlinkEffect(int colorFinal) {
        ObjectAnimator anim = ObjectAnimator.ofInt(rlFondo, "backgroundColor", colorFinal, getResources().getColor(R.color.white),
                colorFinal);
        anim.setDuration(350);
        anim.setEvaluator(new ArgbEvaluator());

        anim.setRepeatCount(1);
        anim.start();

    }
}