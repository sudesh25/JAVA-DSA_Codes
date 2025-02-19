                                   // API = Application Programming interface 

const URL = "https://cat-fact.herokuapp.com/facts"; 
                                                       // status 200 means success

const getfacts  = async () =>{ 
    console.log("getting data......")
    let reponse =  await fetch(URL);
    console.log(reponse.url);   
   // let data = await reponse.json();
   // console.log(data);
}