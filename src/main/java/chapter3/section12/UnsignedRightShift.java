package chapter3.section12;

/**
 * Description: 二进制无符号右移操作
 * CreateTime: 2017/10/12 15:40
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class UnsignedRightShift {

    private static int binary = -1;

    public static void main(String[] args) {

        int num = Integer.toBinaryString(binary).length();
        System.out.println(Integer.toBinaryString(binary));
        binary <<= 1;
        for (int i = 0; i < num; i++) {
            System.out.println(Integer.toBinaryString(binary));
            binary >>>= 1;
        }
    }
}
