let btn1 = document.querySelector("#btn1");
btn1.onclick = (evt) =>{
    console.log("clicked!");
    //alert("Hello!"); 
    btn1.innerText = "Clicked";
    console.log(evt); 
    console.log(evt.target);
    console.log(evt.type);
} 

let box = document.querySelector(".box");
box.onmouseover = () => {
    console.log("clicked!.......");
  //  alert("Hello!");   
}

let btn2 = document.querySelector("#btn2");
// btn2.addEventListener("click",E2);

// function E2(){
//     console.log("Button 2 was click ");
//     btn2.innerText = "Clicked"
// } 

btn2.addEventListener("click",(evt) =>{
      console.log("Button 2 was click ");
    btn2.innerText = "Clicked"
    console.log(evt); 
    console.log(evt.target);
    console.log(evt.type);
 
}) 

let btn3 = document.querySelector("#btn3");

btn3.addEventListener("click",() =>{
console.log("Button Event 1");})
    
const Handler2 = () =>{
    console.log("Button Event 2");}
btn3.addEventListener("click",Handler2)


btn3.addEventListener("click",() =>{
console.log("Button Event 3");})

btn3.removeEventListener("click",Handler2);




  












