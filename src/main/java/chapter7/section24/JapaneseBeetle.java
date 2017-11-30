package chapter7.section24;

import static net.mindview.util.Print.print;

/**
 * Description: 初始化顺序
 * CreateTime: 2017/11/30 15:45
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class JapaneseBeetle extends Beetle {

    private int m = printInit("JapaneseBeetle.m initialized");

    private JapaneseBeetle() {
        print("m = " + m);
        print("j = " + j);
    }

    static int x3 = printInit("static JapaneseBeetle.x3 initialized");

    public static void main(String[] args) {
        print("JapaneseBeetle constructor");
        new JapaneseBeetle();
    }
}

class Insect {

    private int i = 9;
    int j;

    Insect() {
        print("i = " + i + ", j = " +j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }
}

class Beetle extends Insect {

    private int k = printInit("Beetle.k initialized");

    Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");
}
