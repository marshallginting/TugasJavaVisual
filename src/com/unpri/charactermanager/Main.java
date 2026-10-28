package com.unpri.charactermanager;

import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {
        // Membuat 3 karakter awal
        Character char1 = new Character("Arthas", CharacterType.WARRIOR, 5, 150, 30);
        Character char2 = new Character("Fajar", CharacterType.MAGE, 4, 80, 120);
        Character char3 = new Character("Sylvanas", CharacterType.ARCHER, 6, 110, 60);

        System.out.println("=== DATA KARAKTER AWAL ===");
        System.out.println(char1);
        System.out.println(char2);
        System.out.println(char3);

        // Demo Level Up
        System.out.println("\n=== DEMO LEVEL UP (Arthas) ===");
        char1.levelUp();
        System.out.println(char1);

        // Ekstensi Bagian B: Karakter baru, set mana, uji isAlive()
        System.out.println("\n=== EKSTENSI FITUR MANDIRI (Bagian B) ===");
        Character char4 = new Character();
        char4.setName("Illidan");
        char4.setType(CharacterType.ASSASSIN);
        char4.setHitPoints(0); // Simulasi karakter mati/KO
        char4.setMana(90);

        System.out.println(char4);
        System.out.println("Status Hidup (" + char4.getName() + "): " + char4.isAlive());
    }
}