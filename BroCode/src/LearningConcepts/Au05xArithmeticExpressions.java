package LearningConcepts;

public class Au05xArithmeticExpressions {
    public static void main(String[] args) {
        // Uma expressão é uma combinação de operadores com operandos
        // Operandos podem ser valores, variáveis, números ou quantidades
        // Operadores são +, -, *, %

        int friends = 10;

        friends += 1; // => friends = friends + 1;
        friends++; // => friends += 1; => friends = friends + 1;
        friends -= 1;
        friends--;

        friends = friends / 3; // divisão com inteiros sempre fará com que seja truncada a porção decimal da divisão.

        // Resultando em 3, já que é uma divisão de inteiros.
        System.out.println(friends);

        // porém, podemos fazer um cast com o nosso resultado, para um float ou double, que resultará no valor com os decimais.

        friends = 10; // só para o double mostrar o resultado da mesma expressão.

        // a variável que irá armazenar tem que ser do mesmo tipo do cast, por isso fizemos outra.
        double friends2 = (double) friends / 3;

        // Perceba que agora temos o resultado completo
        System.out.println(friends2);

    }
}
