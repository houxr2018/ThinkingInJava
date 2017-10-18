package chapter5.section14;

/**
 * Description: 证明static块会在使用前初始化
 * CreateTime: 2017/10/18 11:39
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class StaticInitialization {
    private static String str1;
    private static String str2 = "创建str2";
    static {
        str1 = "创建str1";
    }

    public static void main(String[] args) {
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
