public class SumCalculatorQue {
     public static void main(String[] args) {
          SumCalculator obj =new SumCalculator();

          obj.sum(2,30);
          obj.sum(3,70,5 );
          obj.sum(new int []{1,2,3,4,56,6});
     }
} 
class SumCalculator{
      
      void sum(int a,int b) 
      {
          System.out.println("The sum is "+(a+b));
      } 
      void sum(int a,int b,int c)
      {
        System.out.println("The sum is "+(a+b+c));
      } 
      void sum(int array[])
      { 
         int ans=0; 
        for (int i = 0; i < array.length; i++) {
            ans+=array[i];
        }
        System.out.println("The sum is "+ans);
      }
    }
