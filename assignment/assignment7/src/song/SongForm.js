import React from 'react';
import TextField from '@material-ui/core/TextField';
import {fetchData, submitData} from "./SongService";
import Button from '@material-ui/core/Button';
import './Song.css'
import SongCard from "./SongCard";



class SongForm extends React.Component{
    constructor(props){
        super(props)
        this.state={
            songs:[],
            songForm:{
                titleSong:"",
                idArtist:"",
            }
        }
        this.handleInputtitleSong = this.handleInputtitleSong.bind(this)
        this.handleInputidArtist = this.handleInputidArtist.bind(this)
        this.handleSubmit = this.handleSubmit.bind(this)
    }
    render() {
        return (
            <div className="container">
                <h3>Song Form</h3>
                <form className="formSong">
                    <TextField
                        id="standard-name"
                        label="Title Song"
                        className="textField"
                        value={this.state.songForm.titleSong}
                        onChange={this.handleInputtitleSong}
                    />
                    <TextField
                        id="standard-name"
                        label="Id Artist"
                        className="textField"
                        value={this.state.songForm.idArtist}
                        onChange={this.handleInputidArtist}
                    />
                </form>
                <Button type="submit" variant="contained" className="btn" onClick={this.handleSubmit}>
                    SUBMIT
                </Button>
                <br/><br/><br/>
                <div className="container">
                    {this.state.songs.map(songs=>{
                        return <SongCard song={songs}/>
                    })}
                </div>
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
            this.setState({songs:data})
        }
    }
    handleInputtitleSong(event){
        let song = {...this.state.songForm}
        song.titleSong=event.target.value
        this.setState({songForm:{...song}})
    }
    handleInputidArtist(event){
        let song = {...this.state.songForm}
        song.idArtist=event.target.value
        this.setState({songForm:{...song}})
    }

    handleSubmit(event){
        event.preventDefault();
        submitData(this.state.songForm)
    }

}

export default SongForm;
