package chapter5.section3;

/**
 * Description: 无参构造器
 * CreateTime: 2017/10/16 14:04
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class DefaultConstructor {

    public DefaultConstructor() {
        System.out.println("调用无参构造器");
    }

    public static void main(String[] args) {

        new DefaultConstructor();
    }

}
