package chapter7.section16;

/**
 * Description: 向上转型
 * CreateTime: 2017/11/30 14:57
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class UpCast {

    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.inTheWater();
        amphibian.onLand();
    }
}

class Amphibian {

    void inTheWater() {
        System.out.println("In The Water");
    }
    void onLand() {
        System.out.println("On Land");
    }
}

class Frog extends Amphibian {

    @Override
    void onLand() {
        System.out.println("Frog On Land");
    }
}
