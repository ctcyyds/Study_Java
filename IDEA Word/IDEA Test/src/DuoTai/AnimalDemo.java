package DuoTai;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao=new AnimalOperator();
        Cat c=new Cat();
        ao.userAnimal(c);
        Dog d=new Dog();
        ao.userAnimal(d);
    }
}
