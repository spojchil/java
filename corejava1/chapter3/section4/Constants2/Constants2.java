package corejava1.chapter3.section4.Constants2;

public class Constants2 {
    // 可以在一个类的多个方法中使用，称为类常量
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("纸张尺寸厘米是:" 
            + paperWidth * CM_PER_INCH + "x" + 
            paperHeight * CM_PER_INCH);
    }
}
