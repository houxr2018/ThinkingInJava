package chapter3.section3;

/**
 * Description: 方法调用时的别名现象
 * CreateTime: 2017/10/11 17:01
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Test {
    float f;
}

public class Aliasing {

    static void f(Test t) {
        t.f = 10f;
    }

    public static void main(String[] args) {

        Test test = new Test();
        test.f = 1.5f;
        System.out.println("1: test.f = " + test.f);
        f(test);
        System.out.println("2: test.f = " + test.f);
    }
}
