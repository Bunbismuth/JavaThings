package aIterable;

public class Main {
    public static void main(String[] args) {

        var list = new GenericList<String>();
        // Podemos iterar sobre nossa lista puxando o método Iterator que acabamos de colocar no objeto
        var iterator = list.iterator();
        list.add("a");
        list.add("b");
        // Esse método é bom pois podemos executar ele sem saber sua implementação interna, tendo uma maior segurança de código

        // Para percorremos por nossa lista, podemos usar o método hasNext para saber se ainda há elementos próximos na lista e
        // colocar dentro de um while loop.
        while (iterator.hasNext()){
            var current = iterator.next();
            System.out.println(current);
        }

        // Podemos também fazer essa implementação com o for each
        for (var item : list){
            System.out.println(item);
        }
        // Quando usamos o for, nativamente o java chama o método iterator do objeto que estamos passando, então,
        // podemos dizer que é sintaticamente igual ao while loop que fizemos

    }
}