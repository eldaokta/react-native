export async function fetchDataArtist() {
    const data = await fetch(`http://localhost:9191/get-artists`, {method:"GET"})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    return data;
}
export async function fetchSubmit(artist) {
    const artist1= await fetch(`http://localhost:9191/save`, {method:'POST',
        headers:{
            Accept:'application/json',
            "Content-type" : "application/json"},
        body:JSON.stringify(artist)})
        .then((response)=>{
            console.log(response)
            return response.json();
        }).catch(reason => {
            console.log(reason)
        })
    return artist1;
}