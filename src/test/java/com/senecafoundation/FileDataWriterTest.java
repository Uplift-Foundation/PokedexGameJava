package com.senecafoundation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.File;
import java.util.ArrayList;

import com.senecafoundation.DataHandler.FileDataWriter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileDataWriterTest {
    private FileDataWriter systemUnderTest;
    private Bear testBear;

    @BeforeEach
    void assignFileDataWriter(){
        this.systemUnderTest = new FileDataWriter("./PokedexContents.csv");
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

    @Test
    void testSeedPokeItemsData() { //get rid of commas
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto", 40, 45, 40, 35, 35, 56, "Keen Eye","Ability2", "bug and grass","eletcric ice and rock", this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Ponyta", "small", "yellow", "fire", "Galar",50,85,55,65,65,90,"Flash Fire","Ability2","grass ice bug steel and fairy","water ground and rock",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo","Ability2","None","Fighting and Ghost",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force","Ability2"," Bug and Grass ", "Electric Ice and Rock",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Ability2","Fire Electric Poison Bug Rock Steel Flying","Water Grass Fighting",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Ability2","Fire Ground Fighting Rock Bug Grass","Electric",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new Plant("green","fresh", true, true, true, true, this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new Bear("brown", "circle", true, 200, this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new Homework("white","circle" ,20, true, new PokemonWithSecondAbility("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Ability2","Fire Ground Fighting Rock Bug Grass","Electric", this.systemUnderTest), this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent","Ability2", "ground, rock, & dragon", "water grass & dragon",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate","Ability2", "grass & fairy", "poison ground, rock ghost & steel",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74,"Ability2","Chlorophyll", "ground rock & water", "rock ghost steel flying poison bug fire grass & dragon",this.systemUnderTest)); //stop
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Diglett", "small", "brown", "ground", "Kanto", 10, 55, 25, 45, 35, 95, "Sand Veil","Ability2", "poison rock steel fire & electric", "flying bug & grass",this.systemUnderTest));
    }

    @Test 
    void testSeedPokeItemsData2(){
        this.systemUnderTest = new FileDataWriter("./ChallengerContents.csv");
        this.testBear = new Bear("White", "Fluffy", false, 500, this.systemUnderTest);
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Drowzee", "small", "yellow & brown", "psychic", "Kanto", 60, 48,45, 90, 43, 42, "Insomnia","Ability2", "fighting & poison", "steel psychic & dark",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Eevee", "small", "brown", "normal", "Kanto", 55, 55, 50, 65, 45, 55, "Adaptability","Ability2", "none", "rock ghost & steel",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Ekans", "small", "purple & yellow", "poison", "Kanto", 35, 60, 44, 54, 40, 55, "Shed Skin","Ability2", "grass & fairy", "poison ground rock steel & ghost",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Fearow", "large", "brown", "normal & flying", "Kanto", 65, 90, 65, 61, 61, 100, "Keen Eye","Ability2", "fighting bug & grass", "rock steel & electric",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Tepig","small","orange and red","fire","Unova",65,63,45,45,45,45,"Blaze","Ability2","Grass Steel Bug and Ice","Ground Rock and Water",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Toldeen", "small", "white & orange", "water", "Kanto", 45, 67, 60, 50, 35, 63, "Swift Swim","Ability2", "ground rock & fire", "water grass & dragon",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Illumise", "small", "blue purple & black", "bug", "Hoenn", 65, 47, 75, 85, 73, 85, "Tinted Lense","Ability2", "grass psychic & dark", "fighting flying poison ghost steel fire & fairy",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Kabuto", "small", "brown", "rock & water", "Kanto", 30, 80, 90, 45, 55, 55, "Battle Armor","Ability2", "flying bug fire ice & ground", "fighting ground steel water grass & dragon",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Lapras","large","blue","water and ice","Kanto",130,85,80,95,85,60,"Water Absorb","Ability2","ground dragon flying rock","steel and rock",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Marill","small","blue and white","water and fairy","Johto",70,20,50,50,20,40,"Thick Fat","Ability2","fire rock ground fighting dark dragon","electric grass poison",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Snorlax","large","white and blue","normal","Kanto",160,110,65,110,65,30,"Immunity","Ability2","None","fighting",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Lunatone", "large", "tan", "rock & psychic", "Hoenn", 90, 55, 65, 85, 95, 70, "Levitate","Ability2", "flying bug fire ice fighting & poison", "fighting ground steel psychic & dark",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Snivy","small","green","grass","Unova",45,45,55,55,45,63,"Overgrow","Ability2","Ground Rock and Water","Bug Fire Flying Ice Poison",this.systemUnderTest));
    }

    @Test 
    void testSeedTempPokemon(){
        this.systemUnderTest = new FileDataWriter("./TempPokemon.csv");
        this.testBear = new Bear("White", "Fluff", false, 500, this.systemUnderTest);
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto", 40, 45, 40, 35, 35, 56, "Keen Eye","Ability2", "bug and grass","eletcric ice and rock", this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Ponyta", "small", "yellow", "fire", "Galar",50,85,55,65,65,90,"Flash Fire","Ability2","grass ice bug steel and fairy","water ground and rock",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo","Ability2","None","Fighting and Ghost",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force","Ability2"," Bug and Grass ", "Electric Ice and Rock",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Ability2","Fire Electric Poison Bug Rock Steel Flying","Water Grass Fighting",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Ability2","Fire Ground Fighting Rock Bug Grass","Electric",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent","Ability2", "ground, rock, & dragon", "water grass & dragon",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate","Ability2", "grass & fairy", "poison ground, rock ghost & steel",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74,"Ability2","Chlorophyll", "ground rock & water", "rock ghost steel flying poison bug fire grass & dragon",this.systemUnderTest)); //stop
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Diglett", "small", "brown", "ground", "Kanto", 10, 55, 25, 45, 35, 95, "Sand Veil","Ability2", "poison rock steel fire & electric", "flying bug & grass",this.systemUnderTest));
    }

    @Test
    void testReadAll() {
        File fileToDelete = new File(this.systemUnderTest.getFileLocation());
        fileToDelete.delete();
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto", 40, 45, 40, 35, 35, 56, "Keen Eye","Ability2", "bug and grass","eletcric ice and rock", this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Ponyta", "small", "yellow", "fire", "Galar",50,85,55,65,65,90,"Flash Fire","Ability2","grass ice bug steel and fairy","water ground and rock",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo","Ability2","None","Fighting and Ghost",this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force","Ability2"," Bug and Grass ", "Electric Ice and Rock",this.systemUnderTest));

        ArrayList<PokedexItem> allItemsFromFile = (ArrayList<PokedexItem>) this.systemUnderTest.ReadAll();
        assertEquals(allItemsFromFile.size(), 4);
    }

    @Test 
    void testReadAll2() {
        File fileToDelete = new File(this.systemUnderTest.getFileLocation());
        fileToDelete.delete();
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto", 40, 45, 40, 35, 35, 56, "Keen Eye","Ability2", "bug and grass","eletcric ice and rock", this.systemUnderTest));
        this.testBear.getIDataWriter().Create(new PokemonWithSecondAbility("Ponyta", "small", "yellow", "fire", "Galar",50,85,55,65,65,90,"Flash Fire","Ability2","grass ice bug steel and fairy","water ground and rock",this.systemUnderTest));

        ArrayList<PokemonWithSecondAbility> allItemsFromFile = (ArrayList<PokemonWithSecondAbility>) this.systemUnderTest.ReadAll3();
        assertEquals(allItemsFromFile.size(), 2);

    }
}
