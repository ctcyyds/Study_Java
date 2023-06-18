package Test_3;
/*测试类*/
public class AnimalDemo {
    public static void main(String[] args) {
        //创建猫类对象进行测试
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        a=new Cat("加菲",5);
        System.out.println(a.getName()+a.getAge());
        a.eat();

        //创建狗类对象进行测试
        Animal d=new Dog();
        d.setName("小黄");
        d.setAge(1);
        System.out.println(d.getName()+d.getAge());
        d.eat();

        d=new Dog("小黄",1);
        System.out.println(d.getName()+d.getAge());
        d.eat();
    }
}
