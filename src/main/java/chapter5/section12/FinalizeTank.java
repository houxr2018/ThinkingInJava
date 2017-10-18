package chapter5.section12;

/**
 * Description: 对象被清理时需要为空状态
 * CreateTime: 2017/10/18 10:40
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Tank {
    private boolean full = false;

    public Tank() {
        System.out.println("Tank已经满了");
        full = true;
    }

    protected void finalize() {
        if (full) {
            System.out.println("Tank没有被清理");
        }
        else {
            System.out.println("Tank已经被清理");
        }
    }

    public void clean() {
        full = false;
    }
}

public class FinalizeTank {

    public static void main(String[] args) {

        new Tank();
        new Tank().clean();
        System.gc();
        System.runFinalization();
    }
}
