package com.enigma.model;

public class Skill {
    private String skillName;
    private Integer damage;
    private Integer manaCost;
    private Integer skill1;
    private Integer skillHeal;

    public Skill(String skillName, Integer damage, Integer manaCost, Integer skill1, Integer skillHeal){
        this.skillName = skillName;
        this.damage = damage;
        this.manaCost = manaCost;
    }
    public void castSkill(Heroes heroes){
        heroes.getHit(this.damage); //hero yg kena yang kena hit
    }

    public void decreaseMana(Integer damage, Integer manaCost, Integer skill1){

    }




}
