package PrimeiraAula;
import java.util.Scanner;  /*esse import vai fazer com que o usuario que está mexendo no computador interaja com as perguntas e responda*/

public class Exercicio4 {
    public static void main(String []args){

        float altura;
        float peso;

        Scanner entrada = new Scanner(System.in); /*aqui se cria uma variavel de entrada na qual a importação scanner é chmamada, fazendo com que a informação seja pegada*/

        System.out.println("Insira sua altura:");
        altura = entrada.nextFloat();  /*a variavel de altura, que nao tem valor, passa a ter eu valor de acordo com o que voce escreve*/

        System.out.println("Insira seu peso:");
        peso = entrada.nextFloat(); /*aqui acontece a mesma coisa.*/


        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5){
            System.out.println("Você está abaixo do peso!");
        } else if (imc <= 24.9){
            System.out.println("Você tem o peso ideal!");
        } else if(imc <= 29.9){
            System.out.println("Voce está levemente acima do peso!");
        } else if (imc <= 34.9){
            System.out.println("Você tem obesidade grau I");
        } else if(imc <= 39.9){
            System.out.println("Você tem obesidade grau II (severa)");
        } else {
            System.out.println("Você tem obesidade grau III (mórbida)");
        }

    }
}
