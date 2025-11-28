package ParametrosFuncao;

public class Multiplicacao {

    static void main(String[] args) {

        int multi1 = multiplicacao(5, 8);
        int multi2 = multi();
        int multi3 = multi() * multiplicacao(3, 70);


        System.out.println(multi1);
        System.out.println(multi2);
        System.out.println(multi3);
    }
    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static int multi(){
        return 3 * 45;
    }
}
