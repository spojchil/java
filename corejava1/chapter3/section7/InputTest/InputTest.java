package corejava1.chapter3.section7.InputTest;

import java.util.*;

public class InputTest{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("你的名字是？");
        String name = in.nextLine();

        System.out.print("你的年龄是?");
        int age = in.nextInt();

        System.out.println("你好，" + name + "下一年你将"
            + (age + 1) + "岁"
        );

        System.out.printf("格式化字符串%d %s\n", 3, "a3");

        in.close();

        // 读取文件  需要导入包
        /*
        Scanner in1 = new Scanner(Path.of("1.txt"),
             StandardCharsets.UTF_8);
        */ 
    }
}