package LacosRepeticao;
import java.util.*;
public class MediaFor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float nota;
        float soma = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Diga a sua nota");
            nota = entrada.nextFloat();

            soma += nota;
        }
        System.out.println("A soma das suas notas é: " + soma);
        System.out.println("A média das suas notas é: " + soma / 5);
    }
}
