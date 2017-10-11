package chapter3.section6;

/**
 * Description: 比较对象的引用的结果
 * CreateTime: 2017/10/11 18:42
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

public class DogsComparison {

    private void compare(Dogs dog1, Dogs dog2) {

        System.out.println("dog1 == dog2?\n" + (dog1 == dog2));
        System.out.println("dog1.equals(dog2)?\n" + (dog1.equals(dog2)));
        System.out.println("dog1.name == dog2.name?\n" + (dog1.name == dog2.name));
        System.out.println("dog1.name.equals(dog2.name)?\n" + (dog1.name.equals(dog2.name)));
        System.out.println("dog1.says == dog2.says?\n" + (dog1.says == dog2.says));
        System.out.println("dog1.says.equals(dog2.says)?\n" + (dog1.says.equals(dog2.says)));
    }

    public static void main(String[] args) {

        Dogs spot = new Dogs("spot", "Ruff!");
        Dogs copy = spot;
        Dogs spot2 = new Dogs("spot", "Ruff!");

        DogsComparison dogsComparison = new DogsComparison();
        System.out.println("spot compare to spot2");
        dogsComparison.compare(spot,spot2);
        System.out.println("spot compare to copy");
        dogsComparison.compare(spot,copy);
    }
}
