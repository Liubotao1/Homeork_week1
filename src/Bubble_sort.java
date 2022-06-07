import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        char k;
        //创建对象
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入字符串：");
        //接收数据
        String a = sc.nextLine();  //  next与nextLine的区别，next不能识别空格与Tab键。

        char[] ch = a.toCharArray();//将字符串存入数组
        int length = a.length();//获取字符串长度
        //System.out.println("有序字符串："+ length);

        //冒泡排序法
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if ((int) ch[j] < (int) ch[j + 1]) {
                    k = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = k;
                }
            }
        }

        //输出顺序字符串
        String b = String.copyValueOf(ch); // 将数组转换为字符串
        System.out.println("有序字符串：" + b);

        //输出顺序字符串的ASCII码
        int[] ascii = new int[length];
        for (int i = 0; i < length; i++) {
            ascii[i] = (int) ch[i];
        }
        System.out.println("ASCII码：" + Arrays.toString(ascii));

        sc.close();// 凡是使用IO流的类如果不关闭会一直占用资源，用完关闭。
    }

}

