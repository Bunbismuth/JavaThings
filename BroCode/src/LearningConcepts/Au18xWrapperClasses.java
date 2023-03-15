package LearningConcepts;

public class Au18xWrapperClasses {
    public static void main(String[] args) {
        // Classes Wrapper = proporciona um jeito de usar tipos de dados primitivos como tipos por referência
        // É útil, pois tipos por referência possuem vários métodos úteis que facilitam nossa vida
        // As classes wrapper também podem ser usadas com coleções (ex: ArrayList)
        // Única desvantagem é que tipos por referência são mais lentos do que tipos primitivos para processamento

        // Aqui vai como usar-los
        // primitivo    // Wrapper
        // ---------    ----------
        // boolean      Boolean
        // char         Character
        // int          Integer
        // double       Double

        // autoboxing = a conversão automática que o compilador java faz entre classes primitivas para seu tipo por referência correspondente
        // unboxing = o reverso de autoboxing. Uma conversão automática de uma classe wrapper para uma classe primitiva

        // Aqui vai alguns exemplos de wrapper

        // Exemplos de autoboxing:
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Thiago"; // é por isso que a primeira letra de toda string é em maíusculo, porque ela é um tipo por referência

        // Exemplos de unboxing:
        // Basicamente quando tratamos esses tipos por referência como se fossem primitivos

        if(a == true){        // aqui o java faz a conversão automática para boolean quando colocamos ele numa expressão
            System.out.println("Isso é verdadeiro");
        }

        if (b == '@'){
            System.out.println("Verdadeiro também");
        }

    }
}
