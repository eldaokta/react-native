import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import FormContainer from "./form/FormContainer";
import {createStore} from "redux";
import form from "./reducer/FormReducer";
import Provider from "react-redux/es/components/Provider";
import ArtistContainer from "./artists/ArtistContainer";
import artistReducer from "./artists/reducer/ArtistReducer";


ReactDOM.render(<Provider store={createStore(artistReducer)}>
    <ArtistContainer />
</Provider>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
