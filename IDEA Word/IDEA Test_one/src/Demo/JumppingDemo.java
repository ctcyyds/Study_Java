package Demo;

public class JumppingDemo {
    public static void main(String[] args) {
        //创建操作类对象，并调用方法
        JumppingOperator ju=new JumppingOperator();//接口不能实例化，需要新建实现类fish
        Jumpping j=new Fish();//多态的形式
        ju.useJumpping(j);
        Jumpping jummping = ju.getJummping();
        jummping.jump();
    }
}
