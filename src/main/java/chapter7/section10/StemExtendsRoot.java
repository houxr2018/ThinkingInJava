package chapter7.section10;

/**
 * Description: 继承调用带参构造函数2
 * CreateTime: 2017/11/23 19:54
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Component1 {

    Component1(String s) {
        System.out.println("Component1 " + s);
    }
}

class Component2 {

    Component2(String s) {
        System.out.println("Component2 " + s);
    }
}

class Component3 {

    Component3(String s) {
        System.out.println("Component3 " + s);
    }
}

class Root {

    Component1 component1 = new Component1("Root");
    Component2 component2 = new Component2("Root");
    Component3 component3 = new Component3("Root");

    Root(String s) {
        System.out.println("Root " + s);
    }
}

class Stem extends Root {

    Component1 component1 = new Component1("Stem");
    Component2 component2 = new Component2("Stem");
    Component3 component3 = new Component3("Stem");

    Stem(String s) {
        super(s);
        System.out.println("Stem " + s);
    }
}

public class StemExtendsRoot {

    public static void main(String[] args) {
        new Stem("this");
    }
}
