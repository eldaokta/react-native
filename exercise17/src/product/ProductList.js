import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import './Product.css';
import { Table, Container} from 'react-bootstrap';



class ProductForm extends React.Component{
    render() {
        console.log("render product list terjadi");
        let items = [];
        for (let i=0; i<this.props.action.length; i++){
            items.push(
                <tr>
                    <td>{this.props.action[i].name}</td>
                    <td>{this.props.action[i].quantity}</td>
                    <td>{this.props.action[i].price}</td>

                </tr>
            )
        }
        return (
            <div className="product-List">
                <h1>PRODUCT LIST</h1>
                <table>
                    <thead>
                    <tr>
                        <th>Name Product</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                        {items}
                </table>


            </div>
        );
    }


}

export default ProductForm;
