package subject.math;

/**
 * Created by huangxin on 2017/6/14.
 * 求平方根
 * 目前只能求保证是整数的平方根
 */
public class Sqrt {
    public static int step = 0;

    public static int getSqrt(int target) {
        step = 0;
        int res = 1, guess = target;
        while (res != guess) {
            step += 1;
            res = (int) Math.floor((res + guess) / 2);
            guess = (int) Math.floor(target / res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getSqrt(81) + "---程序运行步数:" + step);
        System.out.println(getSqrt(550564) + "---程序运行步数:" + step);
        System.out.println(getSqrt(20811844) + "---程序运行步数:" + step);
        System.out.println(getSqrt(9) + "---程序运行步数:" + step);
    }
}
