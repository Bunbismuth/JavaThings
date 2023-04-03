package cList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        // A interface lista estende da interface de coleções, que estente de iterable
        // Temos alguns métodos a mais e também alguns overloads que iremos ver
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        // O primeiro overlod que iremos ver é no próprio método add, que podemos adicionar um elemento a um index específico
        list.add(0, "!");

        // Uma curiosidade é que os elementos são "empurrados" ao invés de substituídos, podemos ver isso aqui
        System.out.println(list); // [!, a, b, c] o resultado

        // Podemos adicionar vários elementos de uma vez só aqui também
        Collections.addAll(list, "A", "B", "C");
        // Perceba que o primeiro parâmetro é uma coleção, mas, como toda lista é uma coleção, isso é aceito pelo o método

        // Temos também um método para substituir algum elemento
        list.set(0, "A++");
        System.out.println(list);

        // Também temos como remover um elemento pelo o seu index
        list.remove(0);
        list.remove("B"); // e ainda podemos remover o item pelo o seu nome!
        System.out.println(list);

        // Outro método interessante é o indexOf, que retorna o index do elemento passado, que retorna -1 caso não existir
        System.out.println(list.indexOf("a")); // Sempre retorna a primeira ocorrência do elemento passado

        // Caso queiramos somente a última ocorrência de um dado elemento, podemos usar o lastIndexOf
        System.out.println(list.lastIndexOf("A"));

        // Também podemos fazer cortes nas listas, com o subList
        System.out.println(list.subList(0, 2)); // note que o segundo argumento é exclusivo, então só pegará os elementos 1 e 2
    }
}
