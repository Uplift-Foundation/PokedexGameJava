package com.senecafoundation;

import com.senecafoundation.DataHandler.FileDataWriter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileDataWriterTest {
    private FileDataWriter systemUnderTest;
    private Bear testBear;

    @BeforeEach
    void assignPlant(){
        this.systemUnderTest = new FileDataWriter('./');
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
        Bear updatedBear = this.testBear.getIDataWriter().Update(testBear);
        //asserts
    }
    @Test
    void testRead(){
        this.testBear.getIDataWriter().Create(testBear);
        this.testBear.setShape("fluffy");
        Bear readbBear = this.testBear.getIDataWriter().Read(testBear);
    }
    
    @Test 
    void testDelete(){
        this.testBear.getIDataWriter().Create(testBear);
    }
    


}
//read and delete methods 
//asserts