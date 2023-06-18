package com.ctc.dao;

import com.ctc.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {
            //主界面编写
            System.out.println("*****欢迎来到学生信息管理系统*****");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除学生信息");
            System.out.println("3 更新学生信息");
            System.out.println("4 查询学生信息");
            System.out.println("5 退出");
            System.out.println("请输入您的选择：");
            //键盘录入
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    System.out.println("*******添加*******");
                    addStudent(array);
                    break;
                case "2":
                    System.out.println("*******删除*******");
                    deleteStudent(array);
                    break;
                case "3":
                    System.out.println("*******更新*******");
                    updateStudent(array);
                    break;
                case "4":
                    System.out.println("*******查询*******");
                    findAll(array);
                    break;
                case "5":
                    System.out.println("*****谢谢使用*****");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String sid;
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("该学号已被使用，请重新输入！");
            }else {
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
        String address = sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值为学生对象的成员变量
        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setSex(sex);
        s.setAge(age);
        s.setAddress(address);
        array.add(s);//将学生对象添加到集合中
        System.out.println("*****添加学生信息成功*****");
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要删除学生的SID：");
        String sid = sc.nextLine();
       int index=-1;
       for (int i=0;i< array.size();i++){
           Student s=array.get(i);
           if (s.getSid().equals(sid)){
               index=i;
               break;
           }
       }
       if (index==-1){
           System.out.println("该学生信息不存在，请重新输入！");
       }else{
           array.remove(index);
           System.out.println("*****删除学生信息成功*****");
       }
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想要修改学生的SID：");
        String s = sc.nextLine();
        int index=-1;

        System.out.println("请输入学生新的SID：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新性别：");
        String sex = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生家庭住址：");
        String address = sc.nextLine();
        Student st = new Student();
        st.setSid(sid);
        st.setName(name);
        st.setSex(sex);
        st.setAge(age);
        st.setAddress(address);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if (student.getSid().equals(s)) {
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("该学生信息不存在，请重新输入！");
        }else{
            array.set(index,st);
            System.out.println("*****删除学生信息成功*****");
        }
    }

    public static void findAll(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("*****暂无信息，请添加后查询！*****");
            return;
        }
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println("SID=" + s.getSid() + "\t" + "姓名：" + s.getName()
                    + "\t" + "性别：" + s.getSex() + "\t" + "年龄：" + s.getAge() + "岁" + "\t" + "家庭住址："
                    + s.getAddress());
        }
    }
    public static boolean isUsed(ArrayList<Student>array,String sid){
        boolean flag=false;
        for (int i=0;i< array.size();i++){
            Student s= array.get(i);
            if (s.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
