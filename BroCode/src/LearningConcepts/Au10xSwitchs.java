package LearningConcepts;

import java.util.Scanner;

public class Au10xSwitchs {
    public static void main(String[] args) {
        // Switch é um método que permite que verificamos se há igualdade entre uma variável e uma lista de casos.
        // É bem usado quando se há uso exagerado de if's

        // Por exemplo, no caso de dias da semana:
        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque um dia da semana: ");
        String day = scan.nextLine();

        switch (day){
            case "Domingo":
                System.out.println("Hoje é domingo!");
                break; // sempre colocamos o break para sair do switch e continuarmos com o nosso programa
            case "Sexta-feira":
                System.out.println("Hoje é Sexta-feira :D!");
                break;
            case "Segunda-feira":
                System.out.println("Hoje é Segunda :(((");
                break;

        }

        // Podemos fazer assim também, para ficar mais limpo o código:
        switch(day){
            case "Domingo" -> System.out.println("Hoje é domingo!");
            case "Sexta-feira" -> System.out.println("Hoje é Sexta-feira :D!");
            case "Segunda-feira" -> System.out.println("Hoje é Segunda :(((");
        }

        // Agora, caso for colocado um valor no switch que não esteja dentro de nenhum caso, o programa não fará nada
        // Mas, podemos colocar um comportamento "padrão" para que mesmo que não tenha dentro da lista, possamos saber que foi executado, utilizando o default

        switch (day){
            case "Domingo" -> System.out.println("Hoje é domingo!");
            case "Sexta-feira" -> System.out.println("Hoje é Sexta-feira :D!");
            case "Segunda-feira" -> System.out.println("Hoje é Segunda :(((");
            default -> System.out.println("Você não colocou um dia válido");
        }
        scan.close();
    }
}
