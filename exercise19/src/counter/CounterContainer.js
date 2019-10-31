import React from 'react';
import './Counter.css'
import {connect} from "react-redux"
import {decrementAction, incrementAction, submitAction} from "./CounterAction";
import CounterCard from "./CounterCard";


class CounterContainer extends React.Component{

    render() {
        //buat ngisi ke statenya
        let container = this.props.numbers.map((element, index)=>{
            return <CounterCard element={element} key={index} index={index}/>
        })
        return(
            <div className="card">
                <button onClick={()=>{this.props.dispatch(submitAction)}}>ADD CARD</button>
                {container}
            </div>
        )
    }
}
//kalo lu nerima state, tolong tampung di props
const mapStateToProps=(state)=>{
    return {numbers:state.numbers}
}

//yg kanan classnya , yg kiri apa yg di mapping kedalam propsnya, props
export default connect(mapStateToProps)(CounterContainer);