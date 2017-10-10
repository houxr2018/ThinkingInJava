package chapter2.section5;

/**
 * @Description DataOnly
 * @CreateUser 王熙楠 wangxn@tiansu-china.com
 * @CreateDate 2017/10/10 10:10
 */
public class DataOnly {

    private int i;
    private double d;
    private boolean bool;

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

}
