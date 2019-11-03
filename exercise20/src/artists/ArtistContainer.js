import React from 'react';
import {connect} from "react-redux"
import {fetchData} from "./ArtistService";

class ArtistContainer extends React.Component{

    render() {

        return(
            <div>
                <h1>PRODUCT LIST</h1>
                {this.props.members.map((element, index)=>{
                    return <h1>{element.name}</h1>
                })}
            </div>

        )
    }
    componentDidMount() {
        this.fetchMembers();
    }

    fetchMembers = async ()=>{
        const data = await fetchData();
        if(!(data === undefined)){
            this.props.dispatch({type:"FETCH_PRODUCT_SUCCESS", payload:data})
        }
    }
}

const mapStateToProps=(state)=>{
    return {members:state.members}
}
export default connect(mapStateToProps)(ArtistContainer);