public class AbstractionI {
    public static void main(String[] args) {
         horse obj = new horse();
         obj.walk(); 
         obj.eat();
    }
} 
abstract class animal{
       
    abstract  void walk();
     
      animal()
      {
        System.out.println("Animal created");
      } 
      void eat(){
        System.out.println("Animal are eating ");
      }
 } 
class horse extends animal{
       
    void walk()
    {
        System.out.println("Horse walking ");
    }
 }      