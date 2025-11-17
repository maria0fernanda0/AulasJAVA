package PrimeiraAula;
import java.util.*;
public class Exercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha sua tabuada: ");
        int numeroEscolhido = entrada.nextInt();

        for (int n = 0; n <= 10; n++){
            System.out.println(numeroEscolhido + " x " + n + " = " + (numeroEscolhido * n));
        }
    }
}
