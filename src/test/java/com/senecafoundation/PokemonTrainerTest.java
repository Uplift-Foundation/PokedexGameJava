package com.senecafoundation;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.senecafoundation.DataHandler.FileDataWriter;

import org.junit.jupiter.api.BeforeEach;

public class PokemonTrainerTest {

    private StrangerTrainer systemUnderTest;
    private FileDataWriter randomPokemonFile;
    private Bear testBear;


    @BeforeEach
    void assignPokemonTrainer() {
        this.randomPokemonFile = new FileDataWriter("./ChallengerContents.csv");
        this.testBear = new Bear("White", "Fluffy", false, 500, this.randomPokemonFile);
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Drowzee", "small", "yellow & brown", "psychic", "Kanto", 60, 48,45, 90, 43, 42, "Insomnia","Ability2", "fighting & poison", "steel psychic & dark",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Eevee", "small", "brown", "normal", "Kanto", 55, 55, 50, 65, 45, 55, "Adaptability","Ability2", "none", "rock ghost & steel",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Ekans", "small", "purple & yellow", "poison", "Kanto", 35, 60, 44, 54, 40, 55, "Shed Skin","Ability2", "grass & fairy", "poison ground rock steel & ghost",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Fearow", "large", "brown", "normal & flying", "Kanto", 65, 90, 65, 61, 61, 100, "Keen Eye","Ability2", "fighting bug & grass", "rock steel & electric",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Tepig","small","orange and red","fire","Unova",65,63,45,45,45,45,"Blaze","Ability2","Grass Steel Bug and Ice","Ground Rock and Water",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Toldeen", "small", "white & orange", "water", "Kanto", 45, 67, 60, 50, 35, 63, "Swift Swim","Ability2", "ground rock & fire", "water grass & dragon",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Illumise", "small", "blue purple & black", "bug", "Hoenn", 65, 47, 75, 85, 73, 85, "Tinted Lense","Ability2", "grass psychic & dark", "fighting flying poison ghost steel fire & fairy",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Kabuto", "small", "brown", "rock & water", "Kanto", 30, 80, 90, 45, 55, 55, "Battle Armor","Ability2", "flying bug fire ice & ground", "fighting ground steel water grass & dragon",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Lapras","large","blue","water and ice","Kanto",130,85,80,95,85,60,"Water Absorb","Ability2","ground dragon flying rock","steel and rock",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Marill","small","blue and white","water and fairy","Johto",70,20,50,50,20,40,"Thick Fat","Ability2","fire rock ground fighting dark dragon","electric grass poison",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Snorlax","large","white and blue","normal","Kanto",160,110,65,110,65,30,"Immunity","Ability2","None","fighting",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Lunatone", "large", "tan", "rock & psychic", "Hoenn", 90, 55, 65, 85, 95, 70, "Levitate","Ability2", "flying bug fire ice fighting & poison", "fighting ground steel psychic & dark",this.randomPokemonFile));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Snivy","small","green","grass","Unova",45,45,55,55,45,63,"Overgrow","Ability2","Ground Rock and Water","Bug Fire Flying Ice Poison",this.randomPokemonFile));
        
        this.systemUnderTest = new StrangerTrainer (new FileDataWriter("./Mary.csv"), "Mary");
    }

    @Test
    void testPopulateFromRandom() {
        this.systemUnderTest.populateFromRandom(this.randomPokemonFile);
    }
}