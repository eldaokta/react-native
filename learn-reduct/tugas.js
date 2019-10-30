const {createStore} = require ("redux");
const initialState={
    number:0,
    person:{name:""}
}
function counter(state=initialState, action) {
    switch (action.type) {
        case "INCREMENT":
            return {...state, number: state.number+1}
        case "DECREMENT":
            return {...state, number: state.number-1}
        case "CHANGE_NAME":
            return {...state, person: {...state.person, name:action.newName}}
            default:return state
    }
}
let store = createStore(counter)
store.subscribe(()=>{
    console.log(store.getState())
})

store.dispatch({type:"INCREMENT"})
store.dispatch({type:"INCREMENT"})
store.dispatch({type:"CHANGE_NAME", newName:"Elda"})
store.dispatch({type:"CHANGE_NAME", newName:"Oktaviani"})