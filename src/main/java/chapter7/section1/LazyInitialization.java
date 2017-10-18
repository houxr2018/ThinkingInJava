package chapter7.section1;

/**
 * Description: 类的惰性初始化
 * CreateTime: 2017/10/18 16:11
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class First {

    public First(String str) {
        System.out.println(str);
    }
}

class Second {

    private First first;

    public Second() {

        System.out.println("First未初始化");
    }

    public void lazy() {

        first = new First("first");
    }
}
public class LazyInitialization {

    public static void main(String[] args) {
        Second s = new Second();
        System.out.println("\n----------------------------\n");
        s.lazy();
    }
}
