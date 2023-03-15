package LearningConcepts;

public class Au37xAbstraction {
    public static void main(String[] args) {
        // Abstract = Classes abstratas não podem ser instanciadas, mas elas podem ter uma subclasse que pode ser instanciada
        //            métodos abstratos são declarados sem uma implementação

        // O veículo neste exemplo é uma ideia abstrata, porque não podemos fazer nada só com o conceito de veículo
        // um veículo pode ser uma moto, uma bicicleta, um carro, por isso, podemos considerar-lo como uma ideia abstrata.
        // Então, podemos impedir que alguém crie uma instância de algo que é muito váguo, como a ideia de veículo:
        // Au37y1xVehicle vehicle = new Au37y1xVehicle(); // E agora não podemos mais instânciar essa classe

        // Isso dá um layer a mais de segurança, pois faz com que não possamos mudar a raiz das subclasses pois
        // toda subclasse vai ter sua própria implementação.
        Au37y2xCar car = new Au37y2xCar();
        System.out.println(car);
    }
}
