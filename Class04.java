public class Class04 {
    public static void main(String[] args) {
        int num=12,den[]={12,0,3,0,0,4};
        try {
            for (int i=0;i<10;i++){
                if(den[i]>0){
                   System.out.println("ans="+num/den[i]);  
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("此程式有誤");
        }
    }
}
