package chapter4.section4;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 显示素数
 * CreateTime: 2017/10/12 19:49
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Primes {

    private static int max = 100;
    private static List<Integer> primes = new ArrayList<>();

    private static void getPrimes(int max) {

        first:
        for (int i = 1; i <= max; i++) {
            //只需要计算到i/2
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0)
                    continue first;
            }
            primes.add(i);
        }
    }

    public static void main(String[] args) {

        getPrimes(max);
        System.out.println("100以内的素数有：");
        for (Integer prime : primes) {
            System.out.print(prime + " ");
        }
    }
}
