package LearningConcepts;

public class Au16x2DArrays {
    public static void main(String[] args) {
        // Listas bidimensionais, os quais cada elemento tem uma coluna e linha

        String[][] cars = new String[3][3]; // Uma matriz 2x2

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";

        cars[1][0] = "Mustang";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";

        cars[2][0] = "Ferrari";
        cars[2][1] = "Lamborguinni";
        cars[2][2] = "Tesla";

        // Agora, vamos usar um Loop aninhado para mostrar todos os carros que estão agrupadas na variável
        for(int i = 0; i < cars.length; i++){
            System.out.println(); // Colocando um linebreak para que movamos o cursos para outra linha
            for(int j = 0; j < cars[i].length; j++) // basicamente pegando o tamanho da nossa linha
            {
                System.out.print(cars[i][j] + " | ");
            }
        }

        // Também podemos alocar os elementos da seguinte forma:
        String[][] cars2 = {
                                {"Camaro", "Corvette", "Silverado", "Bom dia"},
                                {"Mustang", "Ranger", "F-150"},
                                {"Ferrari", "Lambourguinni", "Tesla"}
                            };
    }
}
