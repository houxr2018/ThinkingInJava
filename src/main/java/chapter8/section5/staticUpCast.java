package chapter8.section5;

/**
 * Description: 多态，属性和静态方法不支持多态
 * CreateTime: 2017/12/1 16:22
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Super {

    public int field = 0;

    public int getField() {
        return field;
    }

    public static String staticGetField() {
        return "Super";
    }
}

class Sub extends Super {

    public int field = 1;
    public int field2 = 2;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }

    public static String staticGetField() {
        return "Sub";
    }
}

public class staticUpCast {

    public static void main(String[] args) {
        Super sub = new Sub();
        System.out.println(sub.field);
        System.out.println(sub.getField());
        System.out.println(sub.staticGetField());

        Sub sub1 = new Sub();
        System.out.println(sub1.field);
        System.out.println(sub1.getField());
        System.out.println(sub1.getSuperField());
        System.out.println(sub1.staticGetField());
    }
}
