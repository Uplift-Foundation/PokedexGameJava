package com.senecafoundation;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;

public class HomeworkTest {

    private Homework systemUnderTest;
    @Mock
    private PokemonWithSecondAbility myChander;
    
    @BeforeEach
    void assignHomework() {
        myChander = new PokemonWithSecondAbility("Makayla", "small", "orange", "fire", "Kanto", 39,52,43,50,60,62,"Blaze","Ability2","Grass, Ice, Bug, Steel, Fairy","Water,Ground,Rock");
        PokemonWithSecondAbility myChanderSvc = spy(myChander);
        when(myChander.getName()).thenReturn("Cristian");
        this.systemUnderTest = new Homework(
            "White",
            "Rectangle",
            500,
            true,
            myChanderSvc
        );
    }

    @Test 
    void testHomeworkCreate() {
        assertEquals("White", this.systemUnderTest.getColor());
        assertEquals("Rectangle", this.systemUnderTest.getShape());
        assertEquals(500, this.systemUnderTest.getWords());
        assertEquals(true, this.systemUnderTest.getFoldAction());
    }

    @Test
    void getsCrumbledIsNotCrumbled() {
        assertEquals(
            "This homework is still isn't crumbled",
            systemUnderTest.getsCrumbled()
        );
    }

    @Test
    void getsCrumbledIsCrumbled() {
        systemUnderTest.setShape("circle");
        assertEquals(
            "This is someone's homework ... maybe you should give it back",
            systemUnderTest.getsCrumbled()
        );
    }

    @Test
    void getsExcuse() {
        assertEquals(
            "My Cristian ate it",
            systemUnderTest.getAnExcuse()
        );
    }
    
}
