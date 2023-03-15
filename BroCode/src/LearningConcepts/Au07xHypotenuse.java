package LearningConcepts;

import java.util.Scanner;

public class Au07xHypotenuse {
    public static void main(String[] args) {
        double x;
        double y;
        double z;

        Scanner scan = new Scanner(System.in);

        System.out.println("Coloque o lado x: ");
        x = scan.nextDouble();

        System.out.println("Coloque o lado y: ");
        y = scan.nextDouble();

        // Calculando a hipotenusa
        z = Math.sqrt((x*x)+(y*y));

        System.out.println("A hipotenusa é " + z);

        // Tirando a memória usada pelo o método:
        scan.close();
    }
}
