package chapter7.section11;

import chapter7.section2.Cleanser;
/**
 * Description:
 * CreateTime: 2017/11/23 21:13
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Detergent {

    private Cleanser cleanser = new Cleanser();

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.append(" Detergent.scrub()");
    }

    public void foam() {
        append(" foam()");
    }

    @Override
    public String toString() {
        return cleanser.toString();
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
