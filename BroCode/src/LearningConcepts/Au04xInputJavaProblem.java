package LearningConcepts;

import java.util.Scanner;
public class Au04xInputJavaProblem {

    // Mostrando um caso o qual há um erro com a maneira que pegamos os inputs do usuário:

    // Isso acontece porque o método nextLine() sempre pega uma String e para quando alcança algum método de nova linha como
    // como o \n no final, agora, caso usamos um método que não lê uma nova linha, como o nextInt() e quando pressionamos
    // o enter, geramos um \n, assim ficando, por exemplo, 19\n, porém, o nextInt() só vai ler a porção numérica, logo,
    // lendo somento o 19, e, quando enviamos, o \n não entrará no scanner, ficando este para o próximo método, que
    // por sua vez, termina a execução do método nextLine(), por isso que ele encerra logo após colocarmos um número e
    // dar enter, porque o número aparece com um \n, que é tido como condição de finalização do método nextLine().


    // Um jeito de ajeitarmos esse problema, é colocando um nextLine() logo após chamarmos nosso nextInt(), sem atribuir-lo a nada.
    public static void main(String[] args){
        // Criando um objeto do tipo scanner para lermos o input do usuário
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String name = scan.nextLine();

        System.out.println("Quantos anos você tem? ");
        int age = scan.nextInt();
        // scan.nextLine();

        System.out.println("Qual a sua comida favorita?");
        String food = scan.nextLine();

        System.out.println("Olá " + name);
        System.out.println("Você tem " + age + " anos");
        System.out.println("Você gosta de " + food);
        
        scan.close();
    }
}
