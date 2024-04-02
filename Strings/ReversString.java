
public class ReversString {
     public static void main(String[] args) {
          
        StringBuilder name=new StringBuilder("HELLO"); 

            for (int i = 0; i < name.length()/2; i++) {
                  
                int front=i; 
                int End=name.length()-1-i;  

                //Swapping 
                char a=name.charAt(front);
                name.setCharAt(front,name.charAt(End));
                name.setCharAt(End,a);
              
                System.out.println(name);

            }
     }
}
