package LearningConcepts;

public class Au23xOverloadedMethods {
    public static void main(String[] args) {
        // métodos overloaded = são métodos que compartilham o mesmo nome porém tem diferentes parâmetros
        //                      nome do método + parâmetros = assinatura do método

        // Testando nosso método overloaded 1
        int x = add(1, 2);
        System.out.println(x);

        // Testando o método 2
        int y = add(2, 3,5);
        System.out.println(y);

        // Testando o método 3
        int z = add(1,2,3,4);
        System.out.println(z);

        // Testando os métodos com double
        double a = add(4.5,3);
        System.out.println(a);

        double b = add(2.5, 4, 5.0);
        System.out.println(b);

        double c = add(10.5, 3.14, 10, 400);
        System.out.println(c);
    }

    static int add(int a, int b){
        System.out.println("Esse é o método overloaded #1");
        return a + b;
    }

    // Se tentarmos por um com os mesmos parâmetros, teremos um método com a mesma assinatura que o anterior, o que não é possível em java.
    // static int add(int a, int b){
    //    return a + b;
    // }

    static int add(int a, int b, int c){
        System.out.println("Esse é o método overloaded #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        System.out.println("Esse é o método overloaded #3");
        return a + b + c + d;
    }

    // Criando mais métodos que aceitam apenas doubles:
    static double add(double a, double b){
        System.out.println("Esse é o método overloaded #4");
        return a + b;
    }
    static double add(double a, double b, double c){
        System.out.println("Esse é o método overloaded #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d){
        System.out.println("Esse é o método overloaded #6");
        return a + b + c + d;
    }
}
