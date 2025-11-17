package LacosRepeticao;
import java.util.*;
public class VerificarNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double i;
        System.out.println("Olá, escolha um número para a verificação: ");
        i = entrada.nextDouble();

        int pares = 0;
        int impares = 0;

        for (i = 0; i <= 10; i++) {
            System.out.println("Escolha o próximo número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
