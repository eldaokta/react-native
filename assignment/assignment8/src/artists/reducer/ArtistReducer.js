
const initialState = {
    artists: [],
    artistForm:{ name: "", bornPlace:"", debutDate:"", songs:[] }
}

export default function artistReducer (state=initialState, action) {
    console.log("store reducer me",state,action )
    switch (action.type) {
        case "FETCH_SUCCESS":
            return {...state, artists: action.payload}
        case "CHANGE_ARTIST_NAME":
            return {...state, artistForm: {...state.artistForm, name: action.name}}
        case "CHANGE_ARTIST_BORN_PLACE":
            return {...state, artistForm: {...state.artistForm, bornPlace: action.bornPlace}}
        case "CHANGE_ARTIST_DEBUT_DATE":
            return {...state, artistForm: {...state.artistForm, debutDate: action.debutDate}}
        case "ADD_NEW_ELEMENT":
            return {...state, artistForm: {...state.artistForm, songs: state.artistForm.songs.concat([{titleSong:""}])}};
        case "ADD_TITLE":
            return {...state, artistForm: {...state.artistForm, songs:state.artistForm.songs.map((element, index) => {
                if (index === action.index){
                    return {...element, titleSong:action.titleSong}
                }else{
                    return element;
                }
                    })}}
        default: return state;
    }
}
