# 一、三运运算&	数据输入

## 1.三个值中的最大值

+ 普通版（三元运算）：在程序中定义三个数值，计算出三个数中的最大值并显示在控制台

```java
public class Practice {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int m = a > b ? a : b;
        int max = m > c ? m : c;
        System.out.println("最大值为：" + max);
    }
}
```

+ 进阶版（Scanner）：键盘录入三个值，计算出三个值中的最大值并显示在控制台

```java
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个值：");
        int a = sc.nextInt();
        System.out.println("请输入第二个值：");
        int b = sc.nextInt();
        System.out.println("请输入第三个值：");
        int c = sc.nextInt();
        int m = a > b ? a : b;
        int max = m > c ? m : c;
        System.out.println("三个值的最大值为：" + max);
    }
}
```

# 二、if语句

## 1.判断奇偶数

键盘录入一个整数，用程序判断该数为奇数或者偶数并将结果输出在控制台

```java
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + "为偶数");
        } else {
            System.out.println(number + "为奇数");
        }
    }
}
```

## 2.奖惩判断

```java
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分值（1~100）：");
        int number = sc.nextInt();
        if (number > 100) {
            System.out.println("你输入的分数有误，请重新输入");
        } else if (number >= 90 && number <= 100) {
            System.out.println("肯德基");
        } else if (number >= 80 && number < 90) {
            System.out.println("金拱门");
        } else if (number >= 70 && number < 80) {
            System.out.println("华莱士");
        } else if (number >= 60 && number < 70) {
            System.out.println("鸡排");
        } else {
            System.out.println("罚抄卷子两遍");
        }
    }
}
```

# 三、switch语句

## 1.月份判断

```java
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份（1~12）：");
        int number = sc.nextInt();
        switch (number) {
            case 12:
            case 1:
            case 2:
                System.out.println(number + "月为冬季");
                break;//如果没有break的话就会出现穿透现象
            case 3:
            case 4:
            case 5:
                System.out.println(number + "月为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(number + "月为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(number + "月为秋季");
                break;
            default:
                System.out.println("你输入的月份有误，请重新输入");
                break;
        }
    }
}
```

# 四、for循环

## 1.100以内偶数和

```java
public class Practice {
    public static void main(String[] args) {
        int sum = 0;//定义一个变量存放和
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;//如果i为偶数，则进行sum+i并将其值赋给sum
            }
        }
        System.out.println("100以内偶数和为：" + sum);
    }
}
```

## 2.水仙花数

```java
public class Practice {
    public static void main(String[] args) {
        int sum=0,cont=0;//定义两个存放数据的变量
        for (int i=100;i<=999;i++){
           int a=i%10,b=i/10%10,c=i/10/10%10;//确定百位、十位、个位数
            if (a*a*a+b*b*b+c*c*c==i){//判断是否为水仙花数
                System.out.println("三位数水仙花数为"+i);
                cont++;
            }
        }
        System.out.println("三位数水仙花数的个数为："+cont);
    }
}
```

## 3.百钱百鸡

一个公鸡5块，母鸡3块，三个小鸡1块，想要100块钱买100只鸡，公鸡、母鸡、小鸡各几只？

```java
public class Practice {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("公鸡" + x + "只，" + "母鸡" + y + "只，" + "小鸡" + z + "只");
                }
            }
        }
    }

```

# 五、while循环

## 1.珠峰

```java
public class Practice {
    public static void main(String[] args) {
        int cont=0;//定义一个计数器
        double p=0.1;//纸张的厚度（mm）
        int zf=8844430;//珠峰的高度（mm）
        while (p<=zf){//判断纸张的厚度是否小于珠峰的高度
            p*=2;//结果为true，p*2赋值给p
            cont++;//在循环中累加，对应折叠了几次
        }
        System.out.println("纸张折叠的次数："+cont);
    }
}
```

## 2.一天时间的显示

```java
public class Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 24; i++) {//外循环控制小时的范围
            for (int j = 0; j < 60; j++) {//内循环控制分钟的范围
                System.out.println(i + "时" + j + "分");
            }
        }
    }
}
```

## 3.100以内逢七过

```java
public class Practice {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.println("100以内逢七过的数：" + i);
            }
        }
    }
}
```



# 六、Random

## 1.猜数字

```java
import java.util.Random;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100) + 1;//产生一个随机数
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你猜的数：");
            int number = sc.nextInt();
            if (number > i) {//输入的数与随机数进行比较
                System.out.println(number + "比随机数大");
            } else if (number < i) {
                System.out.println(number + "比随机数小");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;//猜对之后直接跳出循环
            }
        }
    }
}
```

# 七、数组

## 1.数组中的最值

```java
public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};//静态初始化一个数组
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最值为：" + max);
    }
}
```

## 2.数组遍历

```java
public class Practice {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};//静态初始化
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
```

## 3.不死神兔

一对兔子出生后的第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子不死，一年后兔子为几只？

```java
public class Practice {
    public static void main(String[] args) {
        int[] arr = new int[12];//初始化一个有着12个元素的空数组
        arr[0] = 1;//头两个数组元素都为1
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {//数组遍历
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        int data = arr[11] * 2;//定义一个变量存放数据并求出只数
        System.out.println("兔子的个数为：" + data);
    }
}
```

## 4.数组元素求和

```java
//有这样一个数组，元素是{68，27，95，88，171，996，51，210}，求该数组的元素和。
// 要求求和的元素个位和十位都不能是7，并且只能是偶数
public class Practice {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};//静态初始化
        int sum = 0;//定义一个存储和的变量
        for (int i = 0; i < arr.length; i++) {//数组遍历
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
```



# 八、方法

## 1.最值（方法）

```java
public class Practice {
    public static void main(String[] args) {
        numberMax();//调用方法
    }

    public static void numberMax() {//定义一个求最大值的方法
        int a = 1, b = 2;
        int max = a > b ? a : b;//三元运算
        System.out.println("最大值为：" + max);
    }
}
```

## 2.带参方法的定义和调用

```java
public class Practice {
    public static void main(String[] args) {
//        int number=5;//变量值调用
//        isnumber(number);
        isnumber(4);//常量值调用
    }

    public static void isnumber(int number) {
        if (number % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
```

## 3.最值（数据来自方法参数）

```java
public class Practice {
    public static void main(String[] args) {
        int a = 12, b = 23;//变量值调用
        getMax(a, b);
        getMax(66, 77);//常量值调用
    }

    public static void getMax(int a, int b) {//定义一个取最值的方法
        int max = a > b ? a : b;//三元运算
        System.out.println("最大值为：" + max);
    }
}
```

## 4.最值（带返回值）

```java
public class Practice {
    public static void main(String[] args) {
        int max = getMax(12, 23);
        System.out.println("最大值为："+max);
    }
    public static int getMax(int a,int b){//定义一个带返回值的方法
        if (a>b){
            return a;
        }else {
            return b;
        }
    }
}
```

## 5.方法的参数传递

+ 基本数据类型

```java
public class Practice {
    public static void main(String[] args) {
       int a=100;
        System.out.println(a);//调用方法前
       change(a);
        System.out.println(a);//调用方法后
    }
    public static void change(int a){
        a=200;
    }
}
```

+ 引用数据类型（方法参数的传递）

```java
public class Practice {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};//静态初始化
        System.out.println(arr[2]);//调用方法前
        change(arr);
        System.out.println(arr[2]);//调用方法后
    }

    public static void change(int arr[]) {
        arr[2] = 200;
    }
}
```

+ 数组遍历（遍历的结果在一行上）

```java
public class Practice {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};//静态初始化
        change(arr);//调用方法
    }

    public static void change(int arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {//数组遍历
            if (i == arr.length - 1) {//在元素的后面加逗号
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println("]");
    }
}
```

+ 数组中的最大值

```java
public class Practice {
    public static void main(String[] args) {
        int[] arr = {12, 21, 23, 43, 56};//静态初始化一个数组
        int max = getMax(arr);//调用方法
        System.out.println("数组中的最大值为：" + max);
    }

    public static int getMax(int[] arr) {
        int m = arr[0];//定义一个初始的元素作比较
        for (int i = 1; i < arr.length; i++) {//数组遍历
            if (arr[i] > m) {//最值的判断
                m = arr[i];
            }
        }
        return m;
    }
}
```

# 九、接口

## 1.运动员和教练

我们现在有乒乓球运动员和篮球运动员、乒乓球教练和篮球教练。为了出国交流，跟乒乓球相关的人员都需要学习英语。这个案例中有那些具体类、抽象类、接口类并且用代码实现

1.1学习英语的接口类

```java
public interface SpeakEnglish {
    public abstract void speak();
}
```

1.2人的抽象类

```java
public abstract class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void eat();
}
```

1.3教练抽象类

```java
public abstract class Coach extends Person {
    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }

    public abstract void teach();
}
```

1.4运动员抽象类

```java
public abstract class Player extends Person {
    public Player(String name, int age) {
        super(name, age);
    }

    public Player() {
    }

    public abstract void study();
}
```

1.5具体教练类

```java
/*具体篮球教练类*/
public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }
	//重写抽象类中的方法
    @Override
    public void teach() {
        System.out.println("篮球教练教运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃火锅");
    }
}
*******************
/*具体乒乓球教练类*/
public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }
	//重写抽象类中的方法
    @Override
    public void teach() {
        System.out.println("乒乓球教练教走位");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练下馆子");
    }
	//乒乓球运动需要说英语，调用了接口
    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
```

1.6具体运动员类

```java
//具体篮球运动员类
public class BasketballPlayer extends Player{
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }
	//重写抽象类中的方法
    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球技术");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃麻辣烫");
    }
}
*******************
//具体乒乓球运动员类
public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public PingPangPlayer() {
    }
	//重写抽象类中的方法
    @Override
    public void study() {
        System.out.println("乒乓球运动员学习走位");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃卤煮");
    }
	//乒乓球运动需要说英语，调用了接口
    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
```

1.7测试类

```java
/*乒乓远动员测试类*/
public class PersonDemo {
    public static void main(String[] args) {
        //无参构造方法测试
//        PingPangPlayer pp=new PingPangPlayer();
//        pp.setName("张伟");
//        pp.setAge(12);
//        System.out.println(pp.getName()+pp.getAge());
//        pp.study();
//        pp.eat();
//        pp.speak();
        //带参构造方法测试
        PingPangPlayer pp = new PingPangPlayer("张伟", 12);
        System.out.println(pp.getName() + pp.getAge());
        pp.study();
        pp.eat();
        pp.speak();
    }
}
```



# 实验

## 学生信息管理系统

+ 实体类

```java
public class Student {
    private String sid;
    private String name;
    private String sex;
    private String age;
    private String location;

    public Student() {
    }

    ;

    public Student(String sid, String name, String sex, String age, String location) {
        this.sid = sid;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.location = location;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSid() {
        return sid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
```

+ 方法类

```java
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

    public static void addStudent(ArrayList<Student> arr) {//添加学生信息
        Scanner sc = new Scanner(System.in);
        String sid;//为了让sid在while循环外面能被访问到
        while (true) {
            System.out.println("请输入学号：");
            sid = sc.nextLine();
            boolean flag = isused(arr, sid);//调用判断学号是否重复方法
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

    public static boolean isused(ArrayList<Student> arr, String sid) {//判断学号是否重复
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

    public static void deleteStudent(ArrayList<Student> arr) {//删除学生信息
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

    public static void updateStudent(ArrayList<Student> arr) {//更新学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更新的学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
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

    public static void findStudent(ArrayList<Student> arr) {//查询学生信息
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

```

