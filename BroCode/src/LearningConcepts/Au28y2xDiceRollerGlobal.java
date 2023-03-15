import java.util.Random;

public class Au28y2xDiceRollerGlobal {
    // Aqui neste exemplo estamos usando variáveis globais:

    // Perceba que estamos instanciando elas fora dos métodos mas dentro da classe.
    Random random;
    int number;
    Au28y2xDiceRollerGlobal() {
        random = new Random();
        roll();
    }

    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
