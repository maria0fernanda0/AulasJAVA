package comandosRepeticao;

public class DoWhile {
    public static void main(String[] args) {


        int i = 1;  /*inicializaçaõ*/

        do { /*do = faça.*/
            System.out.println(i); /*faça: exiba a variável i, adicionando de 1 em 1*/
            i++;
        } while (i <= 50);  /*while = enquanto*/
        /*enquanto = for menor ou igual a 50*/


        int n = 0;

        do {
            System.out.println(n);
            n+=2;
        }while (n <= 200);

    }

}
