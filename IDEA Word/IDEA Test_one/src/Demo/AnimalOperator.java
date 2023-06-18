package Demo;

public class AnimalOperator {
    public void useAnimal(Animal a){
        a.eat();
    }
    public Animal getAnimal(){
        Animal a=new Dog();
        return a;
    }
}
