import React from 'react';
import {connect} from "react-redux"


class FormCard extends React.Component{
    render() {
        return(
            <div className="card">
                <h1>{this.props.element.name}</h1>
            </div>
        )
    }
}

//yg kanan classnya , yg kiri apa yg di mapping kedalam propsnya, props
export default connect()(FormCard);