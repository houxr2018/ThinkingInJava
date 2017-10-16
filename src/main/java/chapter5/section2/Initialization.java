package chapter5.section2;

/**
 * Description: 比较定义时初始化和构造器初始化的差异，构造器的使用更加灵活，可以赋值。
 * CreateTime: 2017/10/16 10:44
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Initialization {

    private String str1 = "String initialization";
    private String str2;

    public Initialization(String str) {
        this.str2 = str;
    }

    public static void main(String[] args) {

        Initialization initialization = new Initialization("String initialization");
        System.out.println("str1 = " + initialization.str1);
        System.out.println("str2 = " + initialization.str2);
    }
}
