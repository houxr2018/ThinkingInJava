package chapter3.section2;

/**
 * Description:
 * CreateTime: 2017/10/11 16:52
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Test {
    float f;
}

public class Aliasing {

    public static void main(String[] args) {

        Test test1 = new Test();
        Test test2 = new Test();

        test1.f = 1.1f;
        test2.f = 19.5f;
        System.out.println("1: test1.f = " + test1.f + "test2.f = " + test2.f);
        test1 = test2;
        System.out.println("2: test1.f = " + test1.f + "test2.f = " + test2.f);
        test1.f = 27.7f;
        System.out.println("3: test1.f = " + test1.f + "test2.f = " + test2.f);
    }
}
