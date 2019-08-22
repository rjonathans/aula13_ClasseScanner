package br.com.digitalhouse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner pegandoDados = new Scanner(System.in);

        System.out.println("Digite seu  nome: ");
        String nome = pegandoDados.next();
        //pegando uma String .next()

        System.out.println("Digite sua idade:");
        int idade = pegandoDados.nextInt();
        //pegando uma int .nextInt()

        System.out.println("Olá "+nome+"\n");
        System.out.println("Sua idade é :"+idade);

    }
}
