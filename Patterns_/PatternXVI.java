public class PatternXVI {
      public static void main(String args[]) 
      {  
        int a,b,c,d;
        for(a=1;a<=5;a++) 
        {
            System.out.print("*");
            for(b=1;b<=a-2;b++) 
            {
               System.out.print(" ");
            } 
           if(a>1) 
           {
             System.out.print("*");
           } 
           for(c=1;c<=(10-a*2);c++ ) 
           {
            System.out.print(" ");
           } 
           for(d=(11-a);d<=(11-a);d++) 
           {
            System.out.print("*");
           } 
            for(b=1;b<=a-2;b++) 
            {
               System.out.print(" ");
            }   
            if(a>1) 
            {
                System.out.print("*");
            }

            System.out.print("\n");
        } 
        for(a=1;a<=5;a++) 
        {
            System.out.print("*");
            for(b=3;b>=a;b--) 
            {
               System.out.print(" ");
            } 
           if(a<=4) 
           {
             System.out.print("*");
           } 
           for(c=7;c>=(10-a*2);c-- ) 
           {
            System.out.print(" ");
           } 
           for(d=(11-a);d<=(11-a);d++) 
           {
            System.out.print("*");
           } 
            for(b=3;b>=a;b--) 
            {
               System.out.print(" ");
            }   
            if(a<=4) 
            {
                System.out.print("*");
            } 
            System.out.print("\n");
      }
}
}