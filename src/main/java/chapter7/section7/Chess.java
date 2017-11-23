package chapter7.section7;

/**
 * Description:
 * CreateTime: 2017/11/23 16:12
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class A {

    A(int i) {
        System.out.println("A = " + i);
    }
}

class B {

    B(int i) {
        System.out.println("B = " + i);
    }
}

class C extends A {

    private int i;

    B b = new B(i);

    C(int i) {
        super(i * 2);
        this.i = i;
        System.out.println("C = " + i);
    }
}

public class Chess {

    public static void main(String[] args) {
        C c = new C(10);
    }
}
