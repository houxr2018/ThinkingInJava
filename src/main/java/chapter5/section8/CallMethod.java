package chapter5.section8;

/**
 * Description:
 * CreateTime: 2017/10/16 15:51
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class CallMethod {

    private void a() {
        this.b();
        b();
    }

    private void b() {
        System.out.println("b()");
    }

    public static void main(String[] args) {

        new CallMethod().a();
    }
}
