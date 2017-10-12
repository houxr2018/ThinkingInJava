package chapter4.section2;

import java.util.*;

/**
 * Description: 生成25个随机数并根据是否比后一个数大分类
 * CreateTime: 2017/10/12 16:37
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class CompareRandom {

    private static List<Integer> previousLessThanLatter = new ArrayList<>();
    private static List<Integer> previousEqualToLatter = new ArrayList<>();
    private static List<Integer> previousGreaterThanLatter = new ArrayList<>();

    private static void compare(List<Integer> randoms) {

        for (int i = 1; i < randoms.size(); i++) {
            if (randoms.get(i-1) < randoms.get(i)) {
                previousLessThanLatter.add(randoms.get(i-1));
            } else if (randoms.get(i-1) < randoms.get(i)) {
                previousEqualToLatter.add(randoms.get(i-1));
            } else {
                previousGreaterThanLatter.add(randoms.get(i-1));
            }
        }
        previousEqualToLatter.add(randoms.get(24));
    }

    private static int random() {

        Random random = new Random();
        return random.nextInt(1000);
    }

    public static void main(String[] args) {

        System.out.println("生成的随机数有：");
        List<Integer> randoms = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            randoms.add(random());
            System.out.print(randoms.get(i) + " ");
        }
        compare(randoms);
        System.out.println("\n比后一个随机数小的有:");
        for (int i = 0; i < previousLessThanLatter.size(); i++) {
            System.out.print(previousLessThanLatter.get(i) + " ");
        }
        System.out.println("\n与后一个随机数相等的有:");
        for (int i = 0; i < previousEqualToLatter.size(); i++) {
            System.out.print(previousEqualToLatter.get(i) + " ");
        }
        System.out.println("\n比后一个随机数大的有:");
        for (int i = 0; i < previousGreaterThanLatter.size(); i++) {
            System.out.print(previousGreaterThanLatter.get(i) + " ");
        }
    }
}
