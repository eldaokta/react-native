import React from 'react';
import './Counter.css'
import {connect} from "react-redux"
import {decrementAction, incrementAction} from "./CounterAction";


class CounterContainer extends React.Component{
    render() {

        return(
            <div className="card">
                <button onClick={()=>{this.props.dispatch(decrementAction)}}>-</button>
                <h1>{this.props.number}</h1>
                <h1>{this.props.name}</h1>
                <button onClick={()=>{this.props.dispatch(incrementAction)}}>+</button>
            </div>
        )
    }
}
//kalo lu nerima state, tolong tampung di props
const mapStateToProps=(state)=>{
    return {number:state.number, name:state.name}
}
const mapDispatchToProps=(dispatch)=>{
    return {
        increment:()=>{dispatch(incrementAction)},
        decrement:()=>{dispatch(decrementAction)},
    }
}

export default connect(mapStateToProps)(CounterContainer);