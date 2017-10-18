package chapter5.section9;

/**
 * Description: 一个构造器通过this调用另一个构造器
 * CreateTime: 2017/10/18 9:00
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class CallByThis {

    public CallByThis() {

    }

    public CallByThis(String str) {
        System.out.println(str);
    }

    public CallByThis(int i) {
        this("int = " + i);
    }

    public static void main(String[] args) {
        new CallByThis(7);
        new CallByThis(10);
    }
}
