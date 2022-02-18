package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void escolhaPedra (View view){
        this.escolhaJogador("pedra");

    }
    public void escolhaPapel (View view){
        this.escolhaJogador("papel");

    }
    public void escolhaTesoura (View view){
        this.escolhaJogador("tesoura");

    }
    public void escolhaJogador(String escolhaJogador){

        ImageView resultadoApp = findViewById(R.id.resultadoApp);
        TextView textResultado = findViewById(R.id.textResultado);


        int numero = new Random().nextInt(3);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String escolhaApp = opcoes[numero];


      switch (escolhaApp){
            case "pedra":
                resultadoApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                resultadoApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                resultadoApp.setImageResource(R.drawable.tesoura);
                break;
        }
            //App vencedor
        if  ((escolhaApp.equals("pedra") && escolhaJogador.equals("tesoura")) ||
            (escolhaApp.equals("papel") && escolhaJogador.equals("pedra")) ||
            (escolhaApp.equals("tesoura") && escolhaJogador.equals("papel"))){
            textResultado.setText("Você perdeu:( Tente novamente!");
        }//App perdedor
         else if ((escolhaApp.equals("papel") && escolhaJogador.equals("tesoura")) ||
                 (escolhaApp.equals("tesoura") && escolhaJogador.equals("pedra")) ||
                 (escolhaApp.equals("pedra") && escolhaJogador.equals("papel"))){
                 textResultado.setText("Você venceu! Quer tentar novamente?");
        }//Empate
         else if ((escolhaApp.equals("pedra") && escolhaJogador.equals("pedra")) ||
                 (escolhaApp.equals("papel") && escolhaJogador.equals("papel")) ||
                 (escolhaApp.equals("tesoura") && escolhaJogador.equals("tesoura"))){
                 textResultado.setText("Empate!! Quer tentar novamente?");
        }
    }
}