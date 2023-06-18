package Test_1;

public class StudentDemo {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("曾小贤");
        s.setAge(22);
        System.out.println(s.getName()+s.getAge());
        s.study();
        System.out.println("-------");
        Student s1=new Student("曾老师",22);
        System.out.println(s1.getName()+s1.getAge());
        s1.study();
    }
}
