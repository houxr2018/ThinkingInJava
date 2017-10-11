package chapter3.section10;

/**
 * Description: 测试位操作符的使用
 * CreateTime: 2017/10/11 19:54
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class BitwiseOperators {

    private static int i1 = 0xaaaaaaaa;
    private static int i2 = 0x55555555;

    public static void main(String[] args) {

        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        System.out.println("~i1 = " + Integer.toBinaryString(~i1));
        System.out.println("~i2 = " + Integer.toBinaryString(~i2));
        System.out.println("i1&i1 = " + Integer.toBinaryString(i1&i1));
        System.out.println("i1&i2 = " + Integer.toBinaryString(i1&i2));
        System.out.println("i1|i1 = " + Integer.toBinaryString(i1|i1));
        System.out.println("i1|i2 = " + Integer.toBinaryString(i1|i2));
        System.out.println("i1^i1 = " + Integer.toBinaryString(i1^i1));
        System.out.println("i1^i2 = " + Integer.toBinaryString(i1^i2));
    }
}
