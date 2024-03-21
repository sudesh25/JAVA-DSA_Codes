//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class nextGreatestChar {
    public static void main(String[] args) {
          char arr[]={'c','f','j'};
          char target='f'; 
        System.out.println(greaterletter(arr,target));

    }  
    static char greaterletter(char letters[],char target) 
    {      
        int start=0;
        int end=letters.length-1 ; 

        if(target==letters[end])
        {
            return letters[0];
        } 
        while(start<=end) 
        {
            int mid=start+(end-start)/2; 
             
            if(letters[mid]>target)
            {
                end=mid-1;
            } 
            else 
            {
                start=mid+1;
            }
        } 
        
        return letters[start];
            

}
}