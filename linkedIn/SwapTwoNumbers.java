

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        a=b+a;
        b=a-b;
        a=a-b;
        System.out.println("this is the a =>"+a+"this is b=>"+b);
    }
}
