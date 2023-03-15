package LearningConcepts;

public class Au36xSuperKeyword {
    public static void main(String[] args) {
        // Super = palavra chave que se refere a superclasse (a classe pai) de um objeto
        //         bastante similar com a palavra chave "this"


        // Veja que temos agora temos o construtor de forma correta:
        Au36y2xHero hero1 = new Au36y2xHero("Batman", 42, "$$$");
        Au36y2xHero hero2 = new Au36y2xHero("Superman", 43, "tudo apenas");

        // O que podemos fazer também é usar a palavra chave super para chamar um método da super classe
        System.out.println("Heroi 1: " + "\n" + hero1);
        System.out.println("Heroi 2: " + "\n" + hero2);
    }
}
