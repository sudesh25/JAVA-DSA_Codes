import java.util.*;
public class UpdateBit {
    public static void main(String[] args) {
         
        Scanner sc=new Scanner(System.in); 
        int ope=sc.nextInt(); 
         
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        if(ope==1)
        {
           int newNum= bitmask | n;
           System.out.println(newNum); 
        } 
        else{
            int notbitmask= ~(bitmask) ;
            int newNum=    notbitmask & n ; 
            System.out.println(newNum);
        }

    }
}
