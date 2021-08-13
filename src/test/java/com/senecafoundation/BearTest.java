package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class BearTest {

    private Bear systemUnderTest;
    @BeforeEach
    void assignBear() {
        this.systemUnderTest = new Bear(
            "brown", 
            "circle", 
            true, 
            200
        );
    }

    @Test
    void testBearCreate() {
        assertEquals("brown", this.systemUnderTest.getColor());
        assertEquals("circle", this.systemUnderTest.getShape());
        assertEquals(true, this.systemUnderTest.getScary());
        assertEquals(200, this.systemUnderTest.getWeight());
    }

    @Test
    void DoesNotAttack() {
        assertEquals(
            false,
            systemUnderTest.attacks()
        );
    }


    @Test
    void attacks() {
        systemUnderTest.setWeight(300);
        assertEquals(
            true,
            systemUnderTest.attacks()
        );
    }


    @Test
    void roll() {
        assertEquals( 
            "This is a bear...it's definitly scary, but not a pokemon. maybe try again.",
             systemUnderTest.roll()
        );
    }

    @Test
    void DoesNotRoll() {
        systemUnderTest.setWeight(100);
        assertEquals(
            "He will NOT roll",
            systemUnderTest.roll()
        );
    }
}