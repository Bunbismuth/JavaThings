package LearningConcepts;

public class Au15xArrays {
    public static void main(String[] args) {
        // Array = usado para guardar múltiplos valores em uma variável só

        String[] cars = {"Camaro", "Corvette", "Tesla"}; // Basicamente é assim que declaramos um Array qualquer em java

        // Podemos analisar que arrays são mutáveis, visto que podemos declarar outro valor na mesma posição e será realocado
        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println();

        // Agora, uma observação sobre arrays em java é que toddo o conteúdo que existe na array é do mesmo tipo que a variável que guarda
        // Exemplo String[] cars = {"Camaro", "Corvette", "Tesla", 123}, dará erro pq temos um inteiro após os valores

        // Também podemos criar arrays de outras formas, colocando, por exemplo, o número de elementos que queremos sem necessariamente guardar nada
        String[] cars2 = new String[3]; // Aqui temos o limite de elementos que podemos ter nessa lista
        cars2[0] = "Camaro";
        cars2[1] = "Corvette";
        cars2[2] = "Tesla";

        System.out.println(cars2[0]);

        // Os loops for tem uma iteração peculiar com arrays, podemos fazer uma leitura de todos os elementos de uma array da seguinte forma:

        // Fazendo da forma padrão que já conhecemos
        System.out.println("Mostrando todos os elementos da array: ");
        for(int i = 0; i <= cars.length; i++){
            System.out.println(cars[i]);
        }
    }
}
