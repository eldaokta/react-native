import React from 'react';
import './Product.css';
import{Link} from 'react-router-dom';


class ProductList extends React.Component{
    render() {
        let data = this.props.action;
        return (
            <div className="product-List">
                <h1>PRODUCT LIST</h1>
                <table>
                    <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name Product</th>
                        <th>Quantity</th>
                        <th>Price</th>
                        <th>Action</th>
                    </tr>
                    </thead>
                    {data.map(isi=>{
                        return(
                            <tbody>
                                <td>{isi.products.id}</td>
                                <td>{isi.products.name}</td>
                                <td>{isi.products.quantity}</td>
                                <td>{isi.products.price}</td>
                                <td><Link to={"/product-detail/"+isi.products.id}>Detail</Link></td>
                            </tbody>
                        )
                    })}
                </table>


            </div>
        );
    }


}

export default ProductList;
