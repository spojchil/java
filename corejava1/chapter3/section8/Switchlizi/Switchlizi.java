package corejava1.chapter3.section8.Switchlizi;

public class Switchlizi {
    public static void main(String[] args){
        // 基本switch，在支持有限数据类型
        // 只能有一个常量
        int day = 3;
        String dayName;

        switch (day) {  // 无返回值
            case 1:  // 使用冒号
                dayName = "星期一";
                break;  // 必须使用break防止穿透
            case 2:
                dayName = "星期二";
                break;
            case 3:
                dayName = "星期三";
                break;
            default:
                dayName = "未知";
                break;
        };

        System.out.println("形式1:" + dayName);

        // 箭头语法，可以匹配多个值，无穿透有返回值
        // 3执行多段代码使用yield 返回
        int month = 2;
        int days = switch (month) {
            case 1, 3, 5 ,7 ,8 , 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                System.out.println("无效月份");
                yield -1;
            }  // 使用yield时每个分治必须返回值
        };

        System.out.printf("%d月有%d天\n", month, days);

        // 模式匹配
        Object obj = "Hello";
        String result = switch (obj) {
            case Integer i -> "整数: " + i;
            case String s -> "字符串" + s;
            case Double d -> "浮点数" + d;
            case null -> "为空";
            default -> "其他类型";
        };

        System.out.println("模式匹配的值为" + result);

        // 守卫模式(when 字句)
        Object obj1 = 15;

        String result1 = switch(obj1) {
            case Integer i when i > 10 -> "大于10的整数" + i;
            case Integer i -> "小于10的整数" + i;
            case String s -> "字符串" + s;
            default -> "其他";
        };

        System.out.println("守卫模式的值为" + result1);

        // 记录和解构
    }   
}
