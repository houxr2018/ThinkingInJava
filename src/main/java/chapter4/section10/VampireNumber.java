package chapter4.section10;

/**
 * Description: 找到所有4位吸血鬼数字。吸血鬼数字是指可以由一对数字相乘而得到，且这对数字各包含乘积的一半位数的数字。
 * CreateTime: 2017/10/14 15:42
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class VampireNumber {

    private static void getVampireNumber() {

        int[] parametrics = new int[4];
        int[] products = new int[4];

        for (int num1 = 10; num1 < 100; num1++) {
            for (int num2 = 10; num2 < 100; num2++) {
                parametrics[0] = num1 / 10;
                parametrics[1] = num1 % 10;
                parametrics[2] = num2 / 10;
                parametrics[3] = num2 % 10;
                int product = num1 * num2;
                if (product > 1000) {
                    products[0] = product / 1000;
                    products[1] = (product % 1000) / 100;
                    products[2] = (product % 100) / 10;
                    products[3] = product % 10;

                    int count = 0;
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (parametrics[i] == products[j]) {
                                count++;
                                parametrics[i] = -1;
                                products[j] = -2;
                                break;
                            }
                        }
                    }
                    if (count == 4) {
                        System.out.println(product + " = " + num1 + " * " + num2);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        getVampireNumber();
    }
}
