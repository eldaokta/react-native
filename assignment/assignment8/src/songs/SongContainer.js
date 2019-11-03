import React from 'react';
import {connect} from "react-redux"
import {fetchData} from "./SongService";
import SongCard from "./SongCard";
import SongList from "./SongList";

class SongContainer extends React.Component{

    render() {

        return(
            <div>
                <SongList/>
            </div>

        )
    }
    componentDidMount() {
        this.fetchSongs();
    }

    fetchSongs = async ()=>{
        const data = await fetchData();
        if(!(data === undefined)){
            this.props.dispatch({type:"FETCH_SONGS_SUCCESS", payload:data})
        }
    }
}

const mapStateToProps=(state)=>{
    return {songs:state.songs}
}
export default connect(mapStateToProps)(SongContainer);