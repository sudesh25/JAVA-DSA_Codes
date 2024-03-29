public class Array_DeleteUnsorted { 
    static int search(int arr[],int n,int x)
    {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            } 
        } 
        return -1;
    } 
    static int delete(int arr[],int n,int pos)
    {
        for(int i=pos;i<n;i++ )
        {
           arr[i]=arr[i+1];
        } 
        return n-1;
    }
    public static void main(String argss[])
    {
        int arr[]={13,65,75,34,24,12};
        int x=75;
        int n=arr.length;
        int pos=search(arr,n,x); 
        for(int i=0;i<n;i++)
        {
            System.out.println("Element before deleting: "+arr[i]);
        }

        if(pos==-1)
        {
            System.out.println("Element not found : ");
        } 
        n=delete(arr,n,pos); 
        for(int i=0;i<n;i++)
        {
            System.out.println("Element after deleting: "+arr[i]);
        }
    }
}
