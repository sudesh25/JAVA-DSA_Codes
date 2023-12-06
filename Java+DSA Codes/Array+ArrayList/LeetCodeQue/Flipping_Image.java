public class Flipping_Image { 
    static int[][] flip(int image[][])
    {   int temp;
         for(int i=0;i<image.length;i++) 
         {
            for(int j=0;j<image[i].length/2;j++) 
            {  int n=image[i].length-1;
               temp=image[i][j]; 
               image[i][j]=image[i][n-j];
               image[i][n-j]=temp;
               
            }
         }  
          for(int i=0;i<image.length;i++) 
         {
            for(int j=0;j<image[i].length;j++) 
            {
                if(image[i][j]==0) 
                {
                    image[i][j]=1;
                }   
                else 
                {
                    image[i][j]=0;
                }
            }
         }  
         return image;
    }
    
    public static void main(String[] args) {
        int [][]arr={
                       {1,1,0},
                       {1,0,1},
                       {0,0,0}
        }; 
        int ans[][]=flip(arr); 
        for(int i=0;i<ans.length;i++) 
         {
            for(int j=0;j<ans[i].length;j++) 
            {
                System.out.print(ans[i][j]);
            } 
            System.out.println();
         }
    }
}
