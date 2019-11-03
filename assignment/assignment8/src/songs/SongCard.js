import React from 'react';
import {connect} from "react-redux"
import "./Song.css"


class SongCard extends React.Component{
    render() {
        return(
            <div className="card">
                {this.props.element.titleSong}
            </div>
        )
    }
}

//yg kanan classnya , yg kiri apa yg di mapping kedalam propsnya, props
export default connect()(SongCard);