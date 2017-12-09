package chapter11.section2;

import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Description: set
 * CreateTime: 2017/12/9 16:45
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class SampleCollection {

    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<>();
        int num = 10;
        for (int i = 0; i < num; i++) {
            c.add(i);
            c.add(i - 1);
        }
        for (Integer i : c) {
            System.out.print(i + ", ");
        }
    }
}
