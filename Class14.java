import java.util.*;
public class Class14 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in); 
            
            String a=sc.nextLine();
            sc.close();
            int b=Integer.valueOf(a);
          
            if(b>=10 & b<=70){
                System.out.println(b);
            }
            else if(b>70){
                throw new ArithmeticException();
            }
            else if(b<10){
                throw new ArrayStoreException();
            }
        }
        catch(ArithmeticException e){
            System.out.println("您輸入的整數太大");
        }
        catch(ArrayStoreException ex){
            System.out.println("您輸入的整數太小");
        }
        catch(NumberFormatException ex){
            System.out.println("您輸入的不是整數");
        }
        
    }
}
