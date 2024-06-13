public class GetBit{
     public static void main(String[] args) {
         
        int n=5; 
        int pos=2;
        int bitmask= 1<<pos; 
         
        if((n & bitmask)==0){
            System.out.println("Bit was Zero");
        } 
        else 
        {
            System.out.println("Bit was one");
        }
     }
}   