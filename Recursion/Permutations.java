public class Permutations { 
     
    public static void printpermu(String str, String permutation)
    {   
        if(str.length()==0)
        {
            System.out.println(permutation);
            return ;
        }
        for (int i = 0; i < str.length(); i++) {
            char cuchar=str.charAt(i);
            String newstr= str.substring(0,i)+str.substring (i+1); 
            printpermu(newstr,permutation+cuchar);
        }
    }
     public static void main(String[] args) {
          String str="abc";
          printpermu(str, "");  
     }
}
