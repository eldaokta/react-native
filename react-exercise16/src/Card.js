import React from 'react';
import './App.css';

class Card extends React.Component {
    render(){
        return (
                <div className="card">
                    <h3>{this.props.persons.name}</h3>
                    <p>{this.props.persons.age}</p>
                </div>
        );
    }

}
export default Card;
