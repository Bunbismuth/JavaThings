package LearningConcepts;

public class Au22y1xMethods {
    public static void main(String[] args) {
        // Podemos também retornar algo dentro do nosso método, para que receba o valor que gerou:
        int x = 3;
        int y = 4;

        // Perceba que quando chamamos o método, nada é retornado na tela, isso é pq o método retornou um valor porém não foi usado para nenhum output
        add(x,y);

        // Logo, para mostrarmos o resultado, podemos usar um print:
        System.out.println(add(x,y));

        // Perceba também que ambos o método main e o add tem a variável z, porém não há nenhum erro de compilação
        // isso se dá porque são variáveis locais, ou seja, apenas visíveis dentro do método que estão
        int z = add2(x, y);
        System.out.println(z);
    }

    // Perceba que como estamos querendo retornar um valor inteiro, usamos o int após o static para fazer isso
    static int add(int x, int y){
        int z = x + y;
        return z;
    }

    // Podemos também fazer a conta direto, sem precisar declarar uma variável que guarde:
    static int add2(int x, int y) {
        return x + y;
    }
}
