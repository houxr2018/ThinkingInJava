package chapter5.section11;

/**
 * Description: 强制垃圾处理 //TODO：2017/10/18 还不理解System.gc()与System.runFinalization()的意义与区别，以后具体了解。
 * CreateTime: 2017/10/18 10:14
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class FinalizeTest {

    private static String bookName;

    public FinalizeTest(String str) {
        System.out.println(bookName + "被创建");
        bookName = str;
    }

    protected void finalize() {
        System.out.println(bookName + "被清理");
        bookName = null;
    }

    public static void main(String[] args) {
        new FinalizeTest("book");
        System.out.println("书名 + " + bookName);
        System.gc();
        System.runFinalization();
        System.out.println("书名 + " + bookName);
    }
}
