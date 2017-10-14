package chapter2.section10;

/**
 * Description: 打印运行java时命令行输入的字符串
 * CreateTime: 2017/10/10 14:24
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class PrintArgs {

    public static void main(String[] args) {

        try {
            System.out.println("args[0] = " + args[0]);
            System.out.println("args[1] = " + args[1]);
            System.out.println("args[2] = " + args[2]);
        } catch (Exception e) {
            System.out.println("输入少于3个字符串");
            e.printStackTrace();
        }
    }
}
