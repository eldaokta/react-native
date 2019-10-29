import React from 'react';
import './Song.css'
import Card from '@material-ui/core/Card';
import CardActions from '@material-ui/core/CardActions';
import CardContent from '@material-ui/core/CardContent';
import Typography from '@material-ui/core/Typography';
import { makeStyles } from '@material-ui/core/styles';


class SongCard extends React.Component {
    constructor(props){
        super(props)
    }



    render() {
        return (
            <Card className="card">
                <CardContent>
                    <Typography className="titleSong" color="textSecondary" gutterBottom>
                        {this.props.song.titleSong}
                    </Typography>
                    <Typography className="idArtist" color="textSecondary" gutterBottom>
                        {this.props.song.idArtist}
                    </Typography>
                </CardContent>
            </Card>
        );
    }

    componentDidMount() {
        if (!(this.props.song===undefined)){
            this.setState({song:this.props.song})
        }
    }
}

export default SongCard;
