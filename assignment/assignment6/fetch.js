fetch('http://localhost:9191/store')
    .then(response => response.json())
    .then((data) => {
    console.log(data)
        getData = () => { //fungsi klik
            document.getElementById('response').innerHTML=JSON.stringify(data);
        }
})
