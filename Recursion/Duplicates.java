// TC = O(n)

public class Duplicates { 
    public static boolean[]map=new boolean[26];

    public static void Duplicates(String arr,int idx,String newString )
    {    
        if(arr.length()==idx)
        {
            System.out.println(newString); 
            return ;
        }
        char cuchar=arr.charAt(idx); 
        if(map[cuchar-'a']==true)
        {
            Duplicates(arr, idx+1, newString);
        } else {
            newString +=cuchar;  
            map[cuchar-'a']=true;
            Duplicates(arr, idx+1, newString);
        }

    }
     public static void main(String[] args) {
        String ans="aaddasdfdsaadfdssaaa"; 
        Duplicates(ans, 0, "");
} 
}
