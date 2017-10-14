package chapter4.section9;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 生成斐波那契数列
 * CreateTime: 2017/10/14 15:22
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Fibonacci {

    private static List<Integer> fibonaccis = new ArrayList<>();

    private static void getFibonacci(int count) {

        for (int i = 0; i < count; i++) {
            if (i < 2)
                fibonaccis.add(1);
            else
                fibonaccis.add(fibonaccis.get(i - 1) + fibonaccis.get(i - 2));
        }
    }

    public static void main(String[] args) {

        try {
            int number = Integer.parseInt(args[0]);
            if (number > 0) {
                getFibonacci(number);
                for (int fibonacci : fibonaccis) {
                    System.out.print(fibonacci + " ");
                }
            }
            else
            System.out.println("输入错误");
        } catch (Exception e) {
            System.out.println("输入错误");
        }
    }
}
