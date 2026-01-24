package corejava1.chapter3.section9.BigIntegerTest;

import java.math.*;
import java.util.*;

public class BigIntegerTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("你抽多少个?");
        int k = in.nextInt();

        System.out.print("一共多少个");
        BigInteger n = in.nextBigInteger();

        BigInteger lotteryOdds = BigInteger.ONE;

        for (int i = 1; i <=k; i++)
                lotteryOdds = lotteryOdds.multiply(n.subtract(BigInteger.valueOf(i - 1))).
                divide(BigInteger.valueOf(i));
        
        System.out.printf("共有%s,  和\n", lotteryOdds);
        in.close();
    }
}
