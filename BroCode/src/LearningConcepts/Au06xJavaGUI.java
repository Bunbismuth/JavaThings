package LearningConcepts;
import javax.swing.JOptionPane;
public class Au06xJavaGUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Coloque o seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá " + name);

        // o showInputDialog sempre nos retornará uma String, portanto, temos que antes converter-lo para inteiro para
        // fazer a atribuição na variável.
        int age = Integer.parseInt(JOptionPane.showInputDialog("Coloque a sua idade "));
        JOptionPane.showMessageDialog(null, "Você tem " + age + " anos");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Coloque a sua altura "));
        JOptionPane.showMessageDialog(null, "Você tem " + height + " de altura");
    }
}
