import React from 'react';
import {connect} from "react-redux"
import {fetchData} from "./SongService";
import SongCard from "./SongCard";
import SongList from "./SongList";

class SongContainer extends React.Component{

    render() {

        return(
            <div>
                <h1>HELLOW</h1>
            </div>

        )
    }

}

const mapStateToProps=(state)=>{
    return {songs:state.songs}
}
export default connect(mapStateToProps)(SongContainer);