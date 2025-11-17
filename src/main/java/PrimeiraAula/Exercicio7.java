package PrimeiraAula;
import java.util.*;
public class Exercicio7 {
    public static void main(String[] args){

        int numeroCombo;
        String nomeCombo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem-vindo ao Siri Cascudo! Faça o seu pedido!" +
                "COMBO 1, " + " COMBO 2, " + " COMBO 3, " + " COMBO 4, " + " COMBO 5 ");

        numeroCombo = entrada.nextInt();

        switch (numeroCombo){
            case 1: nomeCombo = "hambúguer de costela com duplo queijo, porção média de fritas e um refrigerate refil"; break;
            case 2: nomeCombo = "hambúguer vegetariano com carne de soja e salada dupla, porção média de fritas e um refrigerate refil"; break;
            case 3: nomeCombo = "hambúguer de carne com dose dupla de bacon e cheddar, porção média de fritas e um refrigerate refil"; break;
            case 4: nomeCombo = "hambúguer de carne de siri empanado, porção média de fritas e um refrigerate refil"; break;
            case 5: nomeCombo = "hambúguer de frango empanado grande com uma cremosa maionese, porção média de fritas e um refrigerate refil"; break;
            default: nomeCombo = "Desculpe, peça algo que esteja no cardápio";
        }

        System.out.println("Pedido anotado! Aguarde alguns momentos e seu combo com " + nomeCombo + " chega já já! Agradecemos a preferência!");

        /*O SWITCH CASE É ÚTIL QUANDO PRECISAMOS COMPARAR UMA MESMA VARIÁVEL COM VÁRIOS VALORES DIFERENTES, TORNANDO O CÓDIGO MAIS ORGANIZADO E FÁCIL DE LER DO QUE USAR VÁRIOS IF ELSE E ELSE IF*/
    }
}
