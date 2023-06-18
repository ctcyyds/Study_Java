package Demo5;
/*编译看左边，运行看右边*/
public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a=new Cat();//向上转型
        a.eat();
        //创建Cat类对象
      /*  Cat c=new Cat();
        c.eat();
        c.playGame();*/
        //向下转型（强转）
        Cat c=(Cat)a;
        c.eat();
        c.playGame();
    }
}
