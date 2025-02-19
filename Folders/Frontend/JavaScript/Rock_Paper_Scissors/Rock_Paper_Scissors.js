let userscore = 0;
let compscore = 0;

const choices = document.querySelectorAll(".choice");
const msg = document.querySelector(".msg1");
const user = document.querySelector("#user-score");
const comp = document.querySelector("#comp-score");

function compChoiceG(){

    const opt = ["rock","paper","scissors"];
   const idx = Math.floor(Math.random()*3); 
   return opt[idx];
}


function playgame(userChoice)
{
   const compChoice = compChoiceG();

   if(userChoice===compChoice)
   {
    draw();
   }
   else{
        let userwin=true;
        if(userChoice === "rock")
        {
            userwin = compChoice === "paper" ? false :true ;
        }else if(userChoice=== "paper") 
        {
            userwin = compChoice=== "scissors" ? false : true;
        }else{
            userwin = compChoice=== "rock" ? false : true ;
        } 
        showwinner(userwin,compChoice,userChoice);
   }
}

function  showwinner(userwin,compChoice,userChoice){
    if(userwin)
    {
        console.log("win");
        msg.innerText = "You Win! Your "+ userChoice+" beats "+compChoice;
        msg.style.backgroundColor = "green";
        user.innerText = ++userscore;
      
    }else{
        console.log("loss");
        msg.innerText = "You Lost. "+ compChoice+" beats your "+userChoice; 
        msg.style.backgroundColor = "red"; 
        comp.innerText = ++compscore;
    }
}

function draw(){
    console.log("draw");
    msg.innerText = "Game was Draw. Play again.";
    msg.style.backgroundColor = "#082d58";
}

choices.forEach((choice) =>{
        choice.addEventListener("click",()=>{
            const userChoice = choice.getAttribute("id"); 
            playgame(userChoice)
        })
}); 