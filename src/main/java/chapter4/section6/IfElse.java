package chapter4.section6;

/**
 * Description: 修改test方法
 * CreateTime: 2017/10/14 14:49
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class IfElse {

    private static boolean isBetween;

    private static void test1(int testval, int begin, int end) {

        isBetween = testval >= begin && testval <= end;
        System.out.println(testval + "在" + begin + "和" + end + "之间？ " + isBetween);
    }

    private static boolean test2(int testval, int begin, int end) {

        System.out.print(testval + "在" + begin + "和" + end + "之间？ ");
        return testval >= begin && testval <= end;
    }

    public static void main(String[] args) {
        test1(7, 3, 10);
        test1(7, 9, 10);
        test1(5, 1, 4);
        System.out.println(test2(7, 3, 10));
        System.out.println(test2(7, 9, 10));
        System.out.println(test2(5, 1, 4));
    }
}
