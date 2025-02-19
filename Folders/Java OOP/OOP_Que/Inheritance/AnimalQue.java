public class AnimalQue {
    public static void main(String[] args) {
          Animal D1 = new Dog();
          Animal C1 = new Cat();   
          
          C1.sound();
          D1.sound();
    }
}
class Animal{
   void  sound(){
       System.out.println("animal makes Sound");
    }
} 
class Dog extends Animal {
    void sound(){ 
        super.sound();
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound(){ 
        super.sound();
        System.out.println("Cat meows");
    }
}