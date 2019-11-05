import React from 'react';
import './App.css';
import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom"
import logo from './logo.svg';
import Provider from "react-redux/es/components/Provider";
import ArtistContainer from "./artists/ArtistContainer";
import artistReducer from "./artists/reducer/ArtistReducer";
import {createStore} from "redux";
import ArtistForm from "./artists/ArtistForm";
import SongContainer from "./songs/SongContainer";
import ArtistList from "./artists/ArtistList";


function App() {
  return (
      <div>
          <Router>
              <div className="App">
                  <header className="App-header">
                  </header>
                  <div className="sidenav">
                      <Link to="/artist-form">Artist Form</Link>
                      <Link to="/artist-list">Artist List</Link>
                      <Link to="/song-form">Song Form</Link>
                  </div>

                  <Switch>
                      <Provider store={createStore(artistReducer)}>
                      <Route path="/artist-form"><ArtistForm/></Route>
                      <Route path="/artist-list"><ArtistList/></Route>
                      </Provider>
                      <Route path="/song-form"><SongContainer/></Route>
                  </Switch>
              </div>
          </Router>
      </div>
  );
}

export default App;
