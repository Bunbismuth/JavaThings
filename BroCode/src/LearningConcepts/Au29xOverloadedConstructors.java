public class Au29xOverloadedConstructors {
    public static void main(String[] args) {
        // Overloaded constructors =    Múltiplos construtores dentro de uma classe com o mesmo nome,
        //                              mas com diferentes parâmetros.
        // Assinatura de um construtor = nome + parâmetros

        Au29y1xPizza pizza = new Au29y1xPizza("Borda crocante", "Molho de tomate", "Mussarela", "Peperoni");

        System.out.println("Esses são os ingredientes da sua Pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        // Agora, caso queiramos uma pizza só de queijo? teremos um problema
        // Só podemos invocar uma pizza com 4 argumentos, então por isso deveremos fazer um construtor novo com o mesmo
        // nome porém com funcionamentos diferentes, vamos voltar à nossa classe pizza...
        Au29y1xPizza pizza2 = new Au29y1xPizza("Borda crocante", "Molho de Tomate", "Queijo");

        // Agora podemos acessar os elementos que foram criados pelo segundo construtor da classe que invocamos:
        System.out.println("Esses são os ingredientes da sua Pizza: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        // Pizza vegana:
        Au29y1xPizza pizzaVegana = new Au29y1xPizza("Borda fina", "Molho de Tomate");
        System.out.println("Esses são os ingredientes da sua Pizza: ");
        System.out.println(pizzaVegana.bread);
        System.out.println(pizzaVegana.sauce);

        // Pizza que é só a massa?????
        Au29y1xPizza pizzaBordaInfinita = new Au29y1xPizza("Borda infinita");
        System.out.println("Esses são os ingredientes da sua Pizza: ");
        System.out.println(pizzaBordaInfinita.bread);
    }
}
