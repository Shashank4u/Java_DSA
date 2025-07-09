public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 15;
        
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        
        System.out.println("Numbers: " + a + ", " + b + ", " + c);
        System.out.println("Maximum number is: " + max);
    }
}
