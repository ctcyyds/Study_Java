package Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();//创建集合对象
        addStudent(arr);//调用方法
        addStudent(arr);
        addStudent(arr);
        for (int i = 0; i < arr.size(); i++) {//遍历集合
            Student s = arr.get(i);
            System.out.println(s.getName() + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        Student s = new Student();//创建学生对象
        s.setName(name);//把键盘录入的数据赋值给学生对象的成员变量
        s.setAge(age);
        arr.add(s);//往集合中添加学生对象
    }
}
