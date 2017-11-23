package chapter7.section2;

/**
 * Description: 类的继承
 * CreateTime: 2017/11/23 14:35
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {

        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }
}

class Detergent extends Cleanser {

    @Override
    public void scrub() {
        append(" Detergent.scrub()");
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {

        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }
}

class ExtendDetergent extends Detergent {

    @Override
    public void scrub() {
        append(" ExtendDetergent.scrub()");
    }

    public void sterilize() {
        append(" sterilize()");
    }

    public static void main(String[] args) {

        ExtendDetergent x = new ExtendDetergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        x.sterilize();
        System.out.println(x);
        Detergent.main(args);
    }
}
