package Test_1;

public class Student extends Person {
    public Student(){}
    public Student(String name,int age){
        super(name, age);
    }
    public void study(){
        System.out.println("好好学习，天天向上");
    }
}
