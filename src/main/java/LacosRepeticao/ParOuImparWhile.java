package LacosRepeticao;
import java.util.*;
public class ParOuImparWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int i = 1;

        while (i <= 10) {

            System.out.println("Escolha 10 números: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            i++;
        }

        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
