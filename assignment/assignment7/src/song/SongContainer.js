import React from 'react';
import TextField from '@material-ui/core/TextField';
import Button from '@material-ui/core/Button';
import SongForm from "./SongForm";



class SongContainer extends React.Component{
    constructor(props){
        super(props)
        this.state={
            songs:[],
            songForm:{
                titleSong:"",
                idArtist:"",
            }
        }

    }
    render() {
        return (
            <div className="container">
                <SongForm/>
            </div>
        );
    }




}

export default SongContainer;
