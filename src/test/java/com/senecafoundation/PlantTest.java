package com.senecafoundation;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.senecafoundation.DataHandler.FileDataWriter;

import org.junit.jupiter.api.BeforeEach;

public class PlantTest {

    private Plant systemUnderTest;
    @Mock private transient FileDataWriter fileDataWriter;


    @BeforeEach
    void assignPlant(){
        this.systemUnderTest = new Plant(
            "green",
            "fresh",
            true,
            true,
            true,
            true,
            fileDataWriter
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
    @Test 
    void GrowsIsTrue(){
        assertEquals(
            "This is not a plant... not sure what in tarnation it's doing here",
            systemUnderTest.Grows()
        );
    }
    @Test 
    void GrowsIsFalse(){
        systemUnderTest.setHasLeaves(false);
        assertEquals(
            "This plant is not growing... maybe try actually taking care of the things you own?",
            systemUnderTest.Grows()
        );
    }
    @Test 
    void hasDiedTrue(){
        systemUnderTest.setSmell("rotten");
        systemUnderTest.setColor("brown");
        assertEquals(
            true,
            systemUnderTest.hasDied()
        );
    }
    
    @Test 
    void hasDiedFalse(){
        assertEquals(
            false,
            systemUnderTest.hasDied()
        );
    }



    
}
