package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class PlantTest {

    private Plant systemUnderTest;

    @BeforeEach
    void assignPlant(){
        this.systemUnderTest = new Plant(
            "green",
            "fresh",
            true,
            true,
            true,
            true
            );
    }

    @Test 
    void testPlantCreate(){
        assertEquals("green", this.systemUnderTest.getColor());
        assertEquals("fresh", this.systemUnderTest.getSmell());
        assertEquals(true, this.systemUnderTest.getHasLeaves());
        assertEquals(true, this.systemUnderTest.getHasRoots());
        assertEquals(true, this.systemUnderTest.getCollectsSunLight());
        assertEquals(true, this.systemUnderTest.getMakesGlucose());
    }

    @Test 
    void PhotosynthesizesisTrue(){
        assertEquals(
            "This plant can do the photosynthesizing",
            systemUnderTest.Photosynthesizes()
        );
    }

    @Test
    void PhotosynthesizesisFalse(){
        systemUnderTest.setCollectsSunLight(false);
        assertEquals(
            "This plant is DEAD",
            systemUnderTest.Photosynthesizes()
        );
    }


    
}
