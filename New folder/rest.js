function restCall(){
    let httpRequest=new XMLHttpRequest();
    httpRequest.open("GET","http://localhost:8080/api/call");
    httpRequest.send();
    httpRequest.onload=function(){
        alert(httpRequest.responseText);
    }
    console.log("inside the .js file");
}