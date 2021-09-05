/**
 * 测试位运算符
 */
public class TestOperation04 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);

        //移位
        int c = 3<<2;
        System.out.println(c);
        System.out.println(18>>1);
    }
}
