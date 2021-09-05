/**
 * 测试递归
 */
public class TestRecursion {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        long d1 = System.currentTimeMillis();
        System.out.printf("%d阶乘的结果：%s%n",10,factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("递归费时：%s%n",d2-d1);


        long d3 = System.currentTimeMillis();
        System.out.printf("%d普通循环计算的结果：%s%n",10,factorialLoop(10));
        long d4 = System.currentTimeMillis();
        System.out.printf("普通循环费时：%s%n",d4-d3);
    }

    /**
     * 递归求阶乘
     * @param n
     * @return
     */
    static long factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }

    static long factorialLoop(int n)
    {
        long result = 1;
        while (n>1)
        {
            result*=n*(n-1);
            n-=2;
        }
        return result;
    }
}
