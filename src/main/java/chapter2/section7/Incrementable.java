package chapter2.section7;

/**
 * Description: 测试静态方法的调用
 * CreateTime: 2017/10/10 10:35
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class StaticTest {

    static int i = 47;
}

public class Incrementable {

    private static void increment() {

        StaticTest.i++;
        System.out.println("int = " + StaticTest.i);
    }

    public static void main(String[] args) {

        Incrementable sf = new Incrementable();
        sf.increment();

        Incrementable.increment();

        increment();
    }
}
