import React from 'react';
import App from './App';
import {shallow} from "enzyme";

//ini menjelaskan
describe('APP Component', () => {
  //apa yg mau dijelaskan? render
  const appContainer = shallow(<App/>)
  describe('Render', ()=>{
    //menjelaskan rendernya berhasil jika describe, it should have, si app itu harus punya div dialamnya 1
    it('should have one div', ()=> {
      expect(appContainer.find('div')).toHaveLength(1)
    });
    it('should have one header as a child to div', ()=> {
      expect(appContainer.find('div').children('header')).toHaveLength(1)
    });
    it('should have one input', ()=> {
      expect(appContainer.find('input')).toHaveLength(1)
   });
    it('should have image as a child of header', ()=> {
      console.log(appContainer.find('div').children('header').childAt(0).props())
      expect(appContainer.find('div').children('header').childAt(0).type()).toBe('img')
    });
    it('should contain button with click label', ()=> {
      expect(appContainer.find('button').text()).toBe("Click")
    });
    it('should contain label', ()=> {
      expect(appContainer.find('label')).toHaveLength(1)
    });
  });
  //simulate change
  describe('/function handleInputName', ()=>{
    it('input name should contain string Elda when onChage perform', ()=> {
      appContainer.find('input').simulate("change", {target:{value:"Elda"}})
      console.log(appContainer.find("input").props())
      expect(appContainer.find('input').prop("value")).toEqual("Elda")
    });
    describe('')
  })
});
//mock, yg dibuat oleh enzyme, appContainer itu tiruan
//render
//function utk spesifik