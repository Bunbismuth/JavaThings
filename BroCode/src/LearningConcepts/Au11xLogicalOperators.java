package LearningConcepts;

import java.util.Scanner;

public class Au11xLogicalOperators {
    public static void main(String[] args) {
        // Operadores lógicos são usados para conectar 2 ou mais expressões
        // && = (AND) ambas as condições devem ser verdadeiras.
        // || = (OR) apenas uma das condições deve ser verdadeira.
        // ! = (NOT) reverte o valor booleano da condição.

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos graus está fazendo ai? ");
        int temp = scan.nextInt();


        // Para uma condição ser verdadeira, ambas as condicionais terão de ser verdadeiras.
        if (temp > 30){
            System.out.println("Tá quente lá fora...");
        }
        else if (temp >= 20 && temp <= 30){
            System.out.println("Está normal lá fora...");
        }
        else {
            System.out.println("Tá frio lá fora...");
        }

        System.out.println("Você está jogando um jogo! pressione q ou Q para sair do jogo...");
        String response = scan.next(); // o método next basicamente não precisa do enter para guardar a String do usuário
        // scan.nextLine(); // Para não resultar em erros no próximo scan.next()

        // Quando uma das condicionais for verdadeira, então toda a condição é verdadeira.
        if (response.equals("q") || response.equals("Q")){
            System.out.println("Você saiu do jogo, até mais!");
        }
        else {
            System.out.println("Você ainda está jogando o jogo...");
        }

        // Com o ! basicamente invertermos o valor verdade das condicionais, podemos repetir o exemplo anterior de forma inversa:
        System.out.println("Você está jogando um outro jogo! pressione q ou Q para sair do jogo...");
        response = scan.next();

        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("Você ainda está jogando o jogo...");
        }
        else {
            System.out.println("Você saiu do jogo, até mais!");
        }
        scan.close();
    }
}
