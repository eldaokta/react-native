
const initialState = {
    numbers:[]
}

export default function counter (state=initialState, action) {
    console.log("store reducer me",state,action )
    switch (action.type) {
        case "INCREMENT":
            return {...state, numbers: state.numbers.map((element, index)=>{
                    if (index===action.index){
                        return element+1
                    }else return element
                })}
        case "DECREMENT":
            return {...state, numbers: state.numbers.map((element, index)=>{
                    if (index===action.index){
                        return element-1
                    }else return element
                })}
        case "ADD_COUNTER":
            return {...state, numbers: state.numbers.concat([0])}
        default: return state;
    }
}
