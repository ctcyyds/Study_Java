package Demo3API;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //把字符串中的数字数据存储到一个int类型的数组中
        String[] strArray = s.split(" ");//通过split方法得到一个String数组
        int[] arr = new int[strArray.length];//把String[]数组中的每一个元素存储到int数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);//parseInt把字符串数据转成int数据
        }
        //对int数组进行排序
        Arrays.sort(arr);
        //把排序后的int数组中的元素进行拼接得到一个字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
