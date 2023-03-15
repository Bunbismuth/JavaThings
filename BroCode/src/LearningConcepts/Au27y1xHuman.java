package LearningConcepts;

public class Au27y1xHuman {
    // Aqui definimos quais serão os atributos deste objeto:
    String name;
    int age;
    double weight;

    // Para criamos um construtor, colocamos o mesmo nome da classe só que com parênteses:
    Au27y1xHuman(String name, int age, double weight) {
        // Para atribuirmos os atributos ao objeto instânciado, precisamos preceder a atribuição com um this
        // mostrando que é para o objeto instânciado em específico.
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + " está comendo");
    }

    void drink() {
        System.out.println(this.name + " está bebendo *glup*");
    }
}
