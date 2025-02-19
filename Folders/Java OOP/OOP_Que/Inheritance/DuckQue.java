interface  Flyable{
     void fly();
}
interface Swimmable{
     void swim();
} 
class Duck implements Flyable, Swimmable{
     public void fly()
     {
         System.out.println("Flying ");
     } 
     public void swim()
     {
        System.out.println("Swiming ");
     }
}

public class DuckQue {
    public static void main(String[] args) {
         Duck obj=new Duck();
        obj.fly();
        obj.swim();
    }
}
