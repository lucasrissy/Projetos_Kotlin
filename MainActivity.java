package com.example.conversor_de_moedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    EditText digiteovalor;
    Button botaoconverter;
    TextView text;
    //Aqui eu relaciono cada item do meu layout com uma "variável"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        digiteovalor = findViewById(R.id.DigiteoValor);
        botaoconverter = findViewById(R.id.converter);
        text = findViewById(R.id.Text);

        // aqui eu relacionei aquelas variáveis com os títulos daqueles itens do layout
        // Linkei tudo aqui, o próximo passo é atribuir as ações;

        botaoconverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //aqui vou atribuir uma ação quando clicar no botão
                //Ação: quero que ele leia o valor que eu atribuir e apresentar
                //o valor convertido no textview

                double reais = Double.parseDouble(digiteovalor.getText().toString());

                    //arredondando o valor double
                    //convertendo uma variavel string em double e armazenando numa variavel

                DecimalFormat arredondar = new DecimalFormat("#.##");
                double dolar = Double.parseDouble(arredondar.format( reais * 5.35));

                text.setText(String.valueOf(dolar)+"$");

                //imprimir o valor convertido no app
                //converter o valor de double para string

            }
        });
    }
}