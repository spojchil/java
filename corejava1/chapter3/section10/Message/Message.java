// package corejava1.chapter3.section10.Message;

public class Message {
    public static void main(String[] args){
        if (args.length == 0 || args[0].equals("-h"))
            System.out.print("你好,");
        else if (args[0].equals("-g"))
            System.out.print("再见");
        for (int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!");
    }
}
