interface InnerInterface {
   int eye=2;       //by default public static final 
   void walk();
}  
 interface herbivore  {
     void eat();
}
class horse implements InnerInterface,herbivore{
     public void walk(){
          System.out.println("Walk on the 4 legs");
     } 
   public void eat(){
          System.out.println("Eating the food");
     }
} 


public class Interface {
     public static void main(String[] args) {
        
          horse obj = new horse();
          obj.walk(); 
          obj.eat();

     }
} 

