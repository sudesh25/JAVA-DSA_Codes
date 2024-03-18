//https://leetcode.com/problems/plus-one/

public class PlusOne { 
    class Solution {
         static int[] plusOne(int[] digits) { 
           
            int sum=0;
            
            for (int i = 0; i < digits.length; i++)
            {
                int a=digits[i]+(int) Math.pow(10,digits.length-1-i); 
                sum=sum+a;
                
            } 
            sum=sum+1;   
            System.out.println(sum);
            int c=digits.length-1;
            int size;
            if(digits[c]==9)
            {
                size=digits.length+1;
            }
            else 
            {
               size=digits.length;
            }
            int ans[]=new int [size];
            for (int i = ans.length-1; i <= 0; i--) {
                   int a=sum%10;
                   ans[i]=a;
                   sum=sum/10; 
                   System.out.println(a);

            }
            return ans;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int ans []=Solution.plusOne(arr); 
        for (int i = 0; i < ans.length; i++) {
          //  System.out.print(ans[i]);
        }
    }
}  fgffffg
 
