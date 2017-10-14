package chapter4.section7;

/**
 * Description: 改写打印1到100的程序，使其在99时结束
 * CreateTime: 2017/10/14 15:07
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class OneToNinetyNine {

    private static void print1() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i == 99)
                break;
        }
    }

    private static void print2() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i == 99)
                return;
        }
    }

    public static void main(String[] args) {
        print1();
        System.out.println();
        print2();
    }
}
