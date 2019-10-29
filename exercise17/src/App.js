import React from 'react';
import logo from './logo.svg';
import './App.css';
import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom"
import ProductList from "./product/ProductList";
import ProductForm from "./product/ProductForm";
import Card from "./Card";
import ProductDetail from "./product/ProductDetail";


class App extends React.Component{
    constructor(props){
        console.log("constructor dibaca")
        super(props)
        this.state= {
            products: []
        }
    }
    tangkapData = (id, name, quantity, price) => {
        const data ={id, name, quantity, price}
        console.log(data, "Data Tertangkap")
        const products = this.state.products
        products.push(data)
        this.setState({products})
    }
    render() {
        let product=[];
        for (let i=0; i<this.state.products.length;i++){
            product.push({products:this.state.products[i]})
        }
        return (
            <Router>
                <div className="App">
                    <header className="App-header">
                        <img src={logo} className="App-logo" alt="logo" />
                    </header>
                    <div className="sidenav">
                        <Link to="/product-list">Product List</Link>
                        <Link to="/product-form">Product Form</Link>
                    </div>

                    <Switch>
                        <Route path="/product-list"><ProductList action = {product}/></Route>
                        <Route path="/product-form"> <ProductForm tangkapData = {this.tangkapData}/></Route>
                        <Route path="/product-detail/:id" render={(props)=><ProductDetail {...props} get={this.state.products}/>}></Route>

                    </Switch>
                </div>
            </Router>


        );
    }



}

export default App;
