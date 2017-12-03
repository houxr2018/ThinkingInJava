package chapter7.section12;

/**
 * Description: 垃圾清理
 * CreateTime: 2017/11/30 14:12
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class RootDispose {

    public static void main(String[] args) {
        Stem stem = new Stem(47);
        stem.dispose();
    }
}

class Component1 {

    Component1(int i) {
        System.out.println("Component1 " + i);
    }

    void dispose() {
        System.out.println("Component1 dispose");
    }
}

class Component2 {

    Component2(int i) {
        System.out.println("Component2 " + i);
    }

    void dispose() {
        System.out.println("Component2 dispose");
    }
}

class Component3 {

    Component3(int i) {
        System.out.println("Component3 " + i);
    }

    void dispose() {
        System.out.println("Component3 dispose");
    }
}

class Root {

    private Component1 c1 = new Component1(1);
    private Component2 c2 = new Component2(2);
    private Component3 c3 = new Component3(3);

    Root(int i) {
        System.out.println("Root " + i);
    }

    public void dispose() {
        System.out.println("Root dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
    }
}

class Stem extends Root {

    private Component1 c1 = new Component1(4);
    private Component2 c2 = new Component2(5);
    private Component3 c3 = new Component3(6);

    Stem(int i) {
        super(i);
        System.out.println("Stem " + i);
    }

    @Override
    public void dispose() {
        System.out.println("Stem dispose");
        c3.dispose();
        c2.dispose();
        c1.dispose();
        super.dispose();
    }
}
