public class PlaceTiles { 

    public static int place(int n,int m) 
    {
        if(n==m)
        {
            return 2;
        }  
        if(n<m)
        {
            return 1;
        }
        int vertplacements=place(n-m,m);
        int horiplacements=place(n-1,m);
        
        return vertplacements+horiplacements;
        
    } 
     public static void main(String[] args) {
         int n=4, m=2;
         System.out.println(place(n, m));
    } 
}
