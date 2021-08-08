package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class HomeworkTest {

    private Homework systemUnderTest;
    
    @BeforeEach
    void assignHomework() {
        this.systemUnderTest = new Homework(
            "White",
            "Rectangle",
            500,
            true
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
    
}
