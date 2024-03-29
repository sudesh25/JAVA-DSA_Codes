import java .util.*;

public class InsertionSort {
    public static void main(String[] args) {
         
        int arr[]={7,6,5,4,3,2,1};
         
        for (int i = 1; i < arr.length; i++) {
              int current=arr[i];
              int j=i-1; 
              while(j>=0 && current < arr[j])
              {
                arr[j+1]=arr[j];
                j--; 
              } 
              arr[j+1]=current;
        }  
        System.out.println(Arrays.toString(arr));

    }
}
