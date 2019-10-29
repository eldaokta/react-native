
export async function fetchData(pagination) {
    const data= await fetch(`http://localhost:9191/artists?size=3&page=${pagination}`, {method:'GET'})
        .then((response)=>{
            console.log(response)
            return response.json();
        })
    return data;
}

export async function fetchSubmit(artist) {
    const artist1= await fetch(`http://localhost:9191/save-artist`, {method:'POST',
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
export async function fetchSubmitWithImage(artist,picture) {
    const formData = new FormData();
    formData.append('picture', picture);
    formData.append('artist', JSON.stringify(artist));

    const artist1= await fetch(`http://localhost:9191/save-artist`, {method:'POST',

        body:formData})
        .then((response)=>{
            console.log(response)
            return response.json();
        }).catch(reason => {
            console.log(reason)
        })
    return artist1;
}

fetchData();