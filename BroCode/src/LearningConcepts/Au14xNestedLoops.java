package LearningConcepts;

import java.util.Scanner;

public class Au14xNestedLoops {
    public static void main(String[] args) {
        // NestedLoops são loops dentro de outros loops

        // Criando um programa que faz um retângulo com um símbolo que escolhemos
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.println("Coloque o número de linhas que deseja: ");
        rows = scanner.nextInt();

        System.out.println("Coloque o número de colunas que deseja: ");
        columns = scanner.nextInt();

        System.out.println("Coloque o símbolo que será usado: ");
        symbol = scanner.next();

        // Um loop qualquer dentro de outro loop é um Loop Aninhado ou NestedLoop
        for(int i = 1; i<=rows; i++) {
            System.out.println(); // isso fará com que nosso cursor seja movido para mostrar a próxima linha de caractéres
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol); // veja que estamos usando o print sem pular linha
            }
        }
        scanner.close();
    }
}
