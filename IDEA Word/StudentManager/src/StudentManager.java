import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<Student>();
        System.out.println("********欢迎来到学生信息管理系统********");
        while (true) {
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 更新学生信息");
            System.out.println("4 查询学生信息");
            System.out.println("5 退出系统");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("添加信息");
                    addStudent(arr);
                    break;
                case "2":
                    System.out.println("删除信息");
                    deleteStudent(arr);
                    break;
                case "3":
                    System.out.println("更新信息");
                    updateStudent(arr);
                    break;
                case "4":
                    System.out.println("查询信息");
                    findStudent(arr);
                    break;
                case "5":
                    System.out.println("********感谢您的使用！********");
//                    System.exit(0);//Jvm退出
                    return;
            }
        }
    }

    public static void addStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        String sid;//为了让sid在while循环外面能被访问到
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.nextLine();
            boolean flag = isused(arr, sid);
            if (flag) {
                System.out.println("***学号重复，请重新输入！***");
            } else {
                break;
            }
        }
        System.out.println("请输入姓名：");
        String name = sc.nextLine();
        System.out.println("请输入性别：");
        String sex = sc.nextLine();
        System.out.println("请输入年龄：");
        String age = sc.nextLine();
        System.out.println("请输入家庭住址：");
        String location = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setSex(sex);
        s.setAge(age);
        s.setLocation(location);
        //将学生对象添加到集合中
        arr.add(s);
        System.out.println("*******添加成功！*******");
    }

    public static boolean isused(ArrayList<Student> arr, String sid) {
        boolean flag = false;
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            if (s.getSid().equals(sid)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void deleteStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {//遍历集合
            Student s = arr.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("***学号不存在，请重新输入！***");
        } else {
            arr.remove(index);
            System.out.println("*******删除学生成功*******");
        }
    }

    public static void updateStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更新的学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学上姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生性别：");
        String sex = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生家庭住址：");
        String location = sc.nextLine();
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setSex(sex);
        s.setAge(age);
        s.setLocation(location);

        for (int i = 0; i < arr.size(); i++) {
            Student student = arr.get(i);
            if (student.getSid().equals(sid)) {
                arr.set(i, s);
                break;
            }
        }
        System.out.println("*******更新学生信息成功！*******");
    }

    public static void findStudent(ArrayList<Student> arr) {
        if (arr.size() == 0) {
            System.out.println("暂无数据，请添加数据后查询！");
            return;
        }
        System.out.println("学号\t\t姓名\t\t性别\t\t年龄\t\t居住地");
        for (int i = 0; i < arr.size(); i++) {
            Student s = arr.get(i);
            System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getSex() +
                    "\t\t" + s.getAge() + "岁\t" + s.getLocation());
        }
    }
}
