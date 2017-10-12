package chapter3.section11;

/**
 * Description: 二进制有符号右移操作
 * CreateTime: 2017/10/12 9:34
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class SignedRightShift {

    private static int binary = 0x80000000;

    public static void main(String[] args) {

        int num = Integer.toBinaryString(binary).length();
        for (int i = 0; i < num; i++) {
            System.out.println(Integer.toBinaryString(binary));
            binary >>= 1;
        }
    }
}
