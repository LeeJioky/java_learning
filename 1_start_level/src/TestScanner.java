import java.util.Scanner;

/**
 * 测试获得键盘输入
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
