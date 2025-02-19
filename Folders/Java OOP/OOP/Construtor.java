class Student {
     String name;
     int age;  
   
     Student()
     {
        System.out.println("Construtor called"); // Non parameterised constructor
     } 
} 
class lecture 
{
    String name;
    int time; 

    lecture(String name,int time) // parameterised Constructor
    {
       this.name=name;
       this.time=time;
    }

    void print()
    {
        System.out.println(name);
        System.out.println(time);
    }
}

public class Construtor {
       public static void main(String[] args) {
             
             Student std1=new Student(); // Student()=Construtor
             std1.name="ram"; 
             
             lecture lec1=new lecture("Shyam",12); 
             lec1.print();
       }
}
