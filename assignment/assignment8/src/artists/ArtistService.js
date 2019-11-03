export async function fetchData() {
    const data = await fetch("http://localhost:9191/members", {method:"GET"})
        .then((response)=>{
            console.log(response)
            return response.json()
        })
    return data;
}