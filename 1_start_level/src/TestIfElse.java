/**
 * 测试 ifelse 双选择结构
 */

public class TestIfElse {
    public static void main(String[] args) {
        //随机产生一个[0.0, 4.0)区间的半径，并根据半径求圆的面积和周长
        double r = 4*Math.random();
        double area = Math.PI*Math.pow(r,2);
        double circle = 2*Math.PI*r;
        if(area>circle)
            System.out.println("面积大于周长");
        else
            System.out.println("周长大于面积");
    }
}
