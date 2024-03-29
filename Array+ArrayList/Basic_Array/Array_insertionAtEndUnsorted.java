public class Array_insertionAtEndUnsorted { 
    static int insertelement(int arr[],int n,int element)
    {
        arr[n]=element; 
        return(n+1);
    }
public static void main(String args[])
{
    int arr[]=new int[20];
    arr[0]=23;
    arr[1]=34;
    arr[2]=12;
    arr[3]=56;
    arr[4]=76;
    arr[5]=67;
    int n=6;
    int key=26; 
         for(int i=0;i<n;i++)
    {
        System.out.println("The element of array before insertion:"+arr[i]);
    } 
     n=insertelement(arr,n,key);
    for(int i=0;i<n;i++)
    {
        System.out.println("The element of array after  insertion:"+arr[i]);
    } 
} 
 

}

