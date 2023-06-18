package Demo2;

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
