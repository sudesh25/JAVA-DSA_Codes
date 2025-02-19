let boxes = document.querySelectorAll(".box"); 
let reset = document.querySelector("#reset-btn"); 
let newbtn = document.querySelector("#new-btn");
let msg = document.querySelector(".msg");
let turn0 = true; 
let winnerFound = false;
let btnClicks = 0;

const winpattern= [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6],
]; 

function resetGame() {
    turn0 = true; 
    winnerFound = false; // Reset winnerFound
    btnClicks = 0;
    for (let box of boxes) {
        box.disabled = false; 
        box.innerText = "";
    }
    msg.classList.add("hide");
}

reset.addEventListener("click", resetGame);
newbtn.addEventListener("click", resetGame);

for (let i = 0; i < boxes.length; i++) {    
    boxes[i].addEventListener("click", () => {
        if (turn0) {
            boxes[i].innerText = "X";
            boxes[i].classList.remove("y");
            boxes[i].classList.add("x"); 
            turn0 = false; 
        } else {
            boxes[i].innerText = "O"; 
            turn0 = true;
            boxes[i].classList.remove("x"); 
            boxes[i].classList.add("y");    
        } 
        btnClicks++;
        console.log(btnClicks);
        boxes[i].disabled = true;
        checkWinner();
    });
}   

function draw() {
    msg.innerText = "Draw...!!";
    msg.classList.remove("hide"); 
   
}

function checkWinner() {
    for (let pattern of winpattern) {
        let pos1 = boxes[pattern[0]].innerText;
        let pos2 = boxes[pattern[1]].innerText;
        let pos3 = boxes[pattern[2]].innerText; 
        
        if (pos1 !== "" && pos2 !== "" && pos3 !== "") {
            if (pos1 === pos2 && pos2 === pos3) {
                console.log("Winner", pos1);
                winnerFound = true;
                showinner(pos1);  
                return; // Stop checking after a winner is found
            }
        }
    }

    if (!winnerFound && btnClicks === 9) {
        draw();
    }
}

function showinner(winner) { 
    msg.innerText = "Winner is " + winner; 
    msg.classList.remove("hide");  
    for (let box of boxes) {
        box.disabled = true;
    }
}
