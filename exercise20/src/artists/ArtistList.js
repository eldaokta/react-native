import React from "react";
import { connect } from "react-redux";
import { fetchProducts } from "/productAction";

class ArtistList extends React.Component {
    componentDidMount() {
        this.props.dispatch(fetchProducts());
    }

    render() {
        return (
        );
    }
}

const mapStateToProps = state => ({
    products: state.products.items,

});

export default connect(mapStateToProps)(ArtistList);