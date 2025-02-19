 import java.util.*;
 public class Dowhileloop { 
    public static void main(String[] args){
        int i=1;
        System.out.print("Enter the Number for table");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        do {
            System.out.print(num+"*"+i+"="+(num*i)+"\n");
            i++;
        }while(i<=10);
    }
    
}
