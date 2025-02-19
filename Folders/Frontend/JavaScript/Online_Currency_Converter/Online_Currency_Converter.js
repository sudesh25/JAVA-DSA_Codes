const BASE_URL = "https://cdn.jsdelivr.net/gh/fawazahmed0/currency-api@1/latest/currencies";

const dropdowns = document.querySelectorAll(".dropdown select");
const btn = document.querySelector("form button");
const formcurr = document.querySelector(".from select");
const tocurr = document.querySelector(".to select")
for(let select of dropdowns)
{
    for (currCode in countryList)
    {
        let newOption = document.createElement("option");
        newOption.innerText = currCode;
        newOption.value=currCode; 
        if(select.name === "from" && currCode === "USD"){
            newOption.selected = "selected";
        }else if(select.name === "to" && currCode === "INR") {
            newOption.selected = "selected";
        } 
        select.append(newOption);    
    }    
    select.addEventListener("change" , (evt)=>{
        updateflag(evt.target); 
    })
} 

const updateflag = (element)  =>{
     let currCode = element.value;
     let countryCode = countryList[currCode];
     let newsrc = `https://flagsapi.com/${countryCode}/flat/64.png`;
     let img = element.parentElement.querySelector("img");
     img.src=newsrc;
} 
btn.addEventListener("click", async (evt) => {
        evt.preventDefault(); 
        let amt = document.querySelector(".amt input");
        let amtval= amt.value 
        if(amtval === "" || amtval <0)
        {
            amtval = 1;
            amt.value = "1";
        } 
console.log(formcurr.value,tocurr.value);
const URL = `${BASE_URL}/${fromCurr.value.toLowerCase()}/${toCurr.value.toLowerCase()}.json`;
console.log(URL); 
let response = await fetch(URL);

}); 