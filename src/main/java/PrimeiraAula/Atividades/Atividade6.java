package PrimeiraAula.Atividades;
import java.util.*;
public class Atividade6 {
    /*Crie um programa que leia um número inteiro e exiba se ele é par ou ímpar.*/

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número inteiro:");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {  /*o símbolo % é um operador de módulo que retorna o resto da divisão entre dois números
        10 % 2 = 0 (pq sobra 0)
        11 % 2 = 1 (pq sobra 1)*/
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

    }

}
