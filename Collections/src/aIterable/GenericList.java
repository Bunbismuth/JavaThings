package aIterable;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item){
        items[count++] = item;
    }

    public T get(int index){
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        // Agora, vamos implementar o método da interface Iterable

        // Na documentação do iterator, podemos ver que há dois métodos que precisam ser implementados
        // Esses são o hasNext e o next, que iremos implementar em uma classe privada que será usada como capsula desse método

        return new ListIterator(this);
    }

    // Vamos criar uma classe que implementa a classe Iterator para facilitar nosso trabalho:
    private class ListIterator implements Iterator<T>{
        // Perceba que colocamos sempre T dentro desses iterators, isso porque ele é substituído pelo tipo do objeto que está
        // chamando ele, podemos entender como T de Type ou Tipo.
        private GenericList<T> list;
        private int index;
        public ListIterator(GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public T next() {
            // Aqui fazemos o contador do nosso método
            return list.items[index++];
        }
    }
}
