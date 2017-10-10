package chapter2.section11;

/**
 * @Description 完成AllTheColorsOfTheRainbow
 * @CreateUser 王熙楠 wangxn@tiansu-china.com
 * @CreateDate 2017/10/10 14:47
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
