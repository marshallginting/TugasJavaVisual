package com.unpri.charactermanager.model;

public class Character {
    private String name;
    private CharacterType type;
    private int level;
    private int hitPoints;
    private int mana; // Ekstensi Bagian B

    // Constructor 1: Default
    public Character() {
        this.name = "Unknown";
        this.type = CharacterType.WARRIOR;
        this.level = 1;
        this.hitPoints = 100;
        this.mana = 50;
    }

    // Constructor 2: Parameterized
    public Character(String name, CharacterType type, int level, int hitPoints, int mana) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.hitPoints = hitPoints;
        setMana(mana); // Menggunakan setter agar validasi berjalan
    }

    // Getters dan Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana tidak boleh bernilai negatif!");
        }
        this.mana = mana;
    }

    // Method Ekstensi Bagian B
    public boolean isAlive() {
        return this.hitPoints > 0;
    }

    // Method Level Up Demo
    public void levelUp() {
        this.level++;
        this.hitPoints += 20;
        this.mana += 10;
    }

    // toString() diperbarui sesuai Bagian A & B
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", level=" + level +
                ", hitPoints=" + hitPoints +
                ", mana=" + mana +
                ", isAlive=" + isAlive() +
                '}';
    }
}