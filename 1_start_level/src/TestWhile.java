/**
 * 测试While循环
 */
public class TestWhile {
    public static void main(String[] args) {
        //计算1+2+3+4...+100的累加的和，5050.
        //暴力！
        int sum = 0;
        int i = 1;
        while(i<=100)
        {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

}
