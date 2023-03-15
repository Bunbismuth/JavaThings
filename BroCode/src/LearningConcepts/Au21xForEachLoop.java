package LearningConcepts;

import java.util.ArrayList;

public class Au21xForEachLoop {
    public static void main(String[] args) {
        // For-each loop = uma técnica para iterar sob todos os elementos de uma array/coleção
        //                 menos passos e melhor de ler
        //                 menos flexível

        String[] animals = {"gato", "cachorro", "rato", "pássaro"};

        // para criar um for each, colocamos primeiro o tipo da lista que queremos iterar
        // depois, colocamos a lista e pronto, tá criado o loop!

        for(String i : animals){
            System.out.println(i);
        }

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("Gato");
        animals2.add("Cachorro");
        animals2.add("Rato");
        animals2.add("Pássaro");

        for(String i : animals2){
            System.out.println(i);
        }
    }
}
