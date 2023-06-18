package Test;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("张伟");
        t1.setAge(80);
        System.out.println(t1.getName() + t1.getAge());
        t1.teach();
        System.out.println("-------");
        Teacher t2 = new Teacher("斯内克", 20);
        System.out.println(t2.getName() + t2.getAge());
        t2.teach();
    }
}
