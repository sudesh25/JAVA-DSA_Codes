    

public class StringBulider
{
    public static void main(String[] args) {
          
        StringBuilder name=new StringBuilder("Tony");  
        System.out.println(name);
        
        //CharAt index
        name.setCharAt(0,'p'); 
        System.out.println(name);  

        // Insert  
        name.insert(0,'s');
        System.out.println(name);  

        // Delete 
        name.delete(1,2); 
        System.out.println(name); 

        //append 
        StringBuilder sb=new StringBuilder("H");
        sb.append("ello");
        System.out.println(sb); 

        //Length 
        System.out.println(sb.length());
           
      

    }
}