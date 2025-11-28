package ParametrosFuncao;

public class Divisao {
    static void main(String[] args) {
        int divisao1 = divisao(80, 4);
        int divisao2 = divisaoo();
        int divisao3 = divisao(40, 9) / divisaoo();

        System.out.println(divisao1);
        System.out.println(divisao2);
        System.out.println(divisao3);
    }

    public static int divisao(int a, int b){
        return a / b;
    }

    public static int divisaoo(){
        return 20 / 2;
    }
}
