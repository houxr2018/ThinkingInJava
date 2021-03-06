package chapter2.section1;

/**
 * Description: 打印int和char类型的默认值
 * CreateTime: 2017/10/10 9:33
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class DefaultInitialization {

    private int i;
    private char ch;

    public DefaultInitialization() {

        System.out.println("int = " + i);
        System.out.println("char = " + ch);
    }

    public static void main(String[] args) {

        new DefaultInitialization();
    }
}
