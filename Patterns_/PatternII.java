public class PatternII {
     public static void main (String [] args) 
     {
        for(int i=1;i<5;i++) 
        {
            for(int j=1;j<6;j++) 
            {
              if(i==1||i==4||j==5||j==1) 
              {
                System.out.print("*\t");
              } 
              else {
                System.out.print("\t");
              }
            } 
            System.out.print("\n");
        }
     }
}
