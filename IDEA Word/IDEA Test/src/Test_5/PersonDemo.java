package Test_5;

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
