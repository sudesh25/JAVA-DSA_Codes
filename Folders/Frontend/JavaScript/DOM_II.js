let div = document.querySelector("div");
console.log(div);    

let id = div.getAttribute("id");
console.log(id); 

let name = div.getAttribute("name");
console.log(name); 

let para = document.querySelector("p");
console.log(para);

console.log(para.getAttribute("class")); 
console.log(para.setAttribute("class","newpara"));    // result in element section

console.log(div.style) 
div.style.backgroundColor = "red"; 
div.innerText = "Hello!!"
div.style.fontSize= "26px"   


let newBt = document.createElement("button");  
newBt.innerText = ("click me!"); 
console.log(newBt); 

let list = document.querySelectorAll("div");
console.log(list[1]); 
list[1].append(newBt);                   // prepend(el) , before(el) , after(el) , remove(el) , classlist.add() , classlist.remove()

let heading = document.createElement("h1");
heading.innerHTML = "<i> Hi I am New!</i>" ;  
document.querySelector("body").prepend (heading);

