
const initialState = {
    songs: []
};

export default function songReducer(state = initialState, action) {
    switch(action.type) {
        case "FETCH_SONGS_SUCCESS":
            return {...state, songs: action.payload}
        default:
            return state;
    }
}