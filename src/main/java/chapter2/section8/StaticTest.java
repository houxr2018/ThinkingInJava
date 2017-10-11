package chapter2.section8;

/**
 * Description: 展示一个类的多个对象共用同一个static作用域
 * CreateTime: 2017/10/10 10:55
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class StaticTest {

    private static int i = 47;

    public static void main(String[] args) {

        StaticTest test1 = new StaticTest();
        StaticTest test2 = new StaticTest();

        System.out.println("test1.i = " + test1.i);
        System.out.println("test2.i = " + test2.i++);
        System.out.println("test1.i = " + test1.i);
        System.out.println("test2.i = " + test2.i);

    }
}
