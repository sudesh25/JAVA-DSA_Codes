// function hello(){
//     console.log("Hello"); 
// } 

// console.log("one");

// setTimeout(hello,2000); 

// console.log("Two");

//                                                   // CallBack Function 
// function sum(a,b)
// {
//     console.log(a+b);
// } 
// function calculator (a,b,sumcallback)
// {
//     sumcallback(a,b);
// } 
// calculator(2,4,sum); 

// function print(){
//     console.log("CallBack Functions ");
// } 
// setTimeout(print,2000);


//                                                        // Callback Hell
// function getdata(dataid,getnextdata)
// {
//     setTimeout(() =>{
//         console.log("Data",dataid); 
//         if(getnextdata)
//         {
//             getnextdata();
//         }
//     },4000); 
// }  
// // As it is difficult to understand so it is know as callback hell t0 solve the problem we have PROMISES
// getdata(1,() => { 
//     console.log("Getting data2.....");
//     getdata(2,() =>{
//         console.log("Getting data3.....");
//         getdata(3,()=>{
//             console.log("Getting data4.....");
//             getdata(4);
//         });
//     })
// }) 


                                                            // Promises 
 
// let promise = new Promise((resolve,reject) =>{
//     console.log("I am Promies"); 
//    // reject("123");
//     resolve("success"); 
// // print value of promise in console
// })   



// function getdata(dataid,getnextdata)
// {  
//     return new Promise((resolve,reject) =>{
//         setTimeout(() =>{
//             console.log("Data",dataid); 
//             resolve("Success")       // watch the value of promise in console
//             if(getnextdata)
//             {
//                 getnextdata();
//             }
//         },4000); 
//     });
// }  
// getdata(1,() => { 
//     console.log("Getting data2.....");
//     getdata(2,() =>{
//         console.log("Getting data3.....");
//         getdata(3,()=>{
//             console.log("Getting data4.....");
//             getdata(4);
//         });
//     })
// }) 
 



// const getPromise = ()=>{
//    return  new Promise((resolve,reject)  => {
//        console.log("I am promise");
//        //resolve("Success");
         
//           reject("Error");
//    })
// };
// let promise = getPromise() 
//    promise.then((res) => {
//       console.log("Promise Fulfilled",res);
//    }); 

//    promise.catch((err) =>{
//      console.log("Rejected",err);
//    })




// function asyncFun1(){
//     return new  Promise((resolve,reject) =>{
//        setTimeout(()=>{
//         console.log("Data1");
//         resolve("Success");   
//        },4000);
//     });
// }
// function asyncFun2(){
//     return new  Promise((resolve,reject) =>{
//        setTimeout(()=>{
//         console.log("Data2");
//         resolve("Success");   
//        },4000);
//     });
// }

// console.log("Fetching data 1")
// let p1= asyncFun1(); 
// p1.then((res)=>{
//     console.log("Promise1",res);
// }) 

// console.log("Fetching data 2")             // Both returing the data at same time 
// let p2= asyncFun2(); 
// p2.then((res)=>{
//     console.log("Promise2",res);
// })

                                            // Promise chain
// console.log("Fetching data 1");
//  asyncFun1().then((res)=>{
//     console.log("Promise1",res); 
//     console.log("Fetching data 2");
//     asyncFun2().then((res)=>{
//         console.log("Promise2",res);
//     });
// }) ;


                                                        // Callback Hell problem solve using promise chain

// function getdata(dataid)
// {  
//     return new Promise((resolve,reject) =>{
//         setTimeout(() =>{
//             console.log("Data",dataid); 
//             resolve("Success "+ dataid)       // watch the value of promise in console 
//         },2000); 
//     });
// }  

// getdata(1).then((res)=>{
//     console.log(res); 
//     getdata(2).then((res)=>{
//         console.log(res); 
//         getdata(3).then((res)=>{              // Promise chain 
//             console.log(res); 
//             getdata(4).then((res)=>{
//                 console.log(res); 
//                 getdata(5).then((res)=>{
//                     console.log(res); 
//                 })
//             })
//         })
//     })
// })




                                              //Async-Await

async function hello(){          //call the hello funtion on the console
      console.log("Hello");     // Compulsory it return promise
} 
                               
function api(id) {
    return new Promise((resovle,reject) =>{
         setTimeout(() =>{
          console.log("Weather data"+id);
          resovle("Success "+id);
         },2000);
    })
}
// async function getWeatherData() {  
//     console.log("Getting Data One");
//     console.log(await api(1)); 
//     console.log("Getting Data two");        // it is compulsory to create the async function 
//     console.log(await api(2));             // we need to call the function 
//     console.log("Getting Data three");
//     console.log(await api(3));
// }
 
(async function () {                  
    console.log("Getting Data One");       // IIFE Immediately Invoked Function Expression
    console.log(await api(1));            // One time use 
    console.log("Getting Data two");
    console.log(await api(2));             
    console.log("Getting Data three");
    console.log(await api(3));
}) ();






