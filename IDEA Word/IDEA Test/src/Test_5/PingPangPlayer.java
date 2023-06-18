package Test_5;

//具体乒乓球运动员类
public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    public PingPangPlayer() {
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习走位");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃卤煮");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
