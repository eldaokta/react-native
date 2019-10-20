function greet(name){
    return "Hellow "+name;
}
console.log(greet("Youtube"));

var iniArrowFunction = (x) =>{
    console.log("apapun "+x);
}
iniArrowFunction(greet("Tony"));

function  salam1(name, sebuahFunction) {
    setTimeout(()=>{console.log("Hellow "+name)
        sebuahFunction()
        },3000);
}
function  salam2(name) {
    setTimeout(()=>{console.log("Hellow "+name)}, 2000);
}
function  salam3(name) {
    setTimeout(()=>{console.log("Hellow "+name)}, 500);
}

salam1("Elda");
salam2("Susi");
salam3("Mba Winda");