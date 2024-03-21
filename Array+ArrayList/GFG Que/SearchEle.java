//https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/0

public class SearchEle {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length; 
        int x=2 ;
        System.out.println("The Given Element is Present AT Index "+Search(arr,n,x));

    } 
    static int Search(int arr[],int n,int x)
    {
        for (int i = 0; i < arr.length; i++) {
             
            if(arr[i]==x)
            {
                return i;
            } 

        } 
        return -1;
    }
}
