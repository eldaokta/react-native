import {createStore} from "redux";
//reducer
function counter(state=0, action) {
    //untuk ngeget dari perintah
    switch (action.type) {
        case 'INCREMENT':
            return state+1;
        case 'DECREMENT':
            return state-1;
        default: return state;
    }
}
//si counter ke store agar menjadi reducer, biar gampang dipanggilnya
let redux = createStore(counter);
//harus function, bisa mengolah
redux.subscribe(()=>{
    console.log(redux.getState())
})
//type
redux.dispatch({type:"INCREMENT"})
redux.dispatch({type:"INCREMENT"})
redux.dispatch({type:"INCREMENT"})
redux.dispatch({type:"INCREMENT"})
redux.dispatch({type:"DECREMENT"})

//nampilin isi
// console.log(redux.getState())

