package LearningConcepts;

public class Au02xVariables {

    /*
    As variáveis são contêineres aos quais você atribui valores, e sua tipagem pode ser alterada dependendo do comportamento que se deseja com o valor.
     */

    /*
    Tipos de Dados:
      * booleans:
        Variáveis que podem conter um valor verdade. Sendo estes Verdadeiro ou Falso.
        Tamanho de 1 bit.

        byte:
        Pode segurar qualquer valor inteiro entre -128 a 127.
        Tamanho de 1 bit.

        short:
        Pode segurar inteiros no intervalo de -32768 a 32768.
        Tamanho de 2 bytes.

        int:
        Pode segurar inteiros no intervalo de -2 bilhões a 2 bilhões.
        Tamanho de 4 bytes.

        long:
        Pode segurar inteiros no intervalo de -9 quintilhões e 9 quintilhões.
        Tamanho de 8 bytes.

        float:
        Pode segurar valores fracionais de 6-7 digitos.
        Tamanho de 4 bytes.

        double:
        Pode segurar valores fracionais de até 15 dígitos.
        Tamanho de 8 bytes.

        char:
        Pode conter apenas 1 caractére, letra, ou um valor ASCII.
        Tamanho de 2 bytes

        String:
        Pode conter uma sequência qualquer de caractéres. É um tipo por referência.
        Tamanho varia.
     */

    public static void main(String[] args){
        int x; // Declaração
        x = 123; // Atribuição de valor

        int y = 123; // Inicialização

        long z = 1023941293192L; // Perceba que no Long temos que por um L no final do número que queremos guardar na variável.

        float u = 12.4f; // Com o float também tempos que por um f no final porque se não o compilador não reconhece o número.

        double w = 15.9232; // Já com os doubles, temos mais precisão e também não usamos o f no final, sendo bem mais comum de usar.

        boolean v = false; // só pode guardar true ou false.

        char symbol = '@'; // só pode segurar um caractére

        String ourName = "Thiago"; // Usamos com o S em caps porque é um tipo por referência.
        
        // Concatenação de strings:
        System.out.println("Meu número é: " + x);


    }
}
