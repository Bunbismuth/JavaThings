package LearningConcepts;

public class Au27xConstructors {
    public static void main(String[] args) {
        // Construtores = é um método especial que é chamado quando um objeto é instanciado (criado)
        // Basicamente os construtores vão agir como métodos especiais que podem requerir argumentos para instanciar novos objetos

        // Isso é muito poderoso pois podemos criar objetos diferentes com atributos únicos, seguindo um padrão determinado pelo construtor
        Au27y1xHuman human1 = new Au27y1xHuman("Rick", 65, 70.5);

        System.out.println(human1.name);

        Au27y1xHuman human2 = new Au27y1xHuman("Morty", 16, 55.0);
        System.out.println(human2.name);

        // Podemos ver que toda classe possui os mesmos métodos porém podem agir diferente dependo do que fazemos com eles
        human2.eat();
        human1.drink();
    }
}
