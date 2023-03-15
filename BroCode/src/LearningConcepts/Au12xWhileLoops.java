package LearningConcepts;

import java.util.Scanner;

public class Au12xWhileLoops {
    public static void main(String[] args) {
        // um loop while executa um bloco de código sempre que a sua condição permanecer verdadeira

        Scanner scan = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Coloque o seu nome: ");
            name = scan.nextLine();
        }

        System.out.println("Olá " + name + "!");

        // Temos também uma variação do while em java, chamada do while, que basicamente sempre é executado pelo menos uma vez antes que a condição seja verificada.

        do {
            System.out.println("Qual o seu nome? ");
            name = scan.nextLine();
        } while(name.isBlank());
        scan.close();
    }
}
