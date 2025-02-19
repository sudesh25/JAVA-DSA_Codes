 abstract class Animal{
    abstract void walk(); 
    Animal()
    {
        System.out.println("You are creating new animal");
    }
} 
class Horse extends Animal{ 
    Horse()
    {
        System.out.println("Created a Horse");
    }
    void walk()
    {
        System.out.println("Horse has 4 legs");
    }
} 
class Chicken extends Animal{
    void walk()
    {
        System.out.println("Chicken has 2 legs");
    }
}
public class AbstractionI {   
    public static void main(String[] args) {
        Horse h1=new Horse();
        h1.walk();

        Chicken c1=new Chicken();
        c1.walk();
        
       // Animal a1=new Animal();  As Animal class is abstract 
        

    }
}
