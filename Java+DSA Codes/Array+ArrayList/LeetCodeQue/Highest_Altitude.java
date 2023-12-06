//https://leetcode.com/problems/find-the-highest-altitude/submissions/
public class Highest_Altitude { 
    static  int largestAltitude(int[] gain) { 
        int count=0;
        int sum=0;
        for (int i = 0; i < gain.length; i++) {
            sum=sum+gain[i]; 
             if(sum>count)
        {
            count=sum;
        } 
         
        } 
        
        return count;
}
    public static void main(String[] args) {
        int arr[]={-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }
}
