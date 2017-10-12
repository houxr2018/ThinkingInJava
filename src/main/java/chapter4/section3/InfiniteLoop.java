package chapter4.section3;

import java.util.ArrayList;
import java.util.List;

import static chapter4.section2.CompareRandom.compare;
import static chapter4.section2.CompareRandom.random;

/**
 * Description: 无限循环section2中的方法。
 * CreateTime: 2017/10/12 17:31
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class InfiniteLoop {

    public static void main(String[] args) {
        while (true) {
            List<Integer> randoms = new ArrayList<>();
            for (int i = 0; i < 25; i++) {
                randoms.add(random());
            }
            compare(randoms);
        }
    }
}
