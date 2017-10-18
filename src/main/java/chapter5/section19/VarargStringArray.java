package chapter5.section19;

/**
 * Description: 接收可变参数
 * CreateTime: 2017/10/18 14:37
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class VarargStringArray {

    private void printStrings(String... strs) {
        for(String s : strs)
            System.out.println(s);
    }

    public static void main(String args[]) {

        VarargStringArray varargStringArray = new VarargStringArray();
        varargStringArray.printStrings("apple", "pear", "orange");
        varargStringArray.printStrings(new String[] {"apple", "pear", "orange"});
    }
}
