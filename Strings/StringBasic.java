import java.util.*;

public class StringBasic { 
    public static void main(String[] args) {
        String firstname="Sudesh"; 
        String lastname="INgole"; 
        String fullname=firstname+lastname;  
        System.out.println(fullname);   

        String fullname2=firstname+ "@" +lastname;  
        System.out.println(fullname2);  

        //length of String 
        System.out.println(fullname.length()); 
         
        //charAt()
        for (int i = 0; i < fullname.length(); i++) {
             
            System.out.print(fullname.charAt(i));
        }  

        // .compareTo() 
         
        String name1="tony1";
        String name2="tony2"; 

        if(name1.compareTo(name2)==0)
        {
            System.out.println("\nString are equal");
        }  
        else
        {
            System.out.println("String are not equal");
        } 

        //Substring 
        String sentence="My name is Tony";
        String name=sentence.substring(11,15); 
        System.out.println(name);
        
        //To convert into char array 
        String name7="Sudesh";
        char S[]=name7.toCharArray(); 
        System.out.println(Arrays.toString(S));
        
    }                                                                                                   
}
