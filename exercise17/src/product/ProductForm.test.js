import React from "react";
import ProductForm from "./ProductForm";
import {shallow} from "enzyme";

describe('ProductForm Component', ()=>{
    const appContainer = shallow(<ProductForm/>)
    describe('Render', ()=> {
        it('should have one div', ()=> {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should have one h1 as a child to div', ()=> {
            expect(appContainer.find('div').children('h1')).toHaveLength(1)
        });
        it('should have one form as a child of h1', ()=>{
            expect(appContainer.find('h1').children('form')).toHaveLength(0)
        });
        it('should have one label as a child of form', ()=> {
            expect(appContainer.find('form').children('label')).toHaveLength(1)
        });
        it('should have four input as a child of label', ()=> {
            expect(appContainer.find('label').children('input')).toHaveLength(4)
        });
        it('should have one button as a child of label', ()=> {
            expect(appContainer.find('label').children('button')).toHaveLength(1)
        });
    });
})
