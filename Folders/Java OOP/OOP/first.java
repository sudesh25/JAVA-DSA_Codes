class pen 
{
    String color;
    String type;  
  
    
     void write() 
    {
        System.out.println("Write Something"); 
    
    }   
    void print()
    {
        System.out.println(color);
    }
}
 
class Student{
    String name ;
    int age;
  
    void info()
    {
       System.out.println(this.name);
       System.out.println(age);
    }
}
public class first{
       public static void main(String arg[])
       {
            pen pen1=new pen(); 
            pen1.color="Red";
            pen1.type="Gel";

            pen pen2=new pen();
            pen2.color="Green";
            pen2.type="Dot";

            pen2.write();   
            pen2.print(); 

            Student stu1=new Student(); // Student()= Constructor 
            stu1.name="Ram";
            stu1.age=21; 

            stu1.info();

            System.out.println(pen1.color);
            System.out.println(pen1.type);
            
       }
}