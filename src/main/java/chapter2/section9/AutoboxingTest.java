package chapter2.section9;

/**
 * Description: 展示自动包装功能
 * CreateTime: 2017/10/10 13:43
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class AutoboxingTest {

    private static byte byteTest(){

        Byte b = 1;
        return b;
    }

    private static short shortTest(){

        Short s = 10;
        return s;
    }

    private static int intTest(){

        Integer i = 100;
        return i;
    }

    private static long longTest(){

        Long l = 1000L;
        return l;
    }

    private static float floatTest(){

        Float f = 10.0f;
        return f;
    }

    private static double doubleTest(){

        Double d = 100.0;
        return d;
    }

    private static boolean booleanTest(){

        Boolean bool = true;
        return bool;
    }

    private static char charTest(){

        Character c = '0';
        return c;
    }

    public static void main(String[] args) {

        System.out.println("byte = " + byteTest());
        System.out.println("short = " + shortTest());
        System.out.println("int = " + intTest());
        System.out.println("long = " + longTest());
        System.out.println("float = " + floatTest());
        System.out.println("double = " + doubleTest());
        System.out.println("boolean = " + booleanTest());
        System.out.println("char = " + charTest());
    }

}
