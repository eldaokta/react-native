export async function fetchData() {
    const data = await fetch("http://localhost:9191/songs", {method:"GET"})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    return data;
}