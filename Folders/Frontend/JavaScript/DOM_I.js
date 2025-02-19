console.dir(document.body);
                                                      // get is use for access element , set is for update the element 
console.log(document.getElementById("heading"));     // By using Id

console.log(document.getElementsByClassName("div"));  // By using class name    

let para = document.getElementsByTagName("p");
console.log(para);                                   // By Using Tag name Paragraph. 

console.log(document.querySelector(".div"));             // return matching 1st element  id, para., class  
console.log(document.querySelectorAll("p"));            // return all matching element  #id, para., .class with node list  

let fruit = document.querySelector(".fruit");
console.dir(fruit);  
console.log(fruit.innerText);                     // return the text content of the element ans all its children
console.log(fruit.innerHTML);                    //  return the text content or HTML contents of the element and all its children 

//  fruit.innerHTML=  "<i> ABCD </i>";            
//  console.log(fruit);

let head = document.querySelector("h2");
console.log(head); 
console.log(head.innerText+"....Inner text");
console.log(head.textContent);                   // textContent  

let HW = document.getElementById("HW");
HW.innerText = HW.innerText.concat(" From apna college student.."); 

let HW1 = document.getElementsByClassName("HW1");
console.log(HW1); 

HW1[0].innerText=HW1[0].innerText.concat(" ABC");
HW1[1].innerText=HW1[1].innerText + " DEF";
HW1[2].innerText=HW1[2].innerText + " GHI"; 

