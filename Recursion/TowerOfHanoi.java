// T(n)= 2T(n-1)+1

public class TowerOfHanoi {
     public static void main(String[] args) {
          int n=3   ; 
          Tower(n,"S","H","D");
     } 
     public static void Tower(int n,String src,String hel,String dest)
     { 
        if(n==1)
        {
            System.out.println("Transfer disk "+ n +" from "+src+" to "+dest); 
            return ;
        } 
        Tower(n-1,src,dest,hel);
        System.out.println("Transfer disk "+ n +" from "+src+" to "+dest); 
        Tower(n-1,hel,src,dest);
     }
}
