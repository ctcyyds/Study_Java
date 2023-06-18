package Test_4;

import java.util.Date;

public class AnimaDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(12);
        System.out.println(a.getName()+a.getAge());
        a.eat();
        System.out.println("*******");
        a=new Cat("加菲",12);
        System.out.println(a.getName()+a.getAge());
        a.eat();
        System.out.println("-------");
        Animal d=new Dog();
        d.setName("卡拉");
        d.setAge(11);
        System.out.println(d.getName()+d.getAge());
        d.eat();
        System.out.println("*******");
        d=new Dog("卡拉",11);
        System.out.println(d.getName()+d.getAge());
        d.eat();
    }
}
