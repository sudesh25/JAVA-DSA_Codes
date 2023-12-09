public class PatternVII {
       public static void main(String args[])
       { 
        int j,n=6;
        for(int i=1;i<=5;i++) 
        {   
            for( j=1;j<=(n-i);j++) 
            {   
                System.out.print(j+" "); 
                
            }
            System.out.print("\n");
        }
       }
}
