//

public class Quick_Sort {  
    public static int  Partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=low-1;  

                for (int j = low; j <high; j++) {
            if(arr[j]<pivot)
            {
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
            }
        } 
        i++; 
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;

        return i;
    }
    public static void QuickSort(int arr[],int low,int high)
    {
      if(low<high)
      {
        int pidx=Partition(arr,low,high);
        QuickSort(arr, low,pidx-1);
        QuickSort(arr, pidx+1, high);
      }
    }
    public static void main(String[] args) {
        int arr[] ={8,7,6,5,4,3,2};
        int n=arr.length; 
        QuickSort(arr, 0, n-1); 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
