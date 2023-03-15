package LearningConcepts;

import java.util.ArrayList;

public class Au19xArrayLists {
    public static void main(String[] args) {
        // ArrayList = um tipo de lista que seu tamanho pode variar
        //             Elementos podem ser adicionados ou removidos depois da fase de compilação
        //             Armazenam tipos de dados por referência

        // Basicamente declaramos assim, chamando o método e declarando o tipo por referência do que queremos armazenar
        ArrayList<String> food = new ArrayList<>();

        // Agora, se queremos uma array de inteiros, temos que fazer usando a classe wrapper
        ArrayList<Integer> Integers = new ArrayList<>();

        // Para adicionarmos elementos à nossa lista, precisamos utilizar o método add:
        food.add("pizza");
        food.add("hamburguer");
        food.add("hotdog");

        // Podemos mudar os elementos da lista utilizando o .set juntamente com o index que queremos colocar o elemento
        food.set(0, "sushi");

        // Podemos também remover elementos utilizando o index
        food.remove(2);

        // E também temos o método clear para remover todos os elementos da nossa lista
        food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

        // Também podemos fazer isso para ler a lista mais facilmente, porém não teremos o index dos elementos
        for (String s : food) {
            System.out.println(s);
        }
    }
}
