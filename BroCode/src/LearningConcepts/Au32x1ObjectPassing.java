public class Au32x1ObjectPassing {
    public static void main(String[] args) {
        // Vamos aprender a colocar objetos como argumentos

        // Instanciando nossas classes
        Au32y2xGarage garage = new Au32y2xGarage();
        Au32y1xCar car = new Au32y1xCar("BMW");
        Au32y1xCar car2 = new Au32y1xCar("Tesla");
        garage.park(car);
        garage.park(car2);
    }
}
