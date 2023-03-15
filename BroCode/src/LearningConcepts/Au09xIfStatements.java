package LearningConcepts;

import java.util.Scanner;

public class Au09xIfStatements {
    public static void main(String[] args) {
        // if statements = executa um bloco de código sempre que a sua condição for verdadeira.

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos anos você tem? ");
        int age = scan.nextInt();

        // Temos que prestar atenção na ordem dos if's
        if (age >= 75) {
            System.out.println("Ok Boomeer");
        }
        else if (age >= 18) {
            System.out.println("Você é um adulto!");
        }
        else if (age >= 13) {
            System.out.println("Você é um adolescente!");
        }
        else {
            System.out.println("Você não é um adulto!");
        }
        scan.close();
    }
}
