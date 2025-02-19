class Polymorphism_{
        String name;           // Compile time poly.
        int age; 
        void Printinfo(String name)
        {
           System.out.println(name);
        } 
        void Printinfo(int age)
        {
           System.out.println(age);
        } 
        void Printinfo(String name,int age)
        {
          System.out.println(name+" "+age);
        }
}
public class CompileT_Polymorphism {
     public static void main(String[] args) {

           Polymorphism_ stu1=new Polymorphism_();
           stu1.name="Ram";
           stu1.age=24; 

          stu1. Printinfo(stu1.name,stu1.age);

     }
}
