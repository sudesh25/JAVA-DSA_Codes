function myFunction() 
{
    console.log("Welcome to Function Tutorial");
} 
myFunction();
function print(msg,num)
{
    console.log(msg);
    console.log(num);
} 
print("Hello",-3) 

function sum(x,y)
{
    return x+y
} 
console.log(sum(5,4)); 

const Arrowsum=(a,b) =>{
    console.log(a+b);
    return a+b;
} 
Arrowsum(23,23); 


function vowels(str)
{     
   str = str.toLowerCase();
     for(let i=0;i<str.length;i++)
     {  
        if(str[i] === "a" || str[i] === "e" || str[i] ===  "i" || str[i] ===  "o" || str[i] ===  "u")
        {
            process.stdout.write(str[i]+"   ");
        }
     }
} 
vowels("Sudesh Ingole") 

console.log(" ");
let arr=[1,2,3,4,5,6]
arr.forEach(function printVal(val){         // Call back function
    process.stdout.write(val+" ");
}) 

console.log("")

let No=[1,2,3,4,5,6,7,8];
No.forEach((num)=>{
    process.stdout.write(num*num+"  ");
}) 

console.log("")

function squ(num)
{       
    process.stdout.write(num*num+"  ");
}
No.forEach(squ);    