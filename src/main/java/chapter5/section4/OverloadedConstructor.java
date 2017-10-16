package chapter5.section4;

/**
 * Description: 带参构造器
 * CreateTime: 2017/10/16 14:04
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class OverloadedConstructor {

    public OverloadedConstructor(String str) {
        System.out.println("调用带参构造器： " + str);
    }

    public static void main(String[] args) {

        new OverloadedConstructor("this string");
    }

}
