import React from 'react';
import ReactDOM from 'react-dom';
import './counter/Counter.css';
import App from './App';
import * as serviceWorker from './serviceWorker';
import CounterContainer from "./counter/CounterContainer";
import Provider from "react-redux/es/components/Provider";
import {createStore} from "redux";
import counter from "./counter/reducer/CounterReducer";
ReactDOM.render(
    <Provider store={createStore(counter)}>
        <CounterContainer />
    </Provider>, document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
