package ParametrosFuncao;

public class Subtracao {
    static void main(String[] args) {

        int subt1 = subt(20, 12);
        int subt2 = subtra();
        int subt3 = subt1 - subt2;

        System.out.println(subt1);
        System.out.println(subt2);
        System.out.println(subt3);

    }
    public static int subt(int a, int b) {
        return a - b;
    }

    public static int subtra(){
        return 30 - 12;
    }
}
