const initialState = {
    number:0,
    name:"Elda"
}

export default function counter (state=initialState, action) {
    console.log("store reducer me",state,action )
    switch (action.type) {
        case 'INCREMENT':
            return {...state, number:state.number+1}
        case 'DECREMENT':
            return {...state, number:state.number-1}
        default: return state;
    }
}