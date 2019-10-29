import React from 'react';
import logo from './logo.svg';
import './App.css';
import ArtistContainer from "./artist/ArtistContainer";

class App extends React.Component {
    constructor(props){
        super(props)
        this.state={
            name:'',
            outputName:''
        }
    }
    handleInputName=(event)=> {
        this.setState({name:event.target.value})
    }
    handleChangeNameButtonClick=(event)=>{
        this.setState({name:event.target.value})

    }

    render() {
        console.log(this.state.name)
        return (
            <div className="App">
                <ArtistContainer/>
            </div>
        );
    }
}

export default App;
