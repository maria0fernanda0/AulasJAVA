package ParametrosFuncao;

import java.util.*;

public class Adicao {
    public static void main(String[] args) {

        int soma1 = soma(5, 8);
        int soma2 = adicao();
        int soma3 = soma2 + soma1;

        System.out.println(soma1);
        System.out.println(soma2);
        System.out.println(soma3);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int adicao(){
        return 3 + 4;
    }
}
