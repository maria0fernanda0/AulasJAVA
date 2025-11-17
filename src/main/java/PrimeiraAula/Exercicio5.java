package PrimeiraAula;

import java.util.Scanner;
public class Exercicio5 {
    public static void main(String args[]){

        float nota1;
        float nota2;
        float nota3;
        float nota4;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a nota do seu Primeiro Bimestre: ");
        nota1 = entrada.nextFloat();

        System.out.println("Insira a nota do seu Segundo Bimestre: ");
        nota2 = entrada.nextFloat();

        System.out.println("Insira a nota do seu Terceiro Bimestre: ");
        nota3 = entrada.nextFloat();

        System.out.println("Insira a nota do seu Quarto Bimestre: ");
        nota4 = entrada.nextFloat();



        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Sua média de notas foi: " + media);

        if (media >= 6){
            System.out.println("Você foi aprovado!");
        } else if (media >= 5){
            System.out.println("Você está de recuperação!");
        }else {
            System.out.println("Você foi reprovado!");
        }
    }
}
