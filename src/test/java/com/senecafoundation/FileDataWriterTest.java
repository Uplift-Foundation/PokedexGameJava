package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertEquals(updatedBear.getColor(), "Black");
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
    void testDelete() throws Exception{
        this.testBear.getIDataWriter().Create(testBear);
        Bear readBear = (Bear) this.testBear.getIDataWriter().Read(testBear.getID());
        assertEquals(testBear.getID(), readBear.getID());
        this.testBear.getIDataWriter().Delete(testBear.getID());
        Exception exception = assertThrows(Exception.class, () -> {
             this.testBear.getIDataWriter().Read(testBear.getID()); 
        });
        assertEquals("Item not found with that ID", exception.getMessage());
    }
}
