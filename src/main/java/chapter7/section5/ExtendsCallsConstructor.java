package chapter7.section5;

/**
 * Description: 继承调用构造函数的顺序
 * CreateTime: 2017/11/23 15:59
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class A {

    A() {
        System.out.println("A");
    }
}

class B {

    B() {
        System.out.println("B");
    }
}

class C extends A {

    C() {
        System.out.println("C");
    }

    B b = new B();
}

class D extends C {

    D() {
        System.out.println("D");
    }
}

public class ExtendsCallsConstructor {

    public static void main(String[] args) {
        new D();
    }
}
