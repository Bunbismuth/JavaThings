public class Au29y1xPizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Au29y1xPizza(String bread, String sauce, String cheese, String topping){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    // Podemos criar um outro construtor com o mesmo nome da classe só que com parâmetros diferentes
    Au29y1xPizza(String bread, String sauce, String cheese){
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }
    // Caso o cliente queira uma pizza sem queijo, como por exemplo uma pizza vegana, podemos tirar o queijo:
    Au29y1xPizza(String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }

    // E caso alguma pessoa curiosa quiser também uma pizza que é só a massa, podemos ter também:
    Au29y1xPizza(String bread){
        this.bread = bread;
    }
}
