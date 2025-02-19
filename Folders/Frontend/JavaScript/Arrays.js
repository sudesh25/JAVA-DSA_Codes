let arr =[1,2,3,4,5,6,7]
console.log(arr);  
for(let i=0;i<arr.length;i++)
{
    console.log(arr[i]);
} 
for (let el of arr)
{
    console.log(el); 
}
console.log(arr.length); 
console.log(arr[4]);
 
let ars=["hero",23];
console.log(ars);

//practice que

let marks= [85,97,44,37,76,60] 
let sum=0;
for(let element of marks)
{
    sum=sum+element;
} 
console.log(sum/marks.length)
 
//practice que

let price=[250,645,300,900,50]; 
let count;  
for(let i=0;i<price.length;i++)
{
    count=(price[i]*10)/100;
    price[i]=price[i]-count;
} 
console.log(price); 


let student = ["om","ram","shyam"];
student.push("arun","rama");
console.log(student); 
student.pop();
console.log(student);
console.log(student.pop()); 
console.log(student); 
console.log(student.toString());



// concat 

let batter=["virat","rohit","hardik","dube","rahul"];
let baller=["siraj","bumrah"];
console.log(batter.concat(baller));  
(batter.unshift("gill"));             //add to start 
console.log(batter); 
batter.shift();                     // delete from start 
console.log(batter); 

console.log(batter.slice(3,5)) 
batter.splice(2,2,"ram","shyam");
console.log(batter);