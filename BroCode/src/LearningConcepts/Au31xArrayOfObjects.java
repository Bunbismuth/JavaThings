public class Au31xArrayOfObjects {
    public static void main(String[] args) {
        // Algumas das formas antigas que aprendemos de criar arrays:
        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        // Agora, e se quisermos guardar objetos dentro das nossas listas?
        Au31y1xFood[] refrigerator = new Au31y1xFood[3];
        Au31y1xFood food1 = new Au31y1xFood("pizza");
        Au31y1xFood food2 = new Au31y1xFood("hamburger");
        Au31y1xFood food3 = new Au31y1xFood("hotdog");

        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        System.out.println(refrigerator[0].name);

        // Podemos também atribuir as variáveis de outra forma:
        Au31y1xFood[] refrigerator2 = {food1, food2, food3};
    }
}
