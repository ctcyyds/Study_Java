package Demo3API;

public class SystemDemo {
    public static void main(String[] args) {
        //返回当前时间（以毫秒为单位）
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() * 1.0 / 1000
                / 60 / 60 / 24 / 365 + "年");
        //for循环执行用时
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
        //终止当前的Java虚拟机，非零表示异常终止
        System.out.println("开始");
        System.exit(0);
        System.out.println("结束");
    }
}
