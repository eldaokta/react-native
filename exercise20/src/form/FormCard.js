import React from 'react';
import {connect} from "react-redux"
import './Form.css'
import {changeTitle, changeAlbum, submitAction} from "./FormAction";

class FormCard extends React.Component{
    render() {
        return(
            <div className="card">
                <form className="formContainer">
                    <label>Title</label>
                    <input type="text" name={"title"} onChange={(event => {this.props.dispatch({...changeTitle, index:this.props.index, title:event.target.value})})} />
                    <label>Album</label>
                    <input type="text" name={"album"} onChange={(event => {this.props.dispatch({...changeAlbum, index:this.props.index, album:event.target.value})})} />
                </form>
            </div>
        )
    }
}

//yg kanan classnya , yg kiri apa yg di mapping kedalam propsnya, props
export default connect()(FormCard);