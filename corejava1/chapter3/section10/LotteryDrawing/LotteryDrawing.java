package corejava1.chapter3.section10.LotteryDrawing;

import java.util.*;

public class LotteryDrawing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("你一次抽多少个?");
        int k = in.nextInt();

        System.out.print("抽奖池里一共有多少个物品");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++){
            // 返回0-1之间的小数
            int r = (int) (Math.random() * n);

            result[i] = numbers[r];

            numbers[r] = numbers[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("结果为");
        for (int r : result)  // 遍历for each
            System.out.print(r + " ");

        System.out.println();

        in.close();
    }
}
