import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import './Product.css';
import { Form, FormControl, Container, Button, Card} from 'react-bootstrap';



class ProductForm extends React.Component{
    handleSubmit=(event)=>{
        event.preventDefault();
        const name = event.target.name.value;
        const quantity = event.target.quantity.value;
        const price = event.target.price.value;

        this.props.tangkapData(name, quantity, price)

        event.target.name.value = ""
        event.target.quantity.value = ""
        event.target.price.value = ""
    }
    render() {
        return (
                <div className="container">
                    <h1>PRODUCT FORM</h1>
                                <form onSubmit={this.handleSubmit}>
                                    <label>
                                        Name Product
                                        <br/>
                                        <input type="text" name="name" />
                                        Quantity
                                        <br/>
                                        <input type="text" name="quantity"/>
                                        Price
                                        <br/>
                                        <input type="text" name="price" />
                                        <button type="submit" className="btn">Tambah</button>
                                    </label>
                                </form>
                </div>
        );
    }

}

export default ProductForm;
