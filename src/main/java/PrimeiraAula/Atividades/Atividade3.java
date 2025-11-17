package PrimeiraAula.Atividades;
import java.util.*;
public class Atividade3 {

    /*crie um programa que leia a base e a altura de um triangulo e calcule sua área*/

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        /*variavel interativa*/

        double base;
        double altura;

        System.out.println("Digite a base do triângulo:");
        base = entrada.nextDouble();

        System.out.println("Digite a altura do triângulo:");
        altura = entrada.nextDouble();

        double area = base * altura / 2;

        System.out.println("A área do triângulo é:" + area);
    }
}
