package LearningConcepts;
import java.util.*;

public class Au20x2DArrayLists {
    public static void main(String[] args) {
        // 2D ArrayList = uma dinâmica lista de listas
        // Você pode mudar o tamanho dessas listas durante o desenvolvimento

        // Vamos fazer um tipo de carrinho de compras nesse exemplo
        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("Pão");
        bakeryList.add("Rosquinha");
        bakeryList.add("Coxinha");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Tomates");
        produceList.add("Pimenta");
        produceList.add("Brócolis");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Refrigerante");
        drinksList.add("Café");

        System.out.println(bakeryList);
        System.out.println(produceList);
        System.out.println(drinksList);

        // Agora, podemos adicionar todas essas listas a uma só lista, para ficar mais organizado
        ArrayList<ArrayList<String>> buyList = new ArrayList<>(); // perceba que dentro dos <> colocamos arraylist de string para transformar-la em uma lista de listas de string.
        buyList.add(bakeryList);
        buyList.add(produceList);
        buyList.add(drinksList);

        System.out.println(buyList);

        // Agora, se quisermos pegar só uma dessas listas, podemos usar o get passando a posição da lista que desejamos
        System.out.println(buyList.get(0)); // retornará a bakeryList

        // E, se quisermos apenas um elemento daquela lista, podemos colocar mais um get junto com a posição do elemento dentro da lista que você selecionou
        System.out.println(buyList.get(2).get(1)); // retornará o café
    }
}
