package com.gabrielcarneiro.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        public void selecionadoPedra(View view){

            this.opcaoSelecionada("pedra");

        }

        public void selecionadoPapel(View view){
            this.opcaoSelecionada("papel");
        }

        public void selecionadoTesoura(View view){
            this.opcaoSelecionada("tesoura");
        }

        public void opcaoSelecionada (String opcaoSelecionada){

            ImageView imageResultado = findViewById(R.id.imageResultado);
            TextView textoResultado = findViewById(R.id.textResultado);

            System.out.println("Item clickado:" + opcaoSelecionada);
            int numero = new Random().nextInt(3);
            String[] opcoes = {"pedra", "papel", "tesoura"};
            String opcaoApp = opcoes[numero];

            switch(opcaoApp){
                case "pedra":
                    imageResultado.setImageResource(R.drawable.pedra);
                    break;


                case "papel":

                    imageResultado.setImageResource(R.drawable.papel);
                    break;


                case "teoura":

                    imageResultado.setImageResource(R.drawable.tesoura);
                    break;


            }


            if(opcaoSelecionada.equals(opcaoApp)){//empate
               textoResultado.setText("EMPATOU");

            }else if(
                  (opcaoSelecionada.equals("papel") && opcaoApp.equals("pedra")) ||
                  (opcaoSelecionada.equals("pedra") && opcaoApp.equals("tesoura"))||
                  (opcaoSelecionada.equals("tesoura") && opcaoApp.equals("papel"))
            ){//usuário venceu
                textoResultado.setText("Você venceu!");

            }else{//usuario perdeu
                textoResultado.setText("Você perdeu!");
            }

        }


}