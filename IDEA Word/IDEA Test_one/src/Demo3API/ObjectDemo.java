package Demo3API;

/*看方法的源码，选中方法，按下Ctrl+B
* 建议所有子类重写此方法*/
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
