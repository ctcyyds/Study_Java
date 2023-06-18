package Test_2;

import Test_1.Student;

public class Demo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("tom");
        c.setAge(3);
        System.out.println(c.getName() + c.getAge());
        c.catchmoth();
        System.out.println("-------");
        Cat c1 = new Cat("jan", 2);
        System.out.println(c1.getName() + c1.getAge());
        c1.catchmoth();
        System.out.println("-------");
        Dog d = new Dog();
        d.setName("jimi");
        d.setAge(3);
        System.out.println(d.getName() + d.getAge());
        d.kanmen();
        System.out.println("-------");
        Dog d1 = new Dog("ai", 3);
        System.out.println(d1.getName() + d1.getAge());
        d1.kanmen();
    }
}
