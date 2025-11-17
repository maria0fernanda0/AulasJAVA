package PrimeiraAula.Atividades;

public class Atividade1 {

    /*Faça um programa que solicite dois numeros inteiros e exiba soma, subtração, divisao e multiplicação entre eles*/

    public static void main (String[] args ){
        int numero1 = 17;
        int numero2 = 15;

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        System.out.println("Temos o número " + numero1 + " e o número " + numero2);
        System.out.println("sua soma é igual: " + soma);
        System.out.println("sua subtração é igual: " + subtracao);
        System.out.println("sua multiplicação é igual: " + multiplicacao);
        System.out.println("sua divisão é igual: " + divisao);
    }


}
