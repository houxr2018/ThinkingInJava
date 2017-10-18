package chapter5.section13;

/**
 * Description: 试验static的初始化
 * CreateTime: 2017/10/18 11:31
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println("Inside main()");
//        Cups.cup1.f(99);
    }
//    static Cups cups1 = new Cups();
//    static Cups cups2 = new Cups();
}
