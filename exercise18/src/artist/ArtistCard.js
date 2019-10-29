import React from 'react';
import './Artist.css'

class ArtistCard extends React.Component {
    constructor(props){
        super(props)
    }

    render() {
        return (
            <div className="App-card">
                <div className="container">
                    <h3>{this.props.artist.name}</h3>
                </div>

            </div>
        );
    }

    componentDidMount() {
        if (!(this.props.artist===undefined)){
            this.setState({artist:this.props.artist})
        }
    }
}

export default ArtistCard;
