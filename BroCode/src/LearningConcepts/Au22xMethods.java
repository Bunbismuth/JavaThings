package LearningConcepts;

public class Au22xMethods {
    public static void main(String[] args) {
        // método = um bloco de código que é executado toda vez que o mesmo é chamado
        // Um exemplo de método é o próprio main, que é executado sempre que chamamos ele

        // Para chamar o método, precisamos só colocar o nome do mesmo aqui:
        hello();
        hello();
        hello();

        // Um dos usos de métodos é que podemos passar algo dentro dele quando chamarmos o mesmo, por exemplo:
        // Tudo que é passado para um método é chamado de argumentos, que podem ser confundidos com parâmetros

        String name = "Thiago"; // perceba que ao iniciarmos listamos o tipo da variável antes, fazemos a mesma coisa quando vamos colocar os argumentos de um método qualquer
        hello2(name);
        hello2("Brunno");

        int age = 19;
        hello3(name, age);
        hello3("Paulo", 20);
    }
    // Sempre colocamos métodos separadamente do método main, pois, como já falamos, é um método separado
    // Porém, um cuidado que se deve ter é que sempre que vamos por algo no main, devemos preceder o mesmo com static, que será explicado depois
    static void hello() {
        System.out.println("Olá :D");
    }
    // Para conseguirmos colocar argumentos nos nossos métodos, precisamos de um par de argumentos seja reflexo do que queremos passar
    // para isso, precisamos colocar parâmetros dentro do nosso método para que ele receba argumentos de fora

    static void hello2(String name){
        System.out.println("Olá " + name + "!");
    }

    // Podemos passar quantos argumentos quisermos para um método, como, por exemplo, a idade neste caso:
    static void hello3(String name, int age){
        System.out.println("Olá " + name + ", você tem " + age + "anos de idade :D");
    }
}
