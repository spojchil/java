package corejava1.chapter3.section4.Constants;

public class Constants {
    public static void main(String[] args) {
        // 常量声明final
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("纸张尺寸厘米是:" 
            + paperWidth * CM_PER_INCH + "x" + 
            paperHeight * CM_PER_INCH);
    }
}
