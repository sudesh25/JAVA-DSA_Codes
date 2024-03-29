// https://www.geeksforgeeks.org/problems/find-transition-point-1587115620/1?page=1&category=Arrays&difficulty=Easy,Medium&status=unsolved&sortBy=submissions

public class TransitionPoint {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1,1};
        System.out.println(transitionPoint(arr));
    } 
   static int transitionPoint(int arr[]) {
         
    for (int i = 0; i < arr.length; i++) {
          
        if(arr[i]==1)
        {
            return i;
        }
    }
        return -1;
    }
}
