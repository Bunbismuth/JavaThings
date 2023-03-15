package LearningConcepts;

public class Au26y1xCar {
    // Vamos primeiro declarar os atributos que nosso objeto precisa ter para funcionar
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String cor = "Azul";
    double price = 50000.00;

    // Agora, vamos colocar as ações que nosso objeto poderá fazer ou, ainda melhor, declarar os métodos
    void drive(){
        System.out.println("Você está dirigindo o carro");
    }

    void brake(){
        System.out.println("Você colocou o pé no freio");
    }
}
