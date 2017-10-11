package chapter2.section5;

/**
 * Description: 把DataOnly的值打印出来
 * CreateTime: 2017/10/10 10:17
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class PrintDataOnly {

    public static void main(String[] args) {

        DataOnly data = new DataOnly(47, 1.1, false);

        System.out.println("int = " + data.getI());
        System.out.println("double = " + data.getD());
        System.out.println("boolern = " + data.isBool());
    }
}
