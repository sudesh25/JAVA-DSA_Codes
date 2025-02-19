public class VehicleQueII {
    public static void main(String[] args) {
       //  Vehicle obj = new Vehicle(200);
      //   Car obj1 = new Car("Petrol",300);
         ElectricCar obj2 =new ElectricCar("diesel", 234, 300);
         obj2.print();
    }
} 
class Vehicle{
    int speed ;
   
     Vehicle(int speed){
        this.speed = speed;
     }
    void print()
    {
       System.out.println("Speed is "+speed);
    } 
   
} 
class Car extends Vehicle {
     String fueltype;
     
     Car(String fueltype,int speed){
          super(speed); 
          this.fueltype=fueltype;
     } 
     void print()
     {  
        super.print();
        System.out.println("Fuel Type is "+fueltype);
     }  
} 
class ElectricCar extends Car{
     int batterCap;  

     ElectricCar(String fueltype, int speed,int batterCap){ 
        super(fueltype,speed);
         this.batterCap=batterCap;
     }
     void print(){
       super.print(); 
       System.out.println("Range is "+batterCap);
     }
}
