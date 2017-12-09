package chapter11.section1;

import java.util.ArrayList;

/**
 * Description: 遍历ArrayList
 * CreateTime: 2017/12/9 16:31
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class GerbilList {

    public static void main(String args[]) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        int gerbilNum = 5;
        for (int i = 0; i < gerbilNum; i++) {
            gerbils.add(new Gerbil(i));
        }
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }
}

class Gerbil {

    private final int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil " + gerbilNumber + " is hopping");
    }
}


