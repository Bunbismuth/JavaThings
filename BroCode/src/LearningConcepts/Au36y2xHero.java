package LearningConcepts;

public class Au36y2xHero extends Au36y1xPerson{
    String power;

    Au36y2xHero(String name, int age, String power){
        // Chamando a super classe
        super(name, age);
        this.power = power;
    }

    // Vamos supor que temos um método toString() dentro da nossa subclasse também mas popdemos reaproveitar a da nossa superclasse
    // Portanto, podemos fazer assim:
    
    @Override
    public String toString(){
        // Como vamos reaproveitar o método toString() da classe pai, fazemos um super.métodoQueVamosReaproveitar
        return super.toString()+this.power+"\n";
    }
}
