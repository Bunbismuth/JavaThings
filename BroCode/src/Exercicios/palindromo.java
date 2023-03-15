package Exercicios;

import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira uma palavra aqui para descobrir se é palíndromo");
        String word = scan.nextLine();

        isPalindrome(word);
        scan.close();
    }

    public static void isPalindrome(String word){
        word = word.replace(" ", "");
        String palindrome = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(palindrome)){
            System.out.println("A palavra que você colocou é um palíndromo!");
        }
        else {
            System.out.println("A palavra inserida não é um palíndromo :(");
        }
    }
}
