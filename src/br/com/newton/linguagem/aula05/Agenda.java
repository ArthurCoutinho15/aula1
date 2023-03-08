package br.com.newton.linguagem.aula05;
import java.util.Scanner;
public class Agenda {
    public static void main(String[] args) {

        Contato contato = new Contato();
        Telefone telefone = new Telefone();
        telefone.contato = contato;

        contato.nome = "Arthur";
        contato.numero = "15151515";

        telefone.marca = "Iphone";
        telefone.cor = "Preto";

        telefone.Tocar("Pagode");




        System.out.println(telefone.contato.nome);
        }
    }



