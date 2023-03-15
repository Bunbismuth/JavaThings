package LearningConcepts;

public class Au34xInheritance {
    public static void main(String[] args) {
        // Herança = O processo no qual uma classe adquiri os atributos e métodos de outra

        // Podemos perceber que mesmo sem nenhum código na classe carro, ela contém os métodos da classe veículo por ser subclasse da mesma
        Au34y2xCar car = new Au34y2xCar();
        car.go();

        Au34y3xBicycle bike = new Au34y3xBicycle();
        bike.stop();

        // Então, os benefícios é que não precisamos listar todos os atributos e métodos 2 vezes

        // Perceba que podemos também fazer atributos exclusivos para cada subclasse:
        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
}
