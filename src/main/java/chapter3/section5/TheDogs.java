package chapter3.section5;

/**
 * Description: 新建Dogs对象
 * CreateTime: 2017/10/11 18:32
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Dogs {

    public String name;
    public String says;

    public Dogs(String name, String says) {
        this.name = name;
        this.says = says;
    }
}

public class TheDogs {

    public static void main(String[] args) {

        Dogs spot = new Dogs("spot", "Ruff!");
        Dogs scruffy = new Dogs("scruffy", "Wurf!");
        System.out.println("1: name: " + spot.name + ", says: " + spot.says);
        System.out.println("2: name: " + scruffy.name + ", says: " + scruffy.says);
    }
}
