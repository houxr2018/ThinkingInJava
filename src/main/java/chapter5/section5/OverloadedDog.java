package chapter5.section5;

/**
 * Description: 重载bark()方法
 * CreateTime: 2017/10/16 14:19
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
class Dog {

    public void bark() {
        System.out.println("barking");
    }

    public void bark(int i) {
        System.out.println("howling");
    }
}
public class OverloadedDog {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
    }
}
