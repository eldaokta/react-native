import React from "react";
import ProductDetail from "./ProductDetail";
import {shallow} from "enzyme";

describe('ProductDetail', ()=> {
    const appContainer = shallow(<ProductDetail/>)
    describe('Render', ()=>{
        it('should have one form', ()=> {
            expect(appContainer.find('form')).toHaveLength(1)
        });
        it('should have one label as a child to form', () =>{
            expect(appContainer.find('form').children('label')).toHaveLength(1)
        });
        it('should have four input as a child of form', ()=> {
            expect(appContainer.find('form').children('input')).toHaveLength(4)
        });
        it('should have one button as a child of from', ()=> {
            expect(appContainer.find('form').children('button')).toHaveLength(1)
        });
    })
});