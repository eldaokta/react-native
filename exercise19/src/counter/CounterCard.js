import React from 'react';
import './Counter.css'
import {connect} from "react-redux"
import {decrementAction, incrementAction} from "./CounterAction";

class CounterCard extends React.Component{
    render() {
        console.log(this.props)
        return(
            <div className="card">
                <button onClick={()=>{this.props.dispatch({...decrementAction, index:this.props.index})}}>-</button>
                <h1>{this.props.element}</h1>
                <button onClick={()=>{this.props.dispatch({...incrementAction, index:this.props.index})}}>+</button>
            </div>
        )
    }
}
//kalo lu nerima state, tolong tampung di props
// const mapStateToProps=(state)=>{
//     return {number:state.number, name:state.name}
// }
// const mapDispatchToProps=(dispatch)=>{
//     return {
//         increment:()=>{dispatch(incrementAction)},
//         decrement:()=>{dispatch(decrementAction)},
//     }
// }
//yg kanan classnya , yg kiri apa yg di mapping kedalam propsnya, props
export default connect()(CounterCard);