package Demo3API;

public class MathDemo {
    public static void main(String[] args) {
//        返回参数的绝对值
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));
        System.out.println("--------");
//        返回大于或者等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.23));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------");
//        返回小于或者等于参数的最大double值，等于一个整数
        System.out.println(Math.floor(12.23));
        System.out.println(Math.floor(12.56));
        System.out.println("--------");
//        按照四舍五入返回最接近参数的int
        System.out.println(Math.round(12.23F));
        System.out.println(Math.round(12.56F));
        System.out.println("--------");
//        返回两个int值中的较大值
        System.out.println(Math.max(12, 45));
        System.out.println("--------");
//        返回两个int值中的较小值
        System.out.println(Math.min(12, 45));
        System.out.println("--------");
//        返回a的b次幂的值
        System.out.println(Math.pow(2.0, 3.0));
        System.out.println("--------");
//        返回值为double的正值，[0.0, 1.0)
        System.out.println((int) (Math.random() * 100));
    }
}
