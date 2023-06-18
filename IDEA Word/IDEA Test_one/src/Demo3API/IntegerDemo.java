package Demo3API;

public class IntegerDemo {
    public static void main(String[] args) {
        //int--->String
        int number = 12;
        //方法一
        String s1 = "" + number;
        System.out.println(number);
        //方法二
        String s2 = String.valueOf(number);
        System.out.println(s1);
        //String--->int
        String s = "32";
        //方法一(String-->Integer-->int)
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);
        //方法二
        int y = Integer.parseInt(s);
        System.out.println(y);
    }
}
