package LearningConcepts;
import java.util.Random;
public class Au08xRandomNumbers {
    public static void main(String[] args) {
        // Criando uma instância do objeto random:
        Random random = new Random();

        // Vamos tentar criar um dado aqui para rolar
        int x = random.nextInt(6); // porém, dessa forma podemos rolar um 0, pois é de 0-5.
        System.out.println(x);

        // Então, para ajeitarmos isso, fazemos da seguinte maneira
        x = random.nextInt(6)+1; // que assim ficamos com um intervalo de 1-6;
        System.out.println(x);

        // Podemos também fazer isso com outros tipos de variáveis
        double y  = random.nextDouble(); // vai gerar um número aleatório entre 0 e 1.
        System.out.println(y);

        boolean z = random.nextBoolean(); // vai gerar um boolean aleatório
        System.out.println(z);
    }
}
