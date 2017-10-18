package chapter5.section16;

/**
 * Description: for循环打印String数组
 * CreateTime: 2017/10/18 14:18
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class StringArrays {

    private static String[] fruits = new String[]{"apple","pear","orange"};

    public static void main(String[] args) {

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
