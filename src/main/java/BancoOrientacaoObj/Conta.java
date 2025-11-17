package BancoOrientacaoObj;
import java.util.*;
import java.io.BufferedReader;
public class Conta {
    Scanner entrada = new Scanner(System.in); /*variavel de respostas*/

    int numeroConta;
    String titularConta; /*atributos da sua conta*/
    double saldo;


    public Conta(String nomeTitular, double saldoInicial) {
        /*no metodo conta, colocamos como parametro a criaçao da variavel com o nome do titular da conta e seu saldo inicial*/
        this.titularConta = nomeTitular;
        this.saldo = saldoInicial;

        /*esses parametros sao os valores dos atributos*/

        Random geradorNumero = new Random();
        numeroConta = geradorNumero.nextInt(1000);

        /*esse random vai gerar um numero aleatorio para a criação da sua conta*/
    }

    public void verSaldo() {
        System.out.println("O número da conta é: " + numeroConta);
        System.out.println("O nome do titular é: " + titularConta);
        System.out.println("O saldo da conta é: " + saldo);

        /*método ver saldo, que mostra suas informações*/
    }

    public void Saque(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo = saldo - valorSaque;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else {
            System.out.println("Seu saldo é insuficiente!");
        }

        /*para o saque ser efetuado, precisamos ter saldo na conta. entao, para ocorrer o saque, fazemos assim: precisamos do valor do saque que voce deseja fazer. Se, o valor do saldo for maior ou igual ao valor do saque desejado, o valor do saldo será subtraido pelo valor do saque, restanto apenas a sobra*/
    }

    public void Deposito(double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Depósito inválido, valor menor que 0!");
        } else {
            saldo += valorDeposito; /*saldo = saldo + valorDeposito*/
            System.out.println("Seu saldo agora é: " + saldo);
        }

        /*agora temos o deposito, caso voce queira adicionar mais dinheiro na sua conta. para fazer isso, precisamos criar uma variavel com o valor do deposito desejado. se o valor do seu deposito for menor ou igual a 0, o deposito nao podera ser realizado, se for maior, o valor do seu saldo sera somado com o valor do seu deposito, restando o resultado*/
    }

    public void iniciar() {
        int opcao;
        do {
            ExibirMenu();
            opcao = entrada.nextInt();
            EscolherFuncao(opcao);
        } while (opcao != 5);

        /*criando o metodo iniciar, criamos a variavel de opçao, que no laço de repetiçao, exibe o menu e te mostra as opções, nas quais voce escolhe. voce escolhe a opção que vai rodar a função que criamos. as opções param de ser repetidas quando chegam ao valor maximo (4)*/
    }

    public void Emprestimo(double valorEmprestimo) {
        if (saldo >= 1000) {
            saldo += valorEmprestimo;
            System.out.println("Seu empréstimo foi autorizado! Seu saldo agora tem o valor de: " + saldo);
        } else {
            System.out.println("Empréstimo recusado! Para ser aprovado, seu saldo deve ser no valor acima de R$1000.");
        }

        /*no metodo emprestimo, colocamos como parametro do valor desejado do emprestimo. se o seu saldo for maior ou igual a 1000, escolhe o valor do emprestimo desejado e terá o dinheiro na sua conta. se voce tiver menos de 1000, seu emprestimo sera recusado pois o valor minimo é insuficiente*/
    }

    public void ExibirMenu() {
        System.out.println("Bem-vindo ao banco X!");
        System.out.println("Escolha sua opção");
        System.out.println("1 - VER SALDO");
        System.out.println("2 - SACAR");
        System.out.println("3 - DEPOSITAR");
        System.out.println("4 - EMPRÉSTIMO");
        System.out.println("5 - FINALIZAR");

        /*esse metodo te mostra as opçoes do banco que podem ser escolhidas*/
    }

    public void EscolherFuncao(int opcao) {
        double saque;
        double deposito;
        double emprestimo;

        /*no metodo escolher funçao como parametro a variavel OPCAO, criamos variaveis para todos os meios que precisam da resposta do usuario, e ai criamos um switch, para armazenar informaçoes de acordo com sua opçao escolhida*/

        switch (opcao) {
            case 1:
                verSaldo();
                break;
            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                saque = entrada.nextDouble();
                Saque(saque);
                break;
            case 3:
                System.out.println("Digite o valor a ser depositado: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;
            case 4:
                System.out.println("Digite o valor que do empréstimo desejado:");
                emprestimo = entrada.nextDouble();
                Emprestimo(emprestimo);
                break;
            case 5:
                System.out.println("Obrigado pela preferência!");
                break;
            default:
                System.out.println("Opção inválida");
        }

        /*apos o exibir menu mostrar as opcoes disponiveis, o switch responde a sua opçao escolhida, as variaveis que criamos no metodo recebem o valor de entrada, onde o usuario coloca o valor, a partir disso, ele faz a conta que está dentro do método*/
    }

}

