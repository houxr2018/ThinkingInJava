package chapter5.section22;

/**
 * Description: 枚举类型打印
 * CreateTime: 2017/10/18 14:52
 *
 * @author 王熙楠 wangxn@tiansu-china.com
 */
enum PaperCurrency {
    ONE,
    TWO,
    FIVE,
    TEN,
    TWENTY,
    FIFTY,
}

public class Enum {

    private void print(PaperCurrency paperCurrency) {
        switch (paperCurrency) {
            case ONE:
                System.out.println("ONE");
                break;
            case TWO:
                System.out.println("TWO");
                break;
            case FIVE:
                System.out.println("FIVE");
                break;
            case TEN:
                System.out.println("TEN");
                break;
            case TWENTY:
                System.out.println("TWENTY");
                break;
            case FIFTY:
                System.out.println("FIFTY");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
    public static void main(String[] args) {
        Enum e = new Enum();
        for (PaperCurrency paperCurrency : PaperCurrency.values()) {
            System.out.println(paperCurrency + ", " +paperCurrency.ordinal());
            e.print(paperCurrency);
        }
    }
}
