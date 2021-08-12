package com.senecafoundation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;

public class HomeworkTest {

    private Homework systemUnderTest;
    @Mock private transient PokemonWithSecondAbility myChander;
    
    @BeforeEach
    void assignHomework() {
        MockitoAnnotations.openMocks(this);
        when(myChander.getName()).thenReturn("Cristian");
        this.systemUnderTest = new Homework(
            "White",
            "Rectangle",
            500,
            true,
            myChander
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
