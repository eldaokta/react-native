export async function fetchData() {
    const data = await fetch("http://localhost:9191/artists", {method:"GET"})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    console.log(data)
    return data;
}

export async function submitData(artist) {
    const data = await fetch("http://localhost:9191/artist",
        {method:"POST", headers:{'Content-Type':'application/json'},
            body:JSON.stringify(artist)})
        .then((response)=>{
            console.log(response)
            return response.json()
        }).catch(reason => {
            console.log(reason)
        })
    console.log(data)
    return data;
}
