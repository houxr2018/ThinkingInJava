package chapter5.section6;

/**
 * Description: bark()的重载方法接受两个参数顺序不同
 * CreateTime: 2017/10/16 14:19
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Dog {

    public void bark(int i, char ch) {
        System.out.println("barking");
    }

    public void bark(char ch, int i) {
        System.out.println("howling");
    }
}

public class OverloadedDog {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark(1, '1');
        dog.bark('1', 1);
    }
}
