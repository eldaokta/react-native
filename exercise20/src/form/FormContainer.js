import React from 'react';
import {connect} from "react-redux"
import './Form.css'
import {submitAction} from "./FormAction";
import FormCard from "./FormCard";
class FormContainer extends React.Component{

    render() {
        let container = this.props.songs.map((element, index)=>{
            return <FormCard element={element} key={index} index={index}/>
        })
        return(
            <div>
                <div>
                <button className="btn" onClick={()=>{this.props.dispatch(submitAction)}}>ADD CARD</button>
                </div>
                {container}
                <div>
                    <table>
                        <thead>
                        <tr>
                            <th>Title</th>
                            <th>Album</th>
                        </tr>
                        </thead>
                        {this.props.songs.map((element, index)=>{
                            return <tbody>
                            <tr>
                                <td scope="row">{element.title}</td>
                                <td scope="row">{element.album}</td>
                            </tr>
                            </tbody>
                        })}

                    </table>
                </div>

            </div>

        )
    }
}
const mapStateToProps=(state)=>{
    return {songs:state.songs}
}
export default connect(mapStateToProps)(FormContainer);