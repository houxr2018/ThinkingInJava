package chapter2.section4;

/**
 * @Description DataOnly完整代码
 * @CreateUser 王熙楠 wangxn@tiansu-china.com
 * @CreateDate 2017/10/10 10:10
 */
public class DataOnly {

    private int i;
    private double d;
    private boolean bool;

    public DataOnly() {
    }

    public DataOnly(int i, double d, boolean bool) {

        this.i = i;
        this.d = d;
        this.bool = bool;
    }

    public int getI() {
        return i;
    }

    public double getD() {
        return d;
    }

    public boolean isBool() {
        return bool;
    }

    public static void main(String[] args) {

        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.bool = false;
    }
}
