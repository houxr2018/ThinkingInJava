package chapter4.section8;

/**
 * Description: 测试switch的break语句
 * CreateTime: 2017/10/14 15:13
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class TestSwitch {

    private static void switchWithBreak() {

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("这是0");
                    break;
                case 1:
                    System.out.println("这是1");
                    break;
                case 2:
                    System.out.println("这是2");
                    break;
                default:
                    System.out.println("这是default");
            }
        }
    }

    private static void switchWithoutBreak() {

        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    System.out.println("这是0");
                case 1:
                    System.out.println("这是1");
                case 2:
                    System.out.println("这是2");
                default:
                    System.out.println("这是default");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("加上break");
        switchWithBreak();
        System.out.println("不加break");
        switchWithoutBreak();
    }
}
