package Demo3API;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");
        long time = System.currentTimeMillis();
        d.setTime(time);
        System.out.println(d);
    }
}
