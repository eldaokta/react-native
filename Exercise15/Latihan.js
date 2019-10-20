//Latihan Callback

function myCallBack(){
    console.log("Assalamualaikum")
}

function main(param1, param2, callback){
    console.log(param1, param2)
        callback()
}
main(2, 3, myCallBack)


