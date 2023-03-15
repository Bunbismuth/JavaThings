package LearningConcepts;

public class Au26xOOPJava {
    public static void main(String[] args) {
        // objetos = uma instância de uma classe que pode conter atributos e métodos
        //     Atributos = as características de um objeto
        //     Métodos = as ações que o objeto pode fazer
        // exemplos: (telefones, computador, copo de café, etc)


        // Agora, vamos construir nosso objeto carro, no arquivo Au26y1xCar

        // Após isso, iremos instanciar um objeto do tipo carro aqui neste arquivo
        Au26y1xCar myCar = new Au26y1xCar();

        // Agora, vamos ver alguns atribuitos desse nosso novo objeto:
        System.out.println(myCar.model);
        System.out.println(myCar.make);

        // Então, vamos utilizar algumas das ações que esse objeto nos dá, como dirigir o carro:
        myCar.drive();
        myCar.brake();

        // Podemos usar a mesma classe para ter vários objetos do mesmo tipo, como por exemplo, ter outro carro
        Au26y1xCar myCar2 = new Au26y1xCar();

        System.out.println();
        System.out.println(myCar2.model);
        System.out.println(myCar2.make);

        // Perceba que criamos o mesmo carro, isso se dá pq os atributos sempre são os mesmos
        // para solucionar isso, podemos fazer um construtor de carros para diferenciar os objetos que vão surgir da mesma classe
        // mas isso, só na próxima aula.
    }
}
