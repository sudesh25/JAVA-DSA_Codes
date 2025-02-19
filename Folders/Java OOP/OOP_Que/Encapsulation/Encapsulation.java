class acct{ 
   // private String name;  
    private String password;  

    String getPassword ()
    {
       return this.password;
    }     
    void setPassword(String password)
    {
        this.password=password;
    } 
} 
 
public class Encapsulation{            // getter and setter 
    public static void main(String[] args) {   
         
        acct acct1 = new acct(); 
        acct1.setPassword("ABC"); 
        System.out.println(acct1.getPassword());
    } 
}