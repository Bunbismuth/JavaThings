package LearningConcepts;

public class Au37y2xCar extends Au37y1xVehicle{
    // Quando extendemos de uma classe abstrata, se a classe não for abstrata, precisamos obrigatoriamente herdar
    // os métodos que tem na mesma e implementar-los (criar construtores)
    @Override
    void go(){
        // então agora, podemos ser mais específicos para a classe filha, deixando ela única porém com os mesmos métodos da classe pai
        System.out.println("O motorista está dirigindo o carro");
    }
}
