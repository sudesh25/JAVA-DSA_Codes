
// For Loop

for(let i=0;i<5;i++)
{
    console.log("Hello World");
}  

let count=5 

//While Loop

while(count>0)
{
    console.log("This is javaScript"); 
    count--;
} 

// Do While Loop

let num=0
do{
    console.log(num);
    num--;
}while(num>0); 

//for of loop 

let str="JavaScript";
for (let i of str) {
    console.log("i=",i)    
}

// for in loop

let student ={
    name:"Sudesh",
    age:21,
    cgpa:8,
    isPass:true,
}; 
for (let key in student) {
    console.log(key ,"=",student[key]);
}
 