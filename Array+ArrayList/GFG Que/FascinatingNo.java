//https://practice.geeksforgeeks.org/problems/fascinating-number3751/1?page=1&category=Arrays&difficulty=School&sortBy=submissions
public class FascinatingNo {
    public static void main(String[] args) {
        long n=192;
        System.out.println(fascinating(n));
    } 
    
     static   boolean fascinating(long n) {
                boolean ans =true;  
                long a=n*2*1000;
                long b=n*3;  
                n=n*1000000; 
                n=n+a+b;    
                String s=String.valueOf(n);
                char[]arr=s.toCharArray();  
              
                
                 if(arr.length==9)  
                {
                      for (int i = 1; i <= 9; i++)
                {   int c=0; 
                    int count=0;
                    for (int j = 0; j < 9; j++) 
                    {   
                        if(arr[j]==Character.forDigit(i, 10))
                        {   
                            c=1; 
                            count++; 
                        }
                    } 
                    if(c==0 || count==1)
                    {
                        ans=false; 
                        break;
                    } 
                }   
                } 
                else ans=false;    
                return ans;
        }
}




kdfgojfdiog