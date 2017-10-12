package chapter3.section14;

/**
 * Description: 比较两个字符串
 * CreateTime: 2017/10/12 16:09
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class CompareString {

    private static void compare(String str1, String str2) {

        System.out.println(str1 + " == " + str2 + ": " + (str1 == str2));
        System.out.println(str1 + " != " + str2 + ": " + (str1 == str2));
        System.out.println(str1 + ".equals(" + str2 + "): " + (str1.equals(str2)));
    }

    public static void main(String[] args) {

        String str1 = new String("str1");
        String str2 = new String("str2");
        compare(str1, str2);
        compare(str1, "str1");
        compare("str1", "str1");
    }
}
