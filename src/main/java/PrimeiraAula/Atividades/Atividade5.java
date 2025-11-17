package PrimeiraAula.Atividades;
import  java.util.*;
public class Atividade5 {


    /*Escreva um programa que leia o preço e um produto e a quantidade comprada, e calcule o valor total a ser pago com um desconto de 10% se a quantidade for mais que 10 unidades*/

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        float produto = 12.50f;
        float quantidade;

        System.out.println("Você está comprando um hotdog de R$12.50!");

        System.out.println("Escreva a quantidade de produtos que você pegou: ");
        quantidade = entrada.nextFloat();

        float total = produto * quantidade;

        if (quantidade > 10) {

            float desconto = total * 0.10f;
            total -= desconto;

            System.out.println("");
        }
    }
}