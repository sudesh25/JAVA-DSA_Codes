public class Print_No
 {
     public static void main(String args[]){
        int n=1;
        PrintNo(n);
     } 
    public static void PrintNo(int n){ 
      if(n==6)
      {
         return ;
      }
            System.out.println(n);
            PrintNo(n+1);
     }
}