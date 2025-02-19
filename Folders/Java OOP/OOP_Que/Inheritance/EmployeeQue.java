
        
                                  // Single level 
public class EmployeeQue{
     public static void main(String[] args) {
        Employee emp = new Employee("Sudesh",30.0); 
        emp.printinfo();

        Manager mgr = new Manager("Jane Smith", 75000, "IT");
        mgr.printinfo();
    }
}   
class Employee{
    String  name; 
    Double salary;
    Employee(){

    }
   Employee(String name,double salay){ 
       this.name=name; 
       salary = salay;
    } 
    void printinfo()
    {
        System.out.println("The salary of "+name+" is "+salary);
    }
    
} 
class Manager extends Employee{
    String department;

       Manager(String name,double salary,String department){
       super(name,salary);    // To invoke the default class constructor 
        this.department = department; 
       
    }  
    void printinfo()
    {
        System.out.println("The salary of "+name+" is "+salary+" and department is "+department);
    }
    
} 