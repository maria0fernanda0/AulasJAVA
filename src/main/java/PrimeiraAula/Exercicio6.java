package PrimeiraAula;

import java.util.*;
public class Exercicio6{

public static void main (String args[]){

    int numeroDia;
    String nomeDia;

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um número de 1 à 7:");
    numeroDia = entrada.nextInt();

    switch (numeroDia){
        case 1: nomeDia = "Domingo"; break;
        case 2 : nomeDia = "Segunda-feira"; break;
        case 3 : nomeDia = "Terça-feira"; break;
        case 4: nomeDia = "Quarta-feira"; break;
        case 5: nomeDia = "Quinta-feira"; break;
        case 6: nomeDia = "Sexta-feira"; break;
        case 7: nomeDia = "Sábado"; break;
        default: nomeDia = "Dia inválido";
    }

    System.out.println("O dia da semana é: " + nomeDia);
}
}
