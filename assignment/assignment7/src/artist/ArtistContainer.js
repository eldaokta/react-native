import React from 'react';
import TextField from '@material-ui/core/TextField';
import {fetchData, fetchSubmitWithImage} from "./ArtistService";
import './Artist.css'
import './ArtistForm'
import Button from '@material-ui/core/Button';
import ArtistForm from "./ArtistForm";
import ArtistCard from "./ArtistCard";



class ArtistContainer extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            artists: {
                content: [],
                total: null,
                per_page: null,
                current_page: 0
            },
            artistForm: {name: "", bornPlace: "", debut: ""}
        }
    }

    render() {

        let artist, pageNumbers;
        if (this.state.artists.content !== null) {
            artist = this.state.artists.content.map(artist1 => {
                return <ArtistCard artist={artist1}/>
            })
        }

        const numberPage = [];
        if (this.state.total !== null) {
            for (let i = 0; i <= Math.ceil(this.state.total / this.state.per_page - 1); i++) {
                numberPage.push(i);
            }
            pageNumbers = numberPage.map(numbers => {
                let classes = this.state.current_page === numbers ? 'active' : '';
                return (
                    <span key={numbers} className={classes}
                          onClick={() => this.fecthArtists(numbers)}>{numbers + 1}</span>
                )
            })
        }

        return (
            <div>
                <ArtistForm submit={this.hendleSubmit} hendlename={this.hendleInputName} bornplace={this.hendleInputBornPlace} hendledebut={this.hendleInputdebut}/>
                {artist}
                <div className={'pagination'}>
                    <span onClick={() => this.fecthArtists(0)}>&laquo;</span>
                    {pageNumbers}
                    <span onClick={() => this.fecthArtists(0)}>&raquo;</span>
                </div>
            </div>

        );
    }

    componentDidMount() {
        this.fecthArtists(0)
    }

    fecthArtists = async (numberPage) => {
        const data = await fetchData(numberPage);
        console.log(data)
        if (!(data === undefined)) {
            this.setState({
                artists: {content: data.content},
                total: data.totalElements,
                per_page: data.size,
                current_page: data.number
            })
        }
    }
    hendleInputName=(event)=>{
        let artist = {...this.state.artistForm}
        artist.name = event.target.value;
        this.setState({artistForm:{...artist}})
    }

    hendleInputBornPlace=(event)=>{
        let artist = {...this.state.artistForm}
        artist.bornPlace = event.target.value;
        this.setState({artistForm:{...artist}})
    }
    hendleInputdebut=(event)=>{
        let artist = {...this.state.artistForm}
        artist.debut = event.target.value;
        this.setState({artistForm:{...artist}})
    }
    hendleSubmit=(event)=>{
        event.preventDefault()
        let picture = event.target.imageArtis.files[0];
        fetchSubmitWithImage(this.state.artistForm,picture)
    }

}

export default ArtistContainer;
