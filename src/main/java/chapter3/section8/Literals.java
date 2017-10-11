package chapter3.section8;

/**
 * Description: 展示八进制和十六进制
 * CreateTime: 2017/10/11 19:39
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Literals {

    private static long sixteen = 0x177;
    private static long eight = 0177;

    public static void main(String[] args) {

        System.out.println("0x17f = " + Long.toBinaryString(sixteen));
        System.out.println("0177 = " + Long.toBinaryString(eight));
    }
}
