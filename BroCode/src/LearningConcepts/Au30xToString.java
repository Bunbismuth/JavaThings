public class Au30xToString {
    public static void main(String[] args) {
        // toString() = método especial que todos os objetos tem de herança,
        //              que retorna uma string que "representa textualmente" um objeto.
        // Pode ser usado tanto implicitamente quanto explicitamente

        Au30y1xCar car = new Au30y1xCar();

        // Se quisermos representar textualmente todos os atributos do objeto, teriamos que fazer assim:
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        // Quando tentamos printar somente o objeto instanciado car, aparece um código gigantesco como nome da classe
        // Basicamente o retorno é o endereço que o objeto está alocado na memória
        System.out.println("Printando o objeto diretamente: ");
        System.out.println(car);

        // toString() nos retornará também o endereço na memória do objeto que estamos analisando:
        System.out.println("Printando usando o método toString()");
        System.out.println(car.toString());

        // Mas, em muitos casos, os programadores fazem um override do método toString() para mostrar todos os atributos
        // daquela classe em específico
    }
}
