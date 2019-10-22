// function tebak(x){
//     x();
// }
// function hallo() {
//     console.log("hallow");
// }
// tebak(hallo);
//

//contoh callback
function hallo(nama) {
    console.log("Hallow "+nama);
}
function tebak(nama, sebuahFunction) {
    sebuahFunction(nama);
}
function apaja(){
    console.log(2+6);
}
//liat struktur function tebak diatas
tebak("Elda", hallo);

function greet1(message, sebuahFunction) {
    setTimeout(()=>{
        console.log("Hallow "+message)
        sebuahFunction()
    }, 3000)
}
function greet2(message, sebuahFunction) {
    setTimeout(()=>{
        console.log("Anyeong "+message)
        sebuahFunction()
    }, 1000)
}
function greet3(message, sebuahFunction) {
    setTimeout(()=>{
        console.log("Bonjour "+message)
        sebuahFunction()
    }, 2000)
}

function printAll() {
    greet1("Elda", ()=>{
        greet2("Fira", ()=>{
            greet3("Susi", ()=>{})})})
}
printAll()

function factorial(n) {
    if(n-1==0) return 1
    return n*factorial(n-1)
}
// console.log(factorial(5))

function greet1(message) {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log("hallow "+message)
            resolve()
        }, 3000)
    })
}
function greet2(message) {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log("bonjour "+message)
            resolve()
        }, 1000)
    })
}
function greet3(message) {
    return new Promise((resolve, reject) => {
        setTimeout(()=>{
            console.log("Annyoeng "+message)
            resolve()
        }, 500)
    })
}

function printAllPromise() {
    greet1("Elda")
        .then(()=>{greet2("Susi").then(()=>{greet3("Fira")})})

}
printAllPromise()

//ASYNC WAIT

async function printAllAwait() {
    await greet1("Elda")
    await greet2("Susi")
    await greet3("Fira")
}
printAllAwait()
