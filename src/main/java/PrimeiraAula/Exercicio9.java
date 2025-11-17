package PrimeiraAula;

public class Exercicio9 {
    public static void main(String[] args) {

        int n;

        for (n = 0; n <= 100; n++){
            System.out.println(n);
        }

        /*laço de repeticão, primeiro incremento é de onde se inicia a contagem, segundo até onde a contagem vai (condiçao de término), a terceira é de quantos em quantos numeros vai adicionando*/

        for (n = 0; n <= 100; n+=2){
            System.out.println(n);
        }

        /*nesse laço de repetição, o numero se inicia no 0, sua contagem é até 100, e ele vai contando de +=2 em +=2 */

        for (n = 1; n <= 100; n+=2){
            System.out.println(n);
        }

        /*Nesse acontece o mesmo, a diferença é que se inicia no 1, entao vai de 2 em 2 a partir do 1*/

        for (n = 0; n <= 100; n++){
            System.out.println("Frase número " + n);
        }

        /*nesse laço  acontece a contagem de um em um ate 100. com a diferença da frase que se repete 100 vezes, enquanto os numeros aumentam de 1 em 1*/
    }
}
