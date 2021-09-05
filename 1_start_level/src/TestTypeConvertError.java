/**
 * 测试类型转换常见问题
 */
public class TestTypeConvertError {
    public static void main(String[] args) {
        int money = 1000000000;
        int years =20;
        int total = money*years;
        System.out.println(total);
        long total1 = money*years;
        System.out.println(total1);
        long total2 = ((long)years)*money;
        System.out.println(total2);
    }
}
