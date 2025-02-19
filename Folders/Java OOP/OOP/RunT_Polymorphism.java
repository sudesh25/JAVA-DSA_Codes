class Bike{  
    void run(){
        System.out.println("running");
              }  
  
  class Splendor extends Bike
  {  
    void run(){
        System.out.println("running safely with 60km");
              } 
  }


public class RunT_Polymorphism {
     public static void main(String[] args) {
 
              Bike b = new Bike();
              b.run();  
            }  
          }  
     }

    