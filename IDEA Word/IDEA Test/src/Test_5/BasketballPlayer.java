package Test_5;
//具体篮球运动员类
public class BasketballPlayer extends Player{
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }

    public BasketballPlayer() {
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习篮球技术");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃麻辣烫");
    }
}
