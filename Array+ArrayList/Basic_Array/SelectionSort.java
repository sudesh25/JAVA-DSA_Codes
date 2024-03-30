import java.util.*;
 
 public class SelectionSort { 
       public static void main(String[] args) {
        int arr[]={8,7,6,5,4,3,2};
           
        for(int i=0;i<arr.length-1;i++)
        {
            int s=i; 
            for (int j = i+1; j < arr.length; j++) {
                if(arr[s]>arr[j])
                {
                    s=j;
                }
            } 
            int temp=arr[i];
            arr[i]=arr[s];
            arr[s]=temp;
        } 
        System.out.println(Arrays.toString(arr));
       }         
} 