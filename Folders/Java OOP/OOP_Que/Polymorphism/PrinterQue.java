import java.util.Arrays;

public class PrinterQue {
     public static void main(String[] args) {
         Printer obj = new Printer();
         obj.print(new int[] {1,2,3,4,5,6,7,8});
         obj.print(2);
         obj.print(2.0); 
         obj.print("sudesh");
     }
} 
class Printer{
    void print(int a)
    {
         System.out.println(a);
    } 
    void print(double a)
    {
         System.out.println(a);
    }
    void print(String name)
    {  
       System.out.println(name); 
    }
    void print(int arr[])
    {
         System.out.println(Arrays.toString(arr));
    }

}