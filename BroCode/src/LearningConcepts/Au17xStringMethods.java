package LearningConcepts;

public class Au17xStringMethods {
    public static void main(String[] args) {
        // String = Um tipo de variável por referência que pode armazenar um ou mais caractéres
        // Tipos de dados de referência tem acesso a vários métodos úteis
        String name = "Thiago  ";

        // O método equals retorna um valor booleano, verdadeiro caso sejam iguais ou falso caso contrário.
        // Esse método é sensível a caps, ou seja, se colocarmos uma letra em maíusculo diferente do original, já da falso
        boolean result = name.equals("thiago");
        System.out.println(result);

        // Porém, podemos ignorar essa sensibilidade, com um método equalsIgonoreCase
        boolean result1 = name.equalsIgnoreCase("thiago");
        System.out.println(result1);

        // Agora, para sabermos o tamanho de uma String, podemos usar o método Lenght que retornará um inteiro
        int lenghtString = name.length();
        System.out.println(lenghtString);

        // Temos também o método charAt que retornará o caractére dependendo do índice que você colocar
        char charString = name.charAt(0);
        System.out.println(charString);

        // O indexOf retorna um inteiro que é o index da posição que aquele caractére se encontra:
        int indexString = name.indexOf("i");
        System.out.println(indexString);

        // Também podemos verificar se uma String está vazia ou não, com o isEmpty:
        boolean isEmpty = name.isEmpty();
        System.out.println(isEmpty);

        // Podemos mudar todos os caractéres de uma string para uppercase, ou maiúsculo
        String nameUpper = name.toUpperCase();
        System.out.println(nameUpper);

        // Também podemos fazer isso só que para converter tudo em minúsculo
        String nameLower = name.toLowerCase();
        System.out.println(nameLower);

        // Também podemos tirar os espaços de uma string qualquer:
        String nameNoSpaces = name.trim();
        System.out.println(nameNoSpaces);

        // Podemos substituir um caractére por outro utilizando o replace
        String nameReplaced = name.replace('o', 'a');
        System.out.println(nameReplaced);

        // Esses só são alguns dos métodos que são mais utilizados para Strings, caso queira ver mais, vai testando na documentação
    }
}
