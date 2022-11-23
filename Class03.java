public class Class03 {
    public static void main(String[] args) {
        
        try {
            int num=12,den=0;
            int ans=num/den;
            System.out.println(ans); 
        } catch (ArithmeticException e) {
            System.out.println("除數為0");
        }
    }
}