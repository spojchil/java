package corejava1.chapter3.section8.LotteryOdds;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("你要抽几个数字");
        int k = in.nextInt();

        System.out.print("你能抽到最大的数字是什么");
        int n = in.nextInt();

        // 公式 n*(n-1)*...(n-k+1)/(1*2*3*...k)

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        System.out.println("Your odds are 1 in " + lotteryOdds
            + ". Good luck!"
        );

        in.close();
    }
}
