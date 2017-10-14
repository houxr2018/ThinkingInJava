package chapter4.section5;

import java.util.Arrays;

/**
 * Description: 实现toBinaryString功能
 * CreateTime: 2017/10/13 10:25
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class NewBitwiseOperators {

    private static int i1 = 0xaaaaaaaa;
    private static int i2 = 0x55555555;

    private static String toBinaryString(int number) {

        //将16进制数转换为二进制
        char[] binarys = new char[32];
        for (int i = 31; i >= 0; i--) {
            binarys[i] = (number & 1) == 1 ? '1' : '0';
            number >>>= 1;
        }

        //默认16进制数为0
        char[] newBinarys = {'0'};

        //去掉二进制数前端的'0'
        for (int i = 0; i < 32; i++) {
            if (binarys[i] != '0') {
                newBinarys = Arrays.copyOfRange(binarys, i, 32);
                break;
            }
        }
        return String.copyValueOf(newBinarys);
    }

    public static void main(String[] args) {

        System.out.println("i1 = " + toBinaryString(i1));
        System.out.println("i2 = " + toBinaryString(i2));
        System.out.println("~i1 = " + toBinaryString(~i1));
        System.out.println("~i2 = " + toBinaryString(~i2));
        System.out.println("i1&i1 = " + toBinaryString(i1 & i1));
        System.out.println("i1&i2 = " + toBinaryString(i1 & i2));
        System.out.println("i1|i1 = " + toBinaryString(i1 | i1));
        System.out.println("i1|i2 = " + toBinaryString(i1 | i2));
        System.out.println("i1^i1 = " + toBinaryString(i1 ^ i1));
        System.out.println("i1^i2 = " + toBinaryString(i1 ^ i2));
    }
}
