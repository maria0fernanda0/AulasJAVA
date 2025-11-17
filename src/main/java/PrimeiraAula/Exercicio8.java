package PrimeiraAula;
import java.util.*;
public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numeroPrato;
        String nomePrato;
        int caloriasPrato = 1;

        int numeroBebida;
        String nomeBebida;
        int caloriasBebida = 1;

        int numeroSobremesa;
        String nomeSobremesa;
        int caloriasSobremesa = 1;

        int caloriasResultado;


        System.out.println("Bem-vindo ao restaurante do norte! Trabalhamos com marmitas de arroz e feijão e fritas. A mistura é por sua conta. Temos: prato 1: vegetariano; prato 2: peixe; prato 3: frango; prato 4: carne");
        numeroPrato = entrada.nextInt();

        switch (numeroPrato) {
            case 1:
                nomePrato = "Arroz, feijão, fritas e carne de soja.";
                caloriasPrato = 180;
                break;
            case 2:
                nomePrato = "Arroz, feijão, fritas e salmão grelhado.";
                caloriasPrato = 230;
                break;
            case 3:
                nomePrato = "Arroz, feijão, fritas e filé de frango.";
                caloriasPrato = 250;
                break;
            case 4:
                nomePrato = "Arroz, feijão, fritas e bife acebolado.";
                caloriasPrato = 350;
                break;
            default:
                nomePrato = "Escolha um prato existente no cardápio";
        }


        System.out.println("Algo para beber? Temos: bebida 1: chá; bebida 2: suco de laranja; bebida 3: suco de melão; bebida 4: refrigerante diet");
        numeroBebida = entrada.nextInt();

        switch (numeroBebida) {
            case 1:
                nomeBebida = "Chá de limão";
                caloriasBebida = 20;
                break;
            case 2:
                nomeBebida = "Suco de laranja natural";
                caloriasBebida = 70;
                break;
            case 3:
                nomeBebida = "Suco de limão natural";
                caloriasBebida = 100;
                break;
            case 4:
                nomeBebida = "Coca-cola diet";
                caloriasBebida = 65;
                break;
            default:
                nomeBebida = "Escolha uma bebida existente no cardápio";
        }


        System.out.println("E a sobremesa? Temos: sobremesa 1: Abacaxi; sobremesa 2: sorvete diet; sobremesa 3: mousse diet; sobremesa 4: mousse chocolate");
        numeroSobremesa = entrada.nextInt();

        switch (numeroSobremesa) {
            case 1:
                nomeSobremesa = "Abacaxi";
                caloriasSobremesa = 75;
                break;
            case 2:
                nomeSobremesa = "Sorvete diet";
                caloriasSobremesa = 110;
                break;
            case 3:
                nomeSobremesa = "Mousse diet";
                caloriasSobremesa = 170;
                break;
            case 4:
                nomeSobremesa = "Mousse de chocolate";
                caloriasSobremesa = 200;
                break;
            default:
                nomeSobremesa = "Escolha uma bebida existente no cardápio";
        }

        caloriasResultado = caloriasPrato + caloriasBebida + caloriasSobremesa;

        System.out.println("Aqui está seu prato, bebida e sobremesa! Seu prato escolhido foi " + nomePrato + " com " + caloriasPrato + " calorias." + "Sua bebida escolhida foi " + nomeBebida + " com " + caloriasBebida + " calorias." + "Sua sobremesa escolhida foi " + nomeSobremesa + " com " + caloriasSobremesa + " calorias." + "As calorias totais do seu almoço foram " + caloriasResultado);
    }
}
