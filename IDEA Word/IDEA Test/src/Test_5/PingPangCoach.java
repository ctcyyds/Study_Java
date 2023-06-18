package Test_5;
/*具体乒乓球教练类*/
public class PingPangCoach extends Coach implements SpeakEnglish{
    public PingPangCoach(String name, int age) {
        super(name, age);
    }

    public PingPangCoach() {
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教走位");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练下馆子");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
