package com.senecafoundation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class PokedexItemTest {
    private PokedexItem systemUnderTest;

    @BeforeEach
    void assignPokedexItem() {
        this.systemUnderTest = new PokedexItem (
            "blue"
        );
    }

    @Test
    void testPokedexItemTestCreate() {
        assertEquals("blue", this.systemUnderTest.getColor());
    }
}