package com.alexis.prueva;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;
    private Context context;
    private Object text;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1 =(EditText) findViewById(R.id.val1txt);
        val2 =(EditText) findViewById(R.id.val2txt);*/
    }
  /*  public void suma (View view)
    {
        int res=0;
        String valor1s = val1.getText().toString();
        String valor2s = val2.getText().toString();
        if(valor1s.isEmpty()||valor2s.isEmpty())
        {
            if(valor1s.isEmpty())
            val1.setError("Valor no ingresado");
            if(valor2s.isEmpty())
            val2.setError("valor no ingresado");

        }else {

            int valor1i = Integer.valueOf(valor1s);
            int valor2i = Integer.valueOf(valor2s);
            res = valor1i + valor2i;
        }
        Toast.makeText(context: this, text:"La suma es:"+ res, Toast.LENGTH_LONG).show();

    }
    public void resta(View view, Context context, Object text)
    {
        int res=0;
        String valor1s = val1.getText().toString();
        String valor2s = val2.getText().toString();
        if(valor1s.isEmpty()||valor2s.isEmpty())
        {
            if(valor1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(valor2s.isEmpty())
                val2.setError("valor no ingresado");

        }else {

            int valor1i = Integer.valueOf(valor1s);
            int valor2i = Integer.valueOf(valor2s);
            res = valor1i - valor2i;
        }
        Toast.makeText(context: this, text:"La resta es:"+ res, Toast.LENGTH_LONG).show();

    }
    public void multiplicacion (View view)
    {
        int res=0;
        String valor1s = val1.getText().toString();
        String valor2s = val2.getText().toString();
        if(valor1s.isEmpty()||valor2s.isEmpty())
        {
            if(valor1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(valor2s.isEmpty())
                val2.setError("valor no ingresado");

        }else {

            int valor1i = Integer.valueOf(valor1s);
            int valor2i = Integer.valueOf(valor2s);
            res = valor1i * valor2i;
        }
        Toast.makeText(context: this, text:"La multiplicacion es:"+ res, Toast.LENGTH_LONG).show();

    }
    public void divicion (View view)
    {
        int res=0;
        String valor1s = val1.getText().toString();
        String valor2s = val2.getText().toString();
        if(valor1s.isEmpty()||valor2s.isEmpty())
        {
            if(valor1s.isEmpty())
                val1.setError("Valor no ingresado");
            if(valor2s.isEmpty())
                val2.setError("valor no ingresado");

        }else {

            int valor1i = Integer.valueOf(valor1s);
            int valor2i = Integer.valueOf(valor2s);
            res = valor1i / valor2i;
        }
        Toast.makeText(context: this, text: "La divicion es:"+ res, Toast.LENGTH_LONG).show();

    }*/
}
