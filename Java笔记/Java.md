# 一、内部类

## <1>.内部类概述

就是在一个类中定义一个类。eg:在一个类A的内部定义一个类B，该类B就被称为内部类。

1.格式

![image-20220728084851640](assets/image-20220728084851640.png)

2.内部类的访问特点：

+ 内部类可以直接访问外部类的成员，包括私有
+ 外部类要访问内部类的成员，必须创建对象

```java
public class Outer {
    private int num = 12;

    public class Inner {
        public void show() {
            //内部类可以直接访问外部类的成员，包括私有
            System.out.println(num);
        }
    }

    public void method() {
        //外部类要访问内部类的成员，必须创建对象
        Inner i = new Inner();
        i.show();
    }
}
```

## <2>.成员内部类

按照内部类在类中定义的位置不同，可以分为两种方式：

+ 在类的成员位置：成员内部类
+ 在类的局部位置：局部内部类（方法里面）

格式：外部类名.内部类名 对象名=外部类对象.内部类对象；

```java
public class Outer {
    private int num = 12;

    /*public class Inner {
        public void show() {
            System.out.println(num);
        }
    }*/
    //常见写法
    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
        //只用在测试类中创建外部类对象，调用method()方法即可
    }
}
```

```java
/*测试类*/
public class InnerDemo {
    public static void main(String[] args) {
        /*//创建内部类对象并调用方法
        Outer.Inner i=new Outer().new Inner();//代表的是内部类对象
        i.show();*/
        Outer o = new Outer();
        o.method();
    }
}
```

## <3>.局部内部类

局部内部类是在方法中定义的类，所以外界是无法直接使用的，需要在方法内部创建对象并使用

该类可以直接访问外部类的成员，也可以访问方法内的局部变量

```java
public class Outer {
    private int num = 12;

    public void method() {
        int num1 = 21;
        class Inner {
            public void show() {
                System.out.println(num);
                System.out.println(num1);
            }
        }
        Inner i = new Inner();
        i.show();
    }
}
```

```java
/*测试类*/
public class InnerDemo {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.method();
    }
}
```

+ 局部内部类中特殊的类：匿名内部类

前提：存在一个类或者接口，这里的类可以是具体类也可以是抽象类

![image-20220728093440218](Java黑马.assets/image-20220728093440218.png)

本质：是一个继承了该类或者实现了该接口的子类匿名对象

```java
public class Outer {
    public void method() {
        //本质是一个对象，可以直接调用方法
        /*new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();*/
        //多次调用
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
        i.show();
        i.show();
    }
}
```

```java
/*接口*/
public interface Inter {
    public abstract void show();//public abstract可省略
}
```

```java
/*测试类*/
public class OuterDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}
```

匿名内部类的应用：

```java
/*接口*/
public interface Jumpping {
    void jump();
}
```

```java
/*接口操作类，里面有一个方法，方法的参数是接口名*/
public class JumppingOperator {
    public void show(Jumpping j) {//new Cat();
        j.jump();
    }
}
```

```java
public class Cat implements Jumpping{
    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}
```

```java
/*测试类*/
public class JumppingDemo {
    public static void main(String[] args) {
        //创建接口操作类的对象，调用show方法
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.show(j);
        System.out.println("*************");
        //匿名内部类
        jo.show(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("鱼跃龙门");
            }
        });
    }
}
```

# 二、常用API

## <1>.Math

Math包含执行基本数字运算方法

看类的成员是否都是静态的，如果是，通过类名就可以直接调用

![image-20220728103747150](Java黑马.assets/image-20220728103747150.png)

```java
public class MathDemo {
    public static void main(String[] args) {
//        返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------");
//        返回大于或者等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.23));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");
//        返回小于或者等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.23));
        System.out.println(Math.floor(12.56));
        System.out.println("--------");
//        按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.23F));
        System.out.println(Math.round(12.56F));
        System.out.println("--------");
//        返回两个int值中的较大值
        System.out.println(Math.max(12, 45));
        System.out.println("--------");
//        返回两个int值中的较小值
        System.out.println(Math.min(12, 45));
        System.out.println("--------");
//        返回a的b次幂的值
        System.out.println(Math.pow(2.0, 3.0));
        System.out.println("--------");
//        返回值为double的正值，[0.0, 1.0)
        System.out.println((int) (Math.random() * 100));
    }
}
```

## <2>.System

1.概述：System包含几个有用的类字段和方法，它不能被实例化

![image-20220729085251476](Java黑马.assets/image-20220729085251476.png)

```java
public class SystemDemo {
    public static void main(String[] args) {
        //返回当前时间（以毫秒为单位）
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() * 1.0 / 1000
                / 60 / 60 / 24 / 365 + "年");
        //for循环执行用时
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
        //终止当前的Java虚拟机，非零表示异常终止
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");
    }
}
```

## <3>.Object

1.概述：Object是类层次结构的根，每个类都可以将Object作为超类。所有类都直接或者间接的继承自该类

Ps:子类的构造方法默认访问的是父类的无参构造方法，因为它们的顶级父类只有无参构造方法

![image-20220729094836796](Java黑马.assets/image-20220729094836796.png)

2.toString

```java
//在实体类中重写Object中的toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
```

```java
/*看方法的源码，选中方法，按下Ctrl+B
* 建议所有子类重写此方法*/
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张伟");
        s.setAge(12);
        System.out.println(s);
        System.out.println(s.toString());
        /*public void println(Object x) {//x=s
        String s = String.valueOf(x);
        synchronized (this) {
            print(s);
            newLine();
        }
    }
        public static String valueOf(Object obj) {//obj=x
        return (obj == null) ? "null" : obj.toString();//学生类默认继承了Object类，所以用的是Object中的toString方法
    }
        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }*/
    }
}
```

3.equals

```java
//重写Object中的equals()方法
    @Override
    public boolean equals(Object o) {
        /*
        this----s
        o----s1
         */
        //比较地址是否相同
        if (this == o) return true;
        //判断参数是否为null
        //判断两个对象是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;//student=s1;
        //比较年龄是否相同
        if (age != student.age) return false;
        //比较姓名是否相同
        return name != null ? name.equals(student.name) : student.name == null;
    }
```

```java
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张伟");
        s.setAge(12);
        Student s1=new Student();
        s1.setName("张伟");
        s1.setAge(12);
        System.out.println(s==s1);//比较的是两个地址值
        System.out.println(s.equals(s1));
        /*
        public boolean equals(Object obj) {
        //this-----s
        //obj-----s1(比较的还是两个地址值，需重写equals方法)
        return (this == obj);
    }
         */
    }
}
```

## <4>.Arrays

1.冒泡排序

排序：将一组数据按照固定的规则进行排列

冒泡排序：一种排序的方式，对要进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，依次对所有数据进行操作，直至所有数据按要求完成排序

+ 如果有n个数据进行排序，总共需要比较n-1次
+ 每一次比较完毕，下一次的比较就会少一个数据参与

2.Arrays工具类的设计思想：

+ 构造方法用private修饰（防止外界创建对象）
+ 成员用public static修饰（使用类名访问该成员方法）

```java
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {91, 27, 83, 44, 65};
        //返回指定数组的内容的字符串表示形式
        System.out.println("排序前" + Arrays.toString(arr));
        //按照数字顺序排列指定的数组
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));
    }
}
```

## <5>.基本类型包装类

1.概述：将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据

2.常用的操作之一：用于基本数据类型与字符串之间的转换

![image-20220803082105277](Java黑马.assets/image-20220803082105277.png)

3.Integer:包装一个对象的原始类型int的值

![image-20220803082407466](Java黑马.assets/image-20220803082407466.png)

```java
 		/*//构造方法（已过时）
        Integer i=new Integer(100);
        System.out.println(i);
        Integer i1=new Integer("100");
        System.out.println(i1);
         */
        //静态方法获取
        Integer i = Integer.valueOf(100);
        System.out.println(i);
        Integer i1 = Integer.valueOf("100");
        System.out.println(i1);
```

4.int和String类型相互转换

```java
//int--->String
        int number = 12;
        //方法一
        String s1 = "" + number;
        System.out.println(number);
        //方法二
        String s2 = String.valueOf(number);
        System.out.println(s1);
//String--->int
        String s = "32";
        //方法一(String-->Integer-->int)
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);
        //方法二
        int y = Integer.parseInt(s);
        System.out.println(y);
```

5.自动装箱和拆箱

+ 装箱：把基本数据类型转换为对应的包装类类型
+ 拆箱：把包装类类型转换为对应的基本数据类型

```java
//装箱
Integer i=100;//自动装箱
//拆箱
i += 200;
System.out.println(i);

```

ps:只要是对象，在使用前就必须进行不为null的判断

6.案例

有一个字符串“91 27 46 38 50”，最终输出结果是“27 38 46 50 91”

```java
		String s = "91 27 46 38 50";
        //把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(" ");//通过split方法得到一个String数组
        int[] arr = new int[strArray.length];//把String[]数组中的每一个元素存储到int数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);//parseInt把字符串数据转成int数据
        }
        //对int数组进行排序
        Arrays.sort(arr);
        //把排序后的int数组中的元素进行拼接得到一个字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
```

## <6>.日期类

1.Date类

代表了一个特定的时间，精确到毫秒

![image-20220803100253411](Java黑马.assets/image-20220803100253411.png)

常用方法：

![image-20220803101001950](Java黑马.assets/image-20220803101001950.png)

```java
 Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
```

2.SimpleDateFormat

它是一个具体的类，用于以区域设置敏感的方式格式化和解析日期
