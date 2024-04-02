// https://leetcode.com/problems/longest-common-prefix/description/
import java.util.*;
public class LongestCommonPrefix {
     public static void main(String[] args) {
       String strs[] = {"flower","flow","flight"};  
        System.out.println(longestCommonPrefix(strs));


     } 
     static String longestCommonPrefix(String[] strs) { 
        if(strs.length==1)
        {   
            String ans=strs[0];
            return ans;
        } 
        if(strs.length==0)
        {
                return "";
        }
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0; 
        while(c<first.length())
        {
            if(first.charAt(c)==last.charAt(c))
            {
                c++;
            } 
            else 
            {
                break;
            }
        } 
        if(c==0)
        {
            return "";
        } 
        else {
            return first.substring(0, c);
        }
          
          
     }
}
