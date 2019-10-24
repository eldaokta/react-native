import React from 'react';
import './App.css';

class Card extends React.Component {
    render(){
        return (
                <div className="App-card">
                    <div className="container">
                        <p>{this.props.products.id}</p>
                    </div>

                </div>
        );
    }

}
export default Card;
