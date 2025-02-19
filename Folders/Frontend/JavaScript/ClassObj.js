const student = {                          // Creating OBJ 
    fullName: "Sudesh Ingole",
    marks : 84.20, 
    printMarks: function(){                // Method of functions
        console.log("marks = ",this.marks);       // JS obj have special prototype
    },                                           // call the obj in console 
}; 

let arr = ['apple','banana'];
//console.log(typeof(arr));      // in js array are obj 

const employee = { 
      calcTax() {
        console.log("The tax rate is 10%");
      }
} 
const karanArjun = {
   salary: 5000,
   calcTax() {                               //If objects and prototype have same method, objects method will be used.
    console.log("The tax rate is 10%");
  }
} 
karanArjun.__proto__ = employee;     

class Car{
    start(){
        console.log("start");
    }
    stop(){
        console.log("stop");
    } 
    constructor (speed){
         console.log("Max speed is ",speed);                                   // creating own constructor
    }
}  

 //let maruti = new Car(300);             
 //let kia = new Car();
 //maruti.stop();
 //maruti.start();

 
class parent{ 
    constructor()
    {
        console.log("Parent Constructor created");
    }
    print(){
        console.log("Parent");                        // Inheritance
    } 
    work(){
        console.log("Do something");
    }
} 
class child extends parent{
    constructor()
    {                                     // Keyword to Invoked Parent Class Constructor
        console.log("Derived Constructor created");
        super();  
    }
    work(){
        console.log("Do nothing");
    }
}  
let obj = new child();
obj.print();
obj.work();


                                             // Error Handling


let a =4;
let b= 3;

console.log("a =",a);
console.log("b =",b); 
try{
    console.log("a + b =",a+c);
} catch(err){
   console.log(err);
}

console.log("a - b =",a-b);
































