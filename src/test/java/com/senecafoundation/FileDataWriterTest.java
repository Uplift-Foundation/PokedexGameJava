package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.senecafoundation.DataHandler.FileDataWriter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileDataWriterTest {
    private FileDataWriter systemUnderTest;
    private Bear testBear;

    @BeforeEach
    void assignPlant(){
        this.systemUnderTest = new FileDataWriter("./Objects.csv");
        this.testBear = new Bear("White", "Fluffy", false, 500, this.systemUnderTest);
    }

    @Test 
    void testCreate(){
        this.testBear.getIDataWriter().Create(testBear);
    };

    @Test 
    void testUpdate(){
        this.testBear.getIDataWriter().Create(testBear);
        this.testBear.setColor("Black");
        Bear updatedBear = (Bear) this.testBear.getIDataWriter().Update(testBear);
        //asserts
    }
    @Test
    void testRead() throws Exception {
        try {
            this.testBear.getIDataWriter().Create(testBear);
        }
        catch (Exception e) {

        }
        Bear readbBear = (Bear) this.testBear.getIDataWriter().Read(testBear.getID());
        assertEquals(testBear.getID(), readbBear.getID());
    }

    @Test 
    void testDelete(){
        this.testBear.getIDataWriter().Create(testBear);
    }



}
//read and delete methods 
//asserts