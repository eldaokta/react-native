
const initialState = {
    members: []
};

export default function artistReducer(state = initialState, action) {
    switch(action.type) {
        case "FETCH_PRODUCT_SUCCESS":
            return {...state, members: action.payload}
        default:
            return state;
    }
}