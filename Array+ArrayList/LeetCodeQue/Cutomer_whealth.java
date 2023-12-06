public class Cutomer_whealth { 
    static int maxiwhealth(int acct[][])
    {  
        int whelth=0;
        for(int i=0;i<acct.length;i++) 
        {     int rich=0;
            for(int j=0;j<acct[i].length;j++) 
            { 
               rich=rich+acct[i][j];
            } 
            if(whelth<rich) 
            {
                whelth=rich;
            }
        } 
        return whelth;
    }

   public static void main(String[] args) {
     
     int acct[][]={
                        {1,2,3},
                        {2,6,5},
                        {3,4,9}
     };  
     int rich =maxiwhealth(acct); 
     System.out.println(rich);
     
   } 
}