package LacosRepeticao;

public class For {

    public static void main(String[] args) {

        /*preciso exibir numeros de um a 50*/

        for (int i = 1; i <= 50 ; i++ ){
            System.out.println(i);
        }

        /*preciso exibir os numeros até 200, mas só podem ser pares*/

        for (int n = 0; n <= 200; n+=2){
            System.out.println(n);
        }

        /*o +=2 significa que está adicionando de 2 em 2. o incremento naturalmente adiciona de 1 em 1. assim, se for +=3, vai ser adicionado de 3 em 3*/
    }
}

