import React from 'react';
import './Artist.css'
import {CHANGE_NAME, CHANGE_BORN_PLACE, CHANGE_DEBUT_DATE, ADD_NEW_ELEMENT} from "./ArtistAction";
import {connect} from "react-redux"
import {fetchSubmit} from "./ArtistService";

class ArtistForm extends React.Component{
    handleSubmit=(event)=>{
        event.preventDefault();
        fetchSubmit(...this.props.artistForm)

    }
    render() {
        console.log("artist form", this.props.artistForm.songs)
        return (
            <div className="card">
                <form onSubmit={this.handleSubmit} className="artistForm">
                    <label>Name</label>
                    <input type={"text"} name={"title"}
                           onChange={this.handleName}/>
                    <label>Born Place</label>
                    <input type="text" name={"bornPlace"}
                           onChange={this.handleBornPlace}/><br/>
                    <label>Debut Date</label><br/>
                    <input type="date" name={"debutTitle"}
                           onChange={this.handleDebutDate}/><br/>
                    <label>Song</label>
                    <input type="text" placeholder="Your Song.."/>
                </form>
                <button type="button" onClick={()=>{
                    this.props.dispatch(ADD_NEW_ELEMENT)
                }}>
                    ADD CARD
                </button>
                {/*{this.props.artistForm.songs.map((element, index)=>{*/}
                {/*    return <SongContainer element={element} index={index}/>*/}
                {/*})}*/}
            </div>
        );
    }
    handleName = (event)=>{
        this.props.dispatch({...CHANGE_NAME,
        index:this.props.index,
        name:event.target.value})
    }
    handleBornPlace= (event)=>{
        this.props.dispatch({...CHANGE_BORN_PLACE,
            index:this.props.index,
            bornPlace:event.target.value})
    }
    handleDebutDate = (event)=>{
        this.props.dispatch({...CHANGE_DEBUT_DATE,
            index:this.props.index,
            debutDate:event.target.value})
    }
}
const mapStateToProps=(state)=>{
    return {...state, artistForm: state.artistForm}
}

export default connect(mapStateToProps)(ArtistForm);
