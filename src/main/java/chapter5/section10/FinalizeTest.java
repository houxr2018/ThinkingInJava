package chapter5.section10;

/**
 * Description: 编写具有finalize方法的类，不被调用
 * CreateTime: 2017/10/18 10:05
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
public class FinalizeTest {

    private String bookName;

    public FinalizeTest(String bookName) {
        this.bookName = bookName;
        System.out.println(bookName + "被创建");
    }

    protected void finalize() {
        System.out.println(bookName + "被清理");
    }

    public static void main(String[] args) {
        new FinalizeTest("book");
    }
}
