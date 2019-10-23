import React from 'react';
import './App.css';

class Card extends React.Component {
    render(){
        return (
                <div className="App-card">
                    <div className="container">
                        <h3>{this.props.persons.name}</h3>
                        <p>{this.props.persons.age}</p>
                    </div>

                </div>
        );
    }

}
export default Card;
