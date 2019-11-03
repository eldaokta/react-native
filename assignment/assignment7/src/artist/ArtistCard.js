import React from 'react';
// import './App.css';


class ArtistCard extends React.Component {
    render() {
        return (
                    <div className="card">
                        <div className="picture">
                            <img src={require(`../image/${this.props.artist.idArtist}.jpg`)} className={"img"}/>
                        </div>
                        <div className="container">
                            <p>{this.props.artist.name}</p>
                            <p>{this.props.artist.bornPlace}</p>
                            <p>{this.props.artist.debutDate}</p>
                        </div>
                    </div>
        );
    }
}
export default ArtistCard;