public class Au30y1xCar {
    String make = "Ford";
    String model = "Mustang";
    String color = "Vermelho";
    int year = 2021;

    // Para vermos a representação textual, podemos fazer um override do método toString()
    // Perceba também que isso altera também como é printado o objeto, sendo ele invocaddo tanto implicitamente quanto
    // explicitamente.

    // print Implicito: System.out.println(nomeDoObjeto);
    // print Explicito: System.out.println(nomeDoObjeto.toString());
    @Override
    public String toString(){
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
