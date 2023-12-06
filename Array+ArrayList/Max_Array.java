public class Max_Array { 
    static int max(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i]) 
            {
                max=arr[i];
            }
        } 
        return max;
    }
    public static void main(String[] args) {
        int arr[]={12,34,54,34,64,32};
        System.out.println(max(arr));
    }
}
