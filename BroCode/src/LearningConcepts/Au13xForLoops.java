package LearningConcepts;

public class Au13xForLoops {
    public static void main(String[] args) {
        // Um for loop executa um bloco de código qualquer por quantas vezes você quiser
        // Portanto, sempre precisamos saber quantas vezes o código será executado antes de criar um for loop

        // A primeira parte do for é para declararmos um indexador
        // A segunda parte é para a condicional que fará com que o loop pare
        // A terceira parte é para definir quanto será incrementado ao indexador a cada iteração do loop
        System.out.println("Contagem de 0 a 10:");
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        // Agora, se quisermos também podemos decrementar o nosso indexador, para fazer uma contagem regressiva por exemplo
        System.out.println("Contagem Regresiva de 10 a 0: ");
        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("Feliz ano novo!!!");
    }
}
