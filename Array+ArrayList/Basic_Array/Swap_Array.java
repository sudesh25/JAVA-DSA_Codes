public class Swap_Array { 
    static void swap(int arr[],int x,int y)
    {
      int temp=arr[x];
      arr[x]=arr[y];
      arr[y]=temp; 
      for(int i=0;i<arr.length;i++)
      {
        System.out.println(arr[i]);
      }
    }
    public static void main(String[] args) {
         int arr[]={12,3,54,65,75};
         swap(arr,1,3);

    }
}
