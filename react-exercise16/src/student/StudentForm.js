import React from 'react';

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
                <button type="submit" onClick={this.handleSubmit}>Submit</button>
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
