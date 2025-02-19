console.log("Hello....");

//console.log(process.argv);  // Return the array of path and arguments that can use  

let arg = process.argv;
for(let i=2;i<arg.length;i++)
{
    console.log("Hello to ",arg[i]);
} 

const obj = require("./Math");     // require and  module.exports link 2 file with  IO
console.log(obj);                  // require funtion include external modules that exist in separate files.
console.log(obj.pi);
console.log(obj.Mul(2,3)); 

      // requireing from other directory 
const info = require("./Fruits");
console.log(info);
//console.log(info[0]);  


                                          // Import Export 

// import {sum,pi} from "./Math.js";

// console.log(sum(2,3));
// console.log(pi);