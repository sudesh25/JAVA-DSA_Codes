interface Animal{
  void walk();
}  
interface Herbivore{
    void walk();
}
class Horse implements Animal,Herbivore{
     public void walk()
       {
        System.out.println("Walk on 4 legs");
       }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        
    }
}
