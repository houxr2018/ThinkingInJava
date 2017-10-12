package chapter3.section13;

/**
 * Description: 字符转换成二进制
 * CreateTime: 2017/10/12 15:52
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class BinaryChar {

    private static void charToBinary(char ch) {
        System.out.println(Integer.toBinaryString(ch));
    }

    public static void main(String[] args) {
        charToBinary('a');
        charToBinary('B');
        charToBinary('5');
        charToBinary(',');
    }
}
