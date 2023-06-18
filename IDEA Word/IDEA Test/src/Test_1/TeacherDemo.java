package Test_1;

public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setName("张大炮");
        t.setAge(30);
        System.out.println(t.getName()+t.getAge());
        t.teach();
        System.out.println("-------");
        Teacher t1=new Teacher("斯内克",20);
        System.out.println(t1.getName()+t1.getAge());
        t1.teach();
    }
}
