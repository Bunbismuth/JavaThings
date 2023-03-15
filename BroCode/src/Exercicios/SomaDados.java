package Exercicios;

import java.util.Random;

public class SomaDados {
    public static void main(String[] args) {
        Random random = new Random();
        int[] repeatedSum = new int[11];
        for (int i = 0; i < 50000; i++){
            int dadosSoma = random.nextInt(6) + random.nextInt(6)+2;
            repeatedSum[dadosSoma-2]++;
        }

        for (int i = 0; i < repeatedSum.length; i++){
            System.out.printf("O resultado %d se repetiu %d vezes.\n", i+2, repeatedSum[i]);
        }
    }
}
