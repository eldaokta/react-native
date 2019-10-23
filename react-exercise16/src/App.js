import React from 'react';
import './App.css';
import Header from "./Header";
import StudentForm from "./student/StudentForm";
import Card from "./Card";


class App extends React.Component{
    constructor(props){
        console.log("constructor dibaca")
        super(props)
        this.state= {
            persons: []
        }
    }
    tangkapData = (name, age) => {
        console.log("Data tertangkap");
        //create variable for tampung NewPeople
        let newPeople = {}
        newPeople.name = name;
        newPeople.age = age;
        //end variable tampung
        //addiing to array
        this.state.persons.push(newPeople);
        //set person
        this.setState(this.state)
        console.log(this.state.peoples)
    }
    render() {
        console.log("render terjadi")
        let people = [];
        for (let i = 0; i < this.state.persons.length ; i++) {
            people.push(<Card persons={this.state.persons[i]}/>)
        }
        return(
            <div className="App">
                <Header/>
                {/*bisa pake atribut apapun, yg penting manggil di cardnya sesuai*/}
                {/*<Card gantiaja={this.state.people}/>*/}
                {/*bermain dengan state*/}
                {/*INI ngelempar function changeNAME*/}

                <StudentForm action={this.tangkapData}/>
                {people}
            </div>
        )
    }
}
    // ubah = () => {
    //   console.log("KeKlik")
    //     //mencopy dari state, mengubah nama dan agenya baru dicopy lagi ke state
    //     let newPeople = {...this.state.people}
    //     newPeople.name = "Tony"
    //     newPeople.age = 22
    //     this.setState({people : {...newPeople}})
    // }
    // changeName = (event) =>{
    //   console.log(event.target.value)
    //   let newPeople = {...this.state.people}
    //   newPeople.name = event.target.value
    //     this.setState({people:{...newPeople}})
    // }



export default App;
