import React from 'react';
import Button from '@material-ui/core/Button';


class StudentForm extends React.Component {
    constructor(props){
        super(props)
        this.state={
            name:'',
            age:''
        }
    }

    render(){
        return (
            <div className="card">
                <form>
                    <label>Name : </label>
                    <input type="text" onChange={this.handleName} value={this.state.name} />
                    <br/><br/>
                    <label>Age : </label>
                    <input type="text" onChange={this.handleAge} value={this.state.age}/>
                </form>
                <br/>
                <Button variant="contained" type="submit" onClick={this.handleSubmit}>Submit</Button>

            </div>
        );
    }
    handleName = (event) => {
        this.setState({name: event.target.value})
    }
    handleAge = (event) => {
        this.setState({age: event.target.value})
    }
    handleSubmit = () => {
        let name = this.state.name;
        let age = this.state.age
        this.props.action(name,age)
    }
}
export default StudentForm;
