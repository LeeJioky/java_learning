/**
 * 测试嵌套循环
 */
public class TestWhileNested {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        System.out.println("###########################");

        //打印99乘法表
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

        System.out.println("###########################");
        //用for循环分别计算100以内的奇数及偶数的和，并输出
        int sum01 = 0;
        int sum02 = 0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)//偶数
            {
                sum01+=i;
            }
            else {
                sum02+=i;
            }
        }
        System.out.println("奇数和："+sum01);
        System.out.println("偶数和："+sum02);


    }
}
