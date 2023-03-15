package LearningConcepts;

public class Au07xJavaMath {
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;

        // Pegando o maior valor entre dois números
        double z = Math.max(x, y);
        System.out.println(z);

        // Pegando o menor valor entre dois números
        z = Math.min(x, y);
        System.out.println(z);

        // Pegando o módulo de um número qualquer
        z = Math.abs(y);
        System.out.println(z);

        // Fazendo a raiz quadrada de um número qualquer
        z = Math.sqrt(x);
        System.out.println(z);

        // Arredondando um número qualquer
        z = Math.round(x);
        System.out.println(z);

        z = Math.ceil(x); // sempre arredonda para cima
        System.out.println(z);

        z = Math.floor(x); // sempre arredonda para baixo
        System.out.println(z);
    }
}
