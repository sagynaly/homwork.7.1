package com.compani;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior(100, 50);
        Magic magic = new Magic(150, 30);
        Medic medic = new Medic(200, 10);

        Hero[] superHero = {warrior, magic, medic};

        for (int i = 0; i < superHero.length; i++) {
            superHero[0].applySuperAbility("Warrior применил суперспособность CRITICAL DAMAGE");
            superHero[1].applySuperAbility("Magic применил суперспособность LIGHT SNIPE");
            superHero[2].applySuperAbility("Medic применил суперспособность HEALTH DAMAGE");
            break;
        }
    }
}