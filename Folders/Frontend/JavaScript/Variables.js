console.log("Hello World"); 
console.log("Sudesh"); 
age=24;                       // primitve Data types 7
console.log(age)              // Number, String , Boolean , undefined , null ,Bigint ,Symbol
Fname="sudesh" ;
console.log(Fname+" age is "+age); 
x=null ; 
y=undefined; 
console.log(x);
console.log(y) 
isFollow=true;
console.log(isFollow);

var num=24;
var num=34;   // var variable can be updated or redeclare
var num=46;
console.log(num) ;

let sum=36;           //let can not be redeclare but can be updated
console.log(sum) ;

const avg=40 ;        // can not be redeclare or updated
console.log(avg); 

let a=23.45;
console.log(a) ;
console.log(typeof(a));

let b;
console.log(a) ; 

let M=BigInt("123"); 
let N=Symbol("Hello!") 
 

// Non primtive 

const student= {
    Fname :"sudesh",
    Age: 20,
    CGPA : 8.2,
    isPass : true
};                        // Const obj can be change and keys can be change
console.log(student); 
console.log(student.Fname);

student.Age=student.Age+1; 
console.log(student.Age); 

// practice
const profile ={
     username:"Shradhakhapra",
     posts:195,
     followers:"569k", 
     following:4,    
} ;
console.log(profile);            