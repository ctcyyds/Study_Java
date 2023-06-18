package Demo3API;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {91, 27, 83, 44, 65};
        //返回指定数组的内容的字符串表示形式
        System.out.println("排序前" + Arrays.toString(arr));
        //按照数字顺序排列指定的数组
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));
    }
}
