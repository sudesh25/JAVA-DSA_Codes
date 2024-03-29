public class Array_insertionSorted { 
    static int insertelement(int arr[],int n,int x)
    {     int i;
         for(i=n-1;(i>=0 && arr[i]>x);i--)
         {
            arr[i+1]=arr[i];
         } 
         arr[i+1]=x; 
         return (n+1);
    }
    public static void main(String args[])
    {

        int arr[]=new int[20];
        arr[0]=13;
        arr[1]=25;
        arr[2]=29;
        arr[3]=34;
        arr[4]=47;
        arr[5]=54; 
        int n=6; 
        int x=30 ; 
        for(int i=0;i<n;i++)
        {
            System.out.println("array before insertion :"+arr[i]);
        } 
        n=insertelement(arr,n,x);
         for(int i=0;i<n;i++)
        {
            System.out.println("array after  insertion :"+arr[i]);
        } 

}
}