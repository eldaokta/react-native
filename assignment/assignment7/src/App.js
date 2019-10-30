import React from 'react';
import './App.css';
import logo from './logo.svg';
import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom"
import SongContainer from "./song/SongContainer";
import ArtistForm from "./artist/ArtistForm";
import ArtistCard from "./artist/ArtistCard";
import ArtistContainer from "./artist/ArtistContainer";


class App extends React.Component{

    render() {
        return (
            <Router>
                <div className="App">
                    <header className="App-header">
                        <h1>MUSIC APP</h1>
                        {/*<img src={require('./image/enigmacamp.png')} className="App-logo" alt="logo" />*/}
                    </header>
                    <div className="sidenav">
                        <Link to="/artist-container">List Artist</Link>
                        <Link to="/artist-form">Artist Form</Link>

                    </div>
                    <Switch>
                        <Route path="/artist-container"><ArtistContainer/> </Route>
                        <Route path="/artist-form"><ArtistForm/></Route>

                    </Switch>

                </div>
            </Router>

        );
    }


}

export default App;
