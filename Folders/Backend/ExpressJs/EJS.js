                                  //
const express = require("express");
const app = express();                                     // Express will automatically import EJS
const path= require("path");

const port = 3030;
app.listen(port, () =>{
    console.log("listening on port 3030");
}) 


app.set("view engine","ejs");                          // view engine is a type of templete
app.set("views",path.join(__dirname,"views"));         // it will tell express about the correct path of views folder
app.get("/",(req,res) =>{
    console.log("this is root ");                     //using ejs we render the ejs file   EJS file is mix of HTML , JS
    res.render("Home");                          // express will automatically search ejs file in the views folder
})


app.get("/rolldice",(req,res)=>{
    console.log("Hello Roll the dice"); 
    //res.send("Hello...");                     // There is only one res exists
        let diceval = Math.floor(Math.random()*6 +1 );
    res.render("rolldice",{diceval});
})                                                
                                                
                                              // Instagram routes EX
app.get("/ig/:username",(req,res)=>{
    const followers = ["adam", "boss" , "anurag" , "vivek"];
    let { username } = req.params;                     // req.params will give obj req.params.username is the actual string 
   console.log(username);
    res.render("insta", { username , followers } );
})