package LearningConcepts;

public class Au24xPrintfMethod {
    public static void main(String[] args) {
        // printf() =        um método opcional para controlar, formatar e mostrar texto na janela de console
        //                   dois argumentos =  string formatada + (objeto/variável/valor)
        //                   % [flags] [precisão] [width] [conversion-character]
        //                   %d para mostrar a variável, d de display

        System.out.printf("Essa é uma string formatada %d \n",123);

        boolean myBoolean = true;
        char myChar = '@';
        double myDouble = 1000.5043;
        String myString = "Bro";
        int myInt = 50;

        // caractéres de conversão no printf()
        System.out.print("Valores booleanos: ");
        System.out.printf("%b \n", myBoolean);     // %b para booleanos


        System.out.print("Valores de caractéres: ");
        System.out.printf("%c \n", myChar);        // %c para caractéres

        System.out.print("Valores double: ");
        System.out.printf("%f \n", myDouble);      // %f para double

        System.out.print("Valores String: ");
        System.out.printf("%s \n", myString);      // %s para Strings

        System.out.print("Valores Inteiros: ");
        System.out.printf("%d \n", myInt);         // %d para inteiros

        // [width]
        // O número mínimo de caractéres que vão ser escritos como output
        System.out.print("Espaçamento de caractéres: ");
        System.out.printf("Olá %10s \n", myString); // isso basicamente faz com que seja colocado pelo menos 10 espaços no output da String que você quer
        // Esse espaçamento leva em conta o número de caractéres que a String já possui, nesse exemplo temos 3, que para 10 faltam 7, sendo preenchido com espaços.

        // [precisão]
        // seleciona o número de digitos de precisão quando vamos printar um número de ponto flutuante. ex: 3.1415634
        System.out.print("Precisão de ponto flutuante: ");
        System.out.printf("Você tem essa quantidade de dinheiro %.2f \n", myDouble);

        // [flags]
        // adiciona um efeito no output baseado na flag que foi adicionada no especificador de formato
        // - : justifica para a esquerda
        // + : mostra um sinal de mais ( + ) ou um sinal de menos ( - ) para um valor numérico
        // 0 : valores numéricos são espaçados com 0's
        // , : um separador para grandes quantidades numéricas (especificamente números acima de 1000)

        // mostrando o com +:
        System.out.printf("Você tem essa quantidade de dinheiro %+f \n", myDouble);

        // agora, se fosse um valor negativo:
        double num2 = -10.242;
        System.out.printf("Você tem essa quantia de dinheiro: %+f \n", num2);

        // se quisermos espaçar os números preenchendo com 0's, podemos usar um 0 antes de declarar o espaçamento
        System.out.printf("Você tem essa quantia de dinheiro: %020f \n", num2);

        // para mostrarmos a vírgula em números grandes:
        System.out.printf("Você tem essa quantidade de dinheiro: %,.2f \n", myDouble);
    }
}
