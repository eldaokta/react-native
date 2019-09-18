package com.enigma.model;


import java.util.Objects;

public class Heroes implements HitAble, Offensive{
    private Integer hp;
    private Integer mana;
    private Integer baseDamage;
    private Integer skill1;

    public Heroes(String name, Integer integer, Integer hp, Integer mana, Integer baseDamage){
        this.hp = hp;
        this.mana = mana;
        this.baseDamage = baseDamage;
    }

//    public void castSkill(Heroes heroes){
//        skill1.castSkill(heroes);
//        skill1.decreaseMana(this);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Heroes heroes = (Heroes) o;
        return Objects.equals(hp, heroes.hp) &&
                Objects.equals(mana, heroes.mana) &&
                Objects.equals(baseDamage, heroes.baseDamage) &&
                Objects.equals(skill1, heroes.skill1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hp, mana, baseDamage, skill1);
    }

    public void decreaseMana(Integer mana){
        this.mana = this.mana - mana;
    }
    @Override
    public void getHit(Integer damage) {
        this.hp = this.hp-damage;
    }

    @Override
    public void getSKilled(Integer damage) {
        this.hp = this.hp-damage;
    }

    @Override
    public void attack(HitAble hitAble) {
        hitAble.getHit(this.baseDamage);
    }

    @Override
    public void castSkill(HitAble hitAble) {
        hitAble.getSKilled(this.baseDamage);
    }

    public String print() {
        return "Heroes{" +
                "hp=" + hp+
                ", mana=" + mana +
                ", baseDamage=" + baseDamage +
                '}';
    }
}

