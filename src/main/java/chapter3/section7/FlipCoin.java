package chapter3.section7;

import java.util.Random;

/**
 * Description: 模拟抛硬币
 * CreateTime: 2017/10/11 19:21
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class FlipCoin {

    private void flipCoin(int times) {
        for (int num = 0; num < times; num++) {
            Random random = new Random();
            System.out.print(random.nextInt(2) + "  ");
        }
    }

    public static void main(String[] args) {

        System.out.println("抛硬币，0代表正面，1代表反面");
        FlipCoin flipCoin = new FlipCoin();
        flipCoin.flipCoin(10);
    }
}
