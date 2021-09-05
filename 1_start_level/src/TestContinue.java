/**
 * 测试continue continue用于结束本次循环，继续循环下一次
 */
public class TestContinue {
    public static void main(String[] args) {
        //		把100~150之间不能被3整除的数输出，并且每行输出5个
        int cnt = 0;
        for (int i = 100; i < 150; i++) {
            if (i % 3 == 0)
                continue;
            System.out.print(i + "\t");
            cnt++;
            if(cnt%5==0)
            {
                System.out.println();
                cnt = 0;
            }
        }
    }
}
