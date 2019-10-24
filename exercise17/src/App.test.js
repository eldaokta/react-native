import React from 'react';
import ReactDOM from 'react-dom';
import App from './App';
import {shallow} from "enzyme";

describe('APP Component', ()=>{
  const appContainer = shallow(<App/>)
  describe('Render', ()=>{
    it('should have one div', () => {
      expect(appContainer.find('div')).toHaveLength(2)
    });
    it('should have one header as a child to div', () => {
      expect(appContainer.find('div').children('header')).toHaveLength(1)
    });
    it('should have one image as a child of header', ()=>{
      expect(appContainer.find('div').children('header').childAt(0).type()).toBe('img')
    });
    it('should have one div as a child of div', ()=>{
      expect(appContainer.find('div').children('div')).toHaveLength(1)
    })
    it('should have one link as a child of div', ()=> {
      expect(appContainer.find)
    });
  });
  describe('/function tangkapData', ()=>{
    it
  })
})


