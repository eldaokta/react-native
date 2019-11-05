import React from 'react';
import './Song.css'

class SongForm extends React.Component {
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
}
const mapStateToProps=(state)=>{
    return {...state, artistForm: state.artistForm}
}

export default SongForm;
