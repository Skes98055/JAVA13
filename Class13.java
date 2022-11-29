import java.util.*;
public class Class13 {
    public static void main(String[] args) {
        try{
            Scanner sc=new Scanner(System.in);
            String a=sc.nextLine();
            String b="520";
            sc.close();
            if(a.equals(b)){
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(a);
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println("這字串是由520所引起的例外");
        }
    }
}
