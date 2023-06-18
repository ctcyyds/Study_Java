package Demo;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        AnimalOperator an = new AnimalOperator();
        Animal a = new Dog();
        an.useAnimal(a);
        Animal animal = an.getAnimal();
        animal.eat();
    }
}
