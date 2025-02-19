const express = require("express");
const app = express();

// console.log(app);
// console.dir(app);

let port= 3030;

app.listen(port,()=>{
    console.log(`app is listeing on the port ${port}`);        // keep always on 
}) 

// app.use((req,res) =>{
//     console.log("Request received"); 
//     //console.log(req);
//    // console.log(res); 

//  //  res.send("This is a basic reponse"); 
// //    res.send({
// //     name:"apple",                                 //sending response in obj form 
// //     color:"Red",                                  // only one response for one path 
// //    }) 
//      res.send("<h1>Fruits</h1><ul><li>apple</li><li>banana</li></ul>"); 
// }) 

// app.get("/",(req,res) =>{
//     console.log("You connected to root path ");           //Routes 
//     res.send("You connected to root path"); 
// })

// app.get("/apple",(req,res) =>{
//     console.log("You connected to the apple path");
//     res.send("You connected to the apple path");  
// }) 

// app.get("/orange",(req,res)=>{
//     console.log("You connected to the orange path");
//     res.send("You connected to the orange path");
// }) 

// app.get("*",(req,res)=>{
//         res.send("This path does not exists");
//         console.log("This path does not exists....");
// }) 

// app.post("/",(req,res)=>{
//     res.send("You sent a post req");
//     console.log("You sent a post req");
// }) 

app.get("/:username/:id",(req,res) =>{ 
    console.log(req.params);  
    let {username,id} = req.params;
    res.send(`Welcome to the page of @${username }`);
}) 


app.get("/search",(req,res) =>{
    console.log(req.query); 
    let {q} =req.query
    res.send(`Result for query: ${q}`);
})