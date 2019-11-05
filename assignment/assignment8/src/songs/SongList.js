import React from 'react';
import './Song.css';
import {connect} from "react-redux"



class SongList extends React.Component{
    render() {
        return (
            <div className="product-List">
                <h1>PRODUCT LIST</h1>
                <table>
                    <thead>
                    <tr>
                        <th>Title Song</th>
                    </tr>
                    </thead>
                    {this.props.songs.map((element, index)=>{
                        return(
                            <tbody>
                            <td>{element.titleSong}</td>
                            </tbody>
                        )
                    })}
                </table>


            </div>
        );
    }


}
const mapStateToProps=(state)=>{
    return {songs:state.songs}
}

export default connect(mapStateToProps)(SongList);