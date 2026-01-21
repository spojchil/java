/**
 * 这个程序是展示 while 循环
 * @version 1.20 
 * @author spojchil
 */

package corejava1.chapter3.section8.Retirement;

import java.util.*;

public class Retirement {
    public static void main(String[] args){
        // 读取输入
        Scanner in = new Scanner(System.in);

        System.out.print("你需要多少退休金");
        double goal = in.nextDouble();

        System.out.print("你每年投入多少钱");
        double payment = in.nextDouble();

        System.out.print("利率是%:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal){
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;
        }

        System.out.println("你需要存" + years + "年。");

        in.close();
    }
}
