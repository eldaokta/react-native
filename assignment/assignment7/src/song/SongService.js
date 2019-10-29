export async function fetchData() {
    const data = await fetch("http://localhost:9191/songs", {method:"GET"})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    console.log(data)
    return data;
}

export async function submitData(song) {
    const data = await fetch("http://localhost:9191/song",
        {method:"POST", headers:{'Content-Type':'application/json'},
            body:JSON.stringify(song)})
        .then((response)=>{
            console.log(response)
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    console.log(data)
    return data;
}
