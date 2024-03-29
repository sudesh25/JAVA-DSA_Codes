public class Array_insertionAtAnyPoUnsorted { 
    static int insertelement(int arr[],int n,int pos,int x)
    {
        for(int i=n-1;i>=pos-1;i--)
        {
            arr[i+1]=arr[i];

        } 
        arr[pos-1]=x; 
        return (n+1);
    }
    public static void main(String args[])
    {

        int arr[]=new int[20];
        arr[0]=23;
        arr[1]=34;
        arr[2]=54;
        arr[3]=22;
        arr[4]=87;
        arr[5]=45; 
        int n=6; 
        int pos=2; 
        int x=30 ;
        for(int i=0;i<n;i++)
        {
            System.out.println("array before insertion :"+arr[i]);
        } 
        n=insertelement(arr,n,pos,x);
         for(int i=0;i<n;i++)
        {
            System.out.println("array after  insertion :"+arr[i]);
        } 


    }
}
