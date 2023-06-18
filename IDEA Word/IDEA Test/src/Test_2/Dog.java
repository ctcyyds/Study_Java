package Test_2;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void kanmen() {
        System.out.println("我会看门");
    }
}
