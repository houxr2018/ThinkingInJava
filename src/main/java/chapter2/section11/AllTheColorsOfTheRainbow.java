package chapter2.section11;

/**
 * Description: 完成AllTheColorsOfTheRainbow
 * CreateTime: 2017/10/10 14:47
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class AllTheColorsOfTheRainbow {

    int allIntegerRepresentingColors;

    void changeTheHueOfTheColor(int newHue) {
        allIntegerRepresentingColors = newHue;
    }

    public static void main(String[] args) {

        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.changeTheHueOfTheColor(7);
    }
}
