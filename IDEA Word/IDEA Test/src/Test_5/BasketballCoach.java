package Test_5;
/*具体篮球教练类*/
public class BasketballCoach extends Coach{
    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    public BasketballCoach() {
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教运球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃火锅");
    }
}
