import React from 'react';
import './Product.css';


class ProductDetail extends React.Component{
    render() {
        let idParam = this.props.match.params.id;
        let isi = Object.create(this.props.get)
        let getId = {...isi.find(isi => isi.id == parseInt(idParam))};
        return(
            <form className="login-form">
                <label>
                    Id
                    <br/>
                    <input type="text" name="id" value={getId.id} />
                    Name Product
                    <br/>
                    <input type="text" name="name" value={getId.name}/>
                    Quantity
                    <br/>
                    <input type="text" name="quantity" value={getId.quantity}/>
                    Price
                    <br/>
                    <input type="text" name="price" value={getId.price}/>
                    <button type="submit" className="btn" name="action">Tambah</button>
                </label>
            </form>
        )
    }


}

export default ProductDetail;
