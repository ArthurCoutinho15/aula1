package br.com.newton.linguagem.aula05;
import java.util.Scanner;
public class Telefone {

    public String marca;
    public String cor;
    Contato contato = new Contato();

    public void Tocar(String estilo){
        System.out.println("Tocando: " + estilo);

    }

    public void Ligar(Integer numero ) {
        if (cor == "preto" && ) {
            System.out.println("Ligando: " + numero);

        }
        else{
            System.out.println("Telefone não é preto");
        }
    }


    }



