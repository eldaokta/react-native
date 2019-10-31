
const initialState = {
    songs: [{ title: "", album: "" }]
}

export default function form (state=initialState, action) {
    console.log("store reducer me",state,action )
    switch (action.type) {
        case "ADD_COUNTER":
            return {...state, songs: state.songs.concat([initialState.songs])}
            default: return state;
        case "CHANGE_TITLE":
            return {...state, songs: state.songs.map((element, index)=>{
                if (index === action.index){
                    return{...element, title:action.title}
                }else {
                    return element;
                }
                })}
        case "CHANGE_ALBUM":
            return {...state, songs: state.songs.map((element, index)=>{
                if (index === action.index){
                    return{...element, album:action.album}
                }else {
                    return element;
                }
                })}
    }
}
