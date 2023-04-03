package bCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class CollectionsCompare {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a", "b", "c");

        Collection<String> other = new ArrayList<>();
        other.addAll(collection); // Adicionando todos os elementos da primeira coleção na segunda

        // Se tentarmos comparar essas duas coleções diretamente, vamos ver que dá sempre como falso
        // porque são dois objetos diferentes guardados na memória

        // O == compara os endereços na memória de cada objeto, por isso a expressão é falsa
        System.out.println(collection == other);

        // A maneira correta de fazermos tal comperação é pelo método equals:
        System.out.println(collection.equals(other));

    }
}
