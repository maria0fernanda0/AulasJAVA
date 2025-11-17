package LacosRepeticao;

public class DoWhile {
    public static void main(String[] args) {

        /*preciso exibir numeros de um a 50*/

        int i =1;  /*inicialização*/

        while (i <= 50){ /*enquanto o i for for menor ou igual a 50,*/
            System.out.println(i);  /*exiba o i*/
            i++;  /*adicionando de 1 em 1*/
        }

        /*diferente do for, no while é necessário atribuir os valores e condições separadamente */

        int n = 0;

        while (n <= 200){
            System.out.println(n);
            n+=2;
        }
    }
}
