import React from 'react';
import {connect} from "react-redux"
import {createStore} from "redux";
import artistReducer from "./reducer/ArtistReducer";
import Provider from "react-redux/lib/components/Provider";


class ArtistContainer extends React.Component{

    render() {
        return(
            <div>
            </div>

        )
    }
}
const mapStateToProps=(state)=>{
    return {artists:state.artists}
}
export default connect(mapStateToProps)(ArtistContainer);