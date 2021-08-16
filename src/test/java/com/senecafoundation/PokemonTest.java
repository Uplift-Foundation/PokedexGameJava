package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class PokemonTest {
    
    private Pokemon systemUnderTest;  

    @BeforeEach
    void assignPokemon() {
        this.systemUnderTest = new Pokemon(
        "meow",
        "small",
        "yellow",
        "cat",
        "Kanto",
        40,
        41,
        42,
        43,
        44,
        45,
        "big meow",
        "kat",
        "kitty"
        );
    }

    @Test
    void testPokemonCreate() {
        assertEquals("meow", this.systemUnderTest.getName());
        assertEquals("small", this.systemUnderTest.getAvgSize());
        assertEquals("yellow", this.systemUnderTest.getColor());
        assertEquals("cat", this.systemUnderTest.getPokemonType());
        assertEquals("Kanto", this.systemUnderTest.getRegion());
        assertEquals(40, this.systemUnderTest.getHp());
        assertEquals(41, this.systemUnderTest.getAttack());
        assertEquals(42, this.systemUnderTest.getDefense());
        assertEquals(43, this.systemUnderTest.getSpDefense());
        assertEquals(44, this.systemUnderTest.getSpAttack());
        assertEquals(45, this.systemUnderTest.getSpeed());
        assertEquals("big meow", this.systemUnderTest.getAbility1());
        assertEquals("kat", this.systemUnderTest.getTypeEffectiveness());
        assertEquals("kitty", this.systemUnderTest.getTypeWeakness());
    }
}