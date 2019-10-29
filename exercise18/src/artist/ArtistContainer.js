import React from 'react';
import {fetchData, submitData} from "./ArtistService";
import ArtistCard from "./ArtistCard";
import './Artist.css';
import { Input } from '@material-ui/core';


class ArtistContainer extends React.Component {
    constructor(props){
        super(props)
        this.state={
            artists:[],
            artistForm:{
                name:"",
                bornPlace:"",
                debutDate:""
            }
        }
        this.handleInputName = this.handleInputName.bind(this)
        this.handleInputbornPlace = this.handleInputbornPlace.bind(this)
        this.handleInputdebutDate = this.handleInputdebutDate.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }

    render() {
        return (
            <div className="mdc-text-field">
            {this.state.artists.map(artists=>{
                    return <ArtistCard artist={artists}/>
                })}

                <form>
                    <label>Name : </label>
                    <input value={this.state.artistForm.name} type="text" onChange={this.handleInputName} class="mdc-text-field__input" id="text-field-hero-input"/>
                    <label>Born Place : </label>
                    <input value={this.state.artistForm.bornPlace} type="text" onChange={this.handleInputbornPlace} />
                    <label>Debut Date : </label>
                    <input value={this.state.artistForm.debutDate} type="text" onChange={this.handleInputdebutDate} />
                    <button type="submit" onClick={this.handleSubmit}>SUBMIT</button>
                </form>
            </div>
        );
    }

    componentDidMount() {
        this.fetchArtists();
    }

    fetchArtists = async ()=>{
        const data = await fetchData()
        console.log(data)
        if (!(data===undefined)){
            this.setState({artists:data})
        }
    }
    handleInputName(event){
        let artist = {...this.state.artistForm}
        artist.name=event.target.value
        this.setState({artistForm:{...artist}})
    }
    handleInputbornPlace(event){
        let artist = {...this.state.artistForm}
        artist.bornPlace=event.target.value
        this.setState({artistForm:{...artist}})
    }
    handleInputdebutDate(event){
        let artist = {...this.state.artistForm}
        artist.debutDate=event.target.value
        this.setState({artistForm:{...artist}})
    }

    handleSubmit(event){
        event.preventDefault();
        submitData(this.state.artistForm)
    }
}

export default ArtistContainer;
