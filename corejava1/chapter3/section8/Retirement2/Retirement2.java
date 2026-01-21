package corejava1.chapter3.section8.Retirement2;

import java.util.*;

public class Retirement2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("你每年存多少钱");
        double payment = in.nextDouble();

        System.out.print("利率为");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;
            System.out.printf("在%d年后你的钱为%,.2f\n"
                , year, balance
            );

            System.out.print("准备退休?(Y/N)");
            input = in.next();

        }
        while (input.equals("N"));
        in.close();
    }   
}
