import React from 'react';
import ArtistCard from "./ArtistCard";
import {shallow} from "enzyme";

describe("ArtistCard Component", ()=>{
    describe("Render", ()=>{
        it('should have one div', () =>{
            let artist = {name:'Elda'}
            const wrapper = shallow(<ArtistCard artist={artist}/>)
            expect(wrapper.find('div').children('h1').text()).toBe('Elda')
        });
    })
})