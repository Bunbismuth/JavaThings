package LearningConcepts;

public class Au25xFinalKeyword {
    public static void main(String[] args) {
        // Qualquer coisa é declarada como final não pode ser mudada ou atualizada depois no seu programa

        double pi = 3.14159;

        pi = 4;
        System.out.println(pi);
        // Podemos ver que ela muda depois de declararmos, mas, se fizermos com final

        // Uma prática comum que os programadores fazem é que tudo que tem final é toddo em CAPS
        final double PI = 3.14159;

        System.out.println(PI);
    }
}
