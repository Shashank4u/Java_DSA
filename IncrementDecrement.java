public class IncrementDecrement {
    public static void main(String[] args) {
        int num = 5;
        
        System.out.println("Original value: " + num);
        
        // Post-increment
        System.out.println("Post-increment (num++): " + num++);
        System.out.println("After post-increment: " + num);
        
        // Pre-increment
        System.out.println("Pre-increment (++num): " + ++num);
        System.out.println("After pre-increment: " + num);
        
        // Post-decrement
        System.out.println("Post-decrement (num--): " + num--);
        System.out.println("After post-decrement: " + num);
        
        // Pre-decrement
        System.out.println("Pre-decrement (--num): " + --num);
        System.out.println("After pre-decrement: " + num);
    }
}
