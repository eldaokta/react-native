const {createStore} = require ("redux");
const initialState={
    // number:0,
    // person:{name:""}
    numbers:[]
}
function counter(state=initialState, action) {
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
            default:return state
    }
}
let store = createStore(counter)
store.subscribe(()=>{
    console.log(store.getState())
})

// store.dispatch({type:"INCREMENT"})
// store.dispatch({type:"INCREMENT"})
// store.dispatch({type:"CHANGE_NAME", newName:"Elda"})
//type terima object
store.dispatch({type:"ADD_COUNTER"})
store.dispatch({type:"ADD_COUNTER"})
store.dispatch({type:"ADD_COUNTER"})
store.dispatch({type:"ADD_COUNTER"})
store.dispatch({type:"INCREMENT", index:2})
store.dispatch({type:"ADD_COUNTER"})
store.dispatch({type:"DECREMENT", index:3})







