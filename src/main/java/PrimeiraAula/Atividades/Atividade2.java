package PrimeiraAula.Atividades;
import java.util.*;
public class Atividade2 {

    /*Escreva  um programa que leia o raio de um círculo e calcule sua área e perímetro*/

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        /*aqui pede o tamanho do raio*/
        System.out.println("Digite o raio do círculo:");
        double raio = entrada.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;
        /*aqui fica a conta de como se calcula a area e perimetro do raio que voce escolheu*/

        System.out.println("área: " + area);
        System.out.println("Perímetro: " + perimetro);
    }
}


