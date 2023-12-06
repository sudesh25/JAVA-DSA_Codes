import java.util.*;
public class N_unique_int {
    static int[] sumZero(int n) {
        int arr[]=new int[n]; 
        int a=0;
        if(n%2!=0)
        {
         arr[0]=0;
         a++;
        }
        
        for (int i = 1; i < n/2; i++) {
            arr[a]=i;
            a++;
        } 
        for (int j = 1; j < n/2 ; j++) {
            arr[a]=-(j);
        }
        return arr;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}
 