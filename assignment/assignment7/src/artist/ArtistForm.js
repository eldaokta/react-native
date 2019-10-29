import React from 'react';
import './Artist.css';
import {fetchData, fetchSubmit, fetchSubmitWithImage} from "./ArtistService";

class ArtistForm extends React.Component {
    render(){
        return (
            <div className="form">
                <form onSubmit={this.props.submit} className="formArtist" >
                    <label>Name :</label>
                    <input type="text" className="input" name="name" placeholder={"input name"} onChange={this.props.hendlename}/>
                    <label>Born Place :</label>
                    <input type="text" className="input" name="born_place" placeholder={"input born place"} onChange={this.props.bornplace}/>
                    <label>Debut :</label>
                    <input type="date" className="input" name="debut" placeholder={"input date debut"} onChange={this.props.hendledebut}/>
                    <label>Image</label>
                    <input type="file" name="imageArtis"/><br></br>
                    <button className="btn" type={"submit"}>Submit</button>
                </form>
            </div>
        );
    }
}
export default ArtistForm;

