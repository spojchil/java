package corejava1.chapter3.section10.LotteryArray;
// 多维数组
public class LotteryArray {
    public static void main(String[] args){
        final int NMAX = 10;

        // 给二维数组初始化 为NMAX+1个元素,每个元素为一个整数数组
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n < NMAX + 1; n++)
            odds[n] = new int[n + 1];

        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++){
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        for (int[] row : odds){
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }
}
