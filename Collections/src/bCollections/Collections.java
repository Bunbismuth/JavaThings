package bCollections;

import java.util.ArrayList;
import java.util.Collection;

public class Collections {
    public static void show(){
        // Escolhemos ArrayList porque é uma classe que implementa a interface collections, que por sua vez
        // herda de Iterable, ou seja, todas as classes que herdam de collections são iteráveis também
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");

        for (var item : collection){
            System.out.println(item);
        }
        System.out.println(collection);

        // Podemos também colocar vários itens de uma vez só em uma coleção, usando um método do Collections chamado addAll
        java.util.Collections.addAll(collection, "A", "B", "C");

        // Alguns outros métodos úteis são
        // Size, que retorna o tamanho da coleção:
        System.out.println(collection.size());

        // Também temos o remove, que remove um elemento da coleção pelo o nome
        collection.remove("a");
        System.out.println(collection);

        // Também temos o método clear, que limpa todos os elementos da lista
        // collection.clear();

        // E um método para saber se a coleção está vazia ou não:
        System.out.println(collection.isEmpty());

        // Também podemos checar a existência de um item na lista
        System.out.println(collection.contains("A"));

        // Podemos também converter uma coleção para um array, o qual podemos utilizar de 3 métodos overloaded

        // Se não passarmos nenhum argumento, podemos passar ela para uma array de objetos:
        Object[] objectArray = collection.toArray();

        // E Podemos converter para uma array de um tipo escolhido:
        String[] stringArray = collection.toArray(new String[6]);

        // Uma dica bastante útil é que podemos passar 0 como tamanho do array, que isso fará uma lista com capacidade
        // suficiente para todos os elementos da coleção passada.
        String[] stringArray2 = collection.toArray(new String[0]);

        System.out.println(stringArray[0]);
        System.out.println(stringArray2.length); // Aqui podemos ver que tem o tamanho de 5 a lista criada com 0

    }
}
