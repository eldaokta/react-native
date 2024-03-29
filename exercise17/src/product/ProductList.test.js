import React from "react";
import ProductList from "./ProductList";
import {shallow} from "enzyme";

describe('ProductList Component', ()=>{
    const appContainer = shallow(<ProductList/>)
    describe('Render', ()=>{
        it('should have one div', ()=> {
            expect(appContainer.find('div')).toHaveLength(1)
        });
        it('should have one H1 as a child to div', ()=> {
            expect(appContainer.find('div').children('h1')).toHaveLength(1)
        });
        it('should have one table as a child to div',()=> {
            expect(appContainer.find('div').children('table')).toHaveLength(1)
        });
        it('should have one thead as a child to table',()=> {
            expect(appContainer.find('table').children('thead')).toHaveLength(1)
        });
        it('should have one tr as a child to table',()=> {
            expect(appContainer.find('table').children('tr')).toHaveLength(1)
        });
        it('should have one th from 5 th as a child to table', ()=> {
            expect(appContainer.find('table').children('th').at('0'))
        });

    })
})