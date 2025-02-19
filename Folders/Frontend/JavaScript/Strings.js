let str="Sudesh";
let Str1='Ingole'; 
console.log(str.length,Str1.length); 

for(let i=0;i<str.length;i++)
{
    console.log(Str1[i]);
} 

// Template literals
// String Interpolation

let SpecialString=`This is a \ntemplate literal`;
console.log(SpecialString); 
console.log(typeof(SpecialString)); 

 let obj={
    item: 'pen',
    price:10,
 };

 let output=`      The cost of ${obj.item} is ${obj.price} rupees    `;
 console.log(output); 


 // str.toUpperCase() , str.toLowerCase() 

 console.log(output.trim()); // Starting and ending spaces are deleted middle are as it is 

 let alpha="ABCDEFGH";
 console.log(alpha.slice(0,4));  

 let string1="apna";
 let string2="college";
 console.log(string1.concat(string2)); // string1+string2 will result same 

console.log(alpha.replace("AB","CD"));

console.log(alpha.charAt(5));











