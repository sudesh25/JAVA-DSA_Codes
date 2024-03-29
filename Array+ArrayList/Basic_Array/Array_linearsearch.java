public class Array_linearsearch {   
     static int linearsearch(int arr[],int n,int x)
     {
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return (i); 
          
            }
          } 
       return 0;
     }
    public static void main(String args [])
    {
        int arr[]={23,54,67,890,56,65};
        int n=arr.length;
        int x=54;
        int position=linearsearch(arr,n,x);
        if(position==0)
        {
            System.out.println("Element not found: ");
        } 
        else 
        {
            System.out.println("Element found at position :"+(position+1));
        }
    }
}
