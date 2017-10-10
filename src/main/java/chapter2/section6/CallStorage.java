package chapter2.section6;

/**
 * @Description 调用storage方法
 * @CreateUser 王熙楠 wangxn@tiansu-china.com
 * @CreateDate 2017/10/10 10:29
 */
public class CallStorage {

    private int storage(String s) {

        return s.length() * 2;
    }

    public static void main(String[] args) {

        String str = "test";

        CallStorage callStorage = new CallStorage();
        System.out.println("storage = " + callStorage.storage(str));
    }
}
