import React from 'react';
import './Artist.css'
import {fetchDataArtist} from "./ArtistService";
import {connect} from "react-redux"


class ArtistList extends React.Component{
    render() {
        return(
            <div className="cardTable">
                <table>
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Born Place</th>
                        <th>Debut Date</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    <tbody>
                    {this.props.artists.map((element, index)=>{
                        return<tr>
                            <td></td>
                            <td>{element.name}</td>
                            <td>{element.bornPlace}</td>
                            <td>{element.debutDate}</td>
                            <td><a href="#">ADD</a></td>
                        </tr>
                    })}
                    </tbody>
                </table>
            </div>
        )
    }
    componentDidMount() {
        this.fetchSong()
    }

    fetchSong = async ()=>{
        const data = await fetchDataArtist();
        console.log(data)
        if (!(data == undefined)){
            this.props.dispatch({type:"FETCH_SUCCESS", payload:data})
        }
    }
}
const mapStateToProps=(state)=>{
    return{...state, artists:state.artists}
}
export default connect(mapStateToProps)(ArtistList);