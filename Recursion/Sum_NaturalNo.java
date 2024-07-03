public class Sum_NaturalNo {
    public static void main(String[] args) {
        SumNaturalNo(0, 5, 0);
    } 
    public static void SumNaturalNo(int i,int n,int sum)
    {
          if(i==n)
          {  sum=sum+i;
         System.out.println(sum);
            return ;
          }
          sum=sum+i;
          SumNaturalNo(i+1,n,sum);
    } 

}   