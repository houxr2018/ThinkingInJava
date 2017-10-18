package chapter5.section15;

/**
 * Description: 实例初始化
 * CreateTime: 2017/10/18 13:59
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class InstanceInitialization {

    private String str;
    {
        str = "this is a string";
        System.out.println(str);
    }

    public InstanceInitialization() {
    }

    public static void main(String[] args) {

        new InstanceInitialization();
    }
}
