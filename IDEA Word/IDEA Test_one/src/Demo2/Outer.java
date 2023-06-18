package Demo2;

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
