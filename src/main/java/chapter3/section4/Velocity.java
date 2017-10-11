package chapter3.section4;

/**
 * Description: 计算速度
 * CreateTime: 2017/10/11 17:08
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class Velocity {

    private static double distance = 2155;
    private static double time = 30;

    private double getVelocity(double distance, double time) {

        return distance/time;
    }

    public static void main(String[] args) {

        Velocity velocity = new Velocity();
        System.out.println(velocity.getVelocity(distance, time));
    }
}
