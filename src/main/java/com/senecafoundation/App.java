package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        List<PokedexItem> PokedexContents = new ArrayList<PokedexItem>();
        PokedexContents.add(new PokemonWithSecondAbility("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto,", 40, 45, 40, 35, 35, 56, "Keen Eye","Ability2", "bug and grass","eletcric, ice, and rock"));
        PokedexContents.add(new PokemonWithSecondAbility("Ponyta", "small", "yellow", "fire", " Galar ",50,85,55,65,65,90,"Flash Fire","Ability2","grass, ice, bug, steel and fairy","water, ground, and rock" ));
        PokedexContents.add(new PokemonWithSecondAbility("Charmander", "small", "orange", "fire", "Kanto", 39,52,43,50,60,62,"Blaze","Ability2","Grass, Ice, Bug, Steel, Fairy","Water,Ground,Rock"));
        PokedexContents.add(new PokemonWithSecondAbility("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo","Ability2","None","Fighting and Ghost" ));
        PokedexContents.add(new PokemonWithSecondAbility("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force","Ability2"," Bug and Grass ", "Electric, Ice, and Rock"));
        PokedexContents.add(new PokemonWithSecondAbility("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Ability2","Fire, Electric, Poison, Bug, Rock, Steel, Flying","Water, Grass, Fighting"));
        PokedexContents.add(new PokemonWithSecondAbility("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Ability2","Fire,Ground,Fighting,Rock,Bug,Grass","Electric"));
        PokedexContents.add(new Plant("green","short", "fresh", true, true, true, true));
        PokedexContents.add(new Bear("brown", "circle", true, 200)); //swap 200 and true. Did we write this the same way as C#???? Some of the Strings/Booleans/Integers might not be in the right place. 
        PokedexContents.add(new Homework("white","circle" ,20, true));
        PokedexContents.add(new PokemonWithSecondAbility("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent","Ability2", "ground, rock, & dragon", "water, grass, & dragon"));
        PokedexContents.add(new PokemonWithSecondAbility("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate","Ability2", "grass & fairy", "poison, ground, rock, ghost, & steel"));
        PokedexContents.add(new PokemonWithSecondAbility("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74,"Ability2","Chlorophyll", "ground, rock, & water", "rock, ghost, steel, flying, poison, bug, fire, grass, & dragon")); //stop

        List<ActualPokemon> TempPokemon = new ArrayList<ActualPokemon>();
        TempPokemon.add(new PokemonWithSecondAbility("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto, ", 40, 45, 40, 35, 35, 56, "Keen Eye","Ability2", "bug and grass","eletcric, ice, and rock"));
        TempPokemon.add(new PokemonWithSecondAbility("Ponyta", "small", "yellow", "fire", " Galar ",50,85,55,65,65,90,"Flash Fire","Ability2","grass, ice, bug, steel and fairy","water, ground, and rock" ));
        TempPokemon.add(new PokemonWithSecondAbility("Charmander", "small", "orange", "fire", "Kanto", 39,52,43,50,60,62,"Blaze","Ability2","Grass, Ice, Bug, Steel, Fairy","Water,Ground,Rock"));
        TempPokemon.add(new PokemonWithSecondAbility("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo","Ability2", "None","Fighting and Ghost" ));
        TempPokemon.add(new PokemonWithSecondAbility("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force","Ability2"," Bug and Grass ", "Electric, Ice, and Rock"));
        TempPokemon.add(new PokemonWithSecondAbility("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Ability2","Fire, Electric, Poison, Bug, Rock, Steel, Flying","Water, Grass, Fighting"));
        TempPokemon.add(new PokemonWithSecondAbility("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Ability2","Fire,Ground,Fighting,Rock,Bug,Grass","Electric"));
        TempPokemon.add(new PokemonWithSecondAbility("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent","Ability2", "ground, rock, & dragon", "water, grass, & dragon"));
        TempPokemon.add(new PokemonWithSecondAbility("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate","Ability2", "grass & fairy", "poison, ground, rock, ghost, & steel"));
        TempPokemon.add(new PokemonWithSecondAbility("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74, "Chlorophyll","Ability2", "ground, rock, & water", "rock, ghost, steel, flying, poison, bug, fire, grass, & dragon"));

        List<ActualPokemon> ChallengerContents = new ArrayList<ActualPokemon>();
        ChallengerContents.add(new PokemonWithSecondAbility("Diglett", "small", "brown", "ground", "Kanto", 10, 55, 25, 45, 35, 95, "Sand Veil","Ability2", "poison, rock, steel ,fire, & electric", "flying, bug, & grass"));
        ChallengerContents.add(new PokemonWithSecondAbility("Drowzee", "small", "yellow & brown", "psychic", "Kanto", 60, 48,45, 90, 43, 42, "Insomnia","Ability2", "fighting & poison", "steel, psychic, & dark"));
        ChallengerContents.add(new PokemonWithSecondAbility("Eevee", "small", "brown", "normal", "Kanto", 55, 55, 50, 65, 45, 55, "Adaptability","Ability2", "none", "rock, ghost, & steel"));
        ChallengerContents.add(new PokemonWithSecondAbility("Ekans", "small", "purple & yellow", "poison", "Kanto", 35, 60, 44, 54, 40, 55, "Shed Skin","Ability2", "grass & fairy", "poison, ground, rock, steel, & ghost"));
        ChallengerContents.add(new PokemonWithSecondAbility("Fearow", "large", "brown", "normal & flying", "Kanto", 65, 90, 65, 61, 61, 100, "Keen Eye","Ability2", "fighting, bug, & grass", "rock, steel , & electric"));
        ChallengerContents.add(new PokemonWithSecondAbility("Tepig","small","orange and red","fire","Unova",65,63,45,45,45,45,"Blaze","Ability2","Grass, Steel, Bug, and Ice","Ground, Rock, and Water"));
        ChallengerContents.add(new PokemonWithSecondAbility("Toldeen", "small", "white & orange", "water", "Kanto", 45, 67, 60, 50, 35, 63, "Swift Swim","Ability2", "ground, rock, & fire", "water, grass, & dragon"));
        ChallengerContents.add(new PokemonWithSecondAbility("Illumise", "small", "blue, purple, & black", "bug", "Hoenn", 65, 47, 75, 85, 73, 85, "Tinted Lense","Ability2", "grass, psychic, & dark", "fighting, flying, poison, ghost, steel, fire, & fairy"));
        ChallengerContents.add(new PokemonWithSecondAbility("Kabuto", "small", "brown", "rock & water", "Kanto", 30, 80, 90, 45, 55, 55, "Battle Armor","Ability2", "flying, bug, fire, ice, & ground", "fighting, ground, steel, water, grass, & dragon"));
        ChallengerContents.add(new PokemonWithSecondAbility("Lapras","large","blue","water and ice","Kanto",130,85,80,95,85,60,"Water Absorb","Ability2","ground, dragon, flying, rock","steel and rock"));
        ChallengerContents.add(new PokemonWithSecondAbility("Marill","small","blue and white","water and fairy","Johto",70,20,50,50,20,40,"Thick Fat","Ability2","fire,rock,ground,fighting,dark,dragon","electric, grass, poison"));
        ChallengerContents.add(new PokemonWithSecondAbility("Snorlax","large","white and blue","normal","Kanto",160,110,65,110,65,30,"Immunity","Ability2","None","fighting"));
        ChallengerContents.add(new PokemonWithSecondAbility("Lunatone", "large", "tan", "rock & psychic", "Hoenn", 90, 55, 65, 85, 95, 70, "Levitate","Ability2", "flying, bug, fire, ice, fighting, & poison", "fighting, ground, steel, psychic, & dark"));
        ChallengerContents.add(new PokemonWithSecondAbility("Snivy","small","green","grass","Unova",45,45,55,55,45,63,"Overgrow","Ability2","Ground,Rock, and Water","Bug,Fire,Flying,Ice, Poison"));
        
        Scanner userScanner = new Scanner(System.in);
        System.out.println("It looks like you've found an object! Will you pick it up? (Yes or No)");
        String userResponse = userScanner.nextLine();
        if(userResponse.equals("Yes")) {
//pokedex 1
            Pokedex foundPokedex = new Pokedex(true);
            foundPokedex.setPokemonsAndStuff(PokedexContents);
            foundPokedex.setTempPokemon(TempPokemon);
            
//pokedex 2
            ChallengerPokedex StrangerPokedex = new ChallengerPokedex(true);
            StrangerPokedex.setChallengerContents(ChallengerContents); 
            Random rd = new Random(); 

            System.out.println("You might have found a pokedex...what shape is it?");
            userResponse = userScanner.nextLine(); 
            if (userResponse.equals(Pokedex.shape)) {
                System.out.println("Oh, that sounds like it might be a Pokedex...what color is it?");
                userResponse = userScanner.nextLine(); 
                if (userResponse.equals(Pokedex.color)) {
                    System.out.println("Wow you found a pokedex! Would you like to hear about some pokemon?");
                    userResponse = userScanner.nextLine();
                    //do {
                    if(userResponse.equals("Yes")) {
                        while (userResponse.equals("Yes")) {
                            PokedexItem randomPokemonItem = PokedexContents.get(rd.nextInt(12)); 
                            if (randomPokemonItem instanceof Plant) { 
                                System.out.println(((Plant)randomPokemonItem).Grows());
                            }
                            else if (randomPokemonItem instanceof Bear) {
                                System.out.println(((Bear)randomPokemonItem).roll());
                            }
                            else if (randomPokemonItem instanceof Homework) {
                            System.out.println(((Homework)randomPokemonItem).getsCrumbled());
                            } 
                            else if (randomPokemonItem instanceof Pokemon) {
                                System.out.println("You got it boss. Here's one, this is a " + ((Pokemon)randomPokemonItem).getName() + ". " + ((Pokemon)randomPokemonItem).getName() + " is " + ((Pokemon)randomPokemonItem).getColor() + ". They are usually " + ((Pokemon)randomPokemonItem).getAvgSize() + ". " + ((Pokemon)randomPokemonItem).getName() + " is a " + ((Pokemon)randomPokemonItem).getPokemonType() + " type pokemon and can be found in the " + ((Pokemon)randomPokemonItem).getRegion() + " Region.");
                            }
                            System.out.println("Would you like to hear about another pokemon?");
                            userResponse = userScanner.nextLine();
                        }
                    }
                    else {
                        System.out.println("Aw, okay. Maybe another time.");
                    }
                    System.out.println("...A stranger approaches, they ask if you would like to compare pokemon. Would you like to? (Yes or No)");
                    userResponse = userScanner.nextLine();
                    if (userResponse.equals("Yes")) {
                        while (userResponse.equals("Yes")) { //chooses random Pokemon from TempList
                            ActualPokemon randomTempPokemon = TempPokemon.get(rd.nextInt(9)); 

                                // { display table with player's pokemon stats }
                            System.out.println("-- Your Pokemon --" + System.lineSeparator() + "Pokemon: " + ((Pokemon)randomTempPokemon).getName() + System.lineSeparator() + "HP: " + ((Pokemon)randomTempPokemon).getHp() + System.lineSeparator() + "Attack: " + ((Pokemon)randomTempPokemon).getAttack() + System.lineSeparator() + "Defense: " + ((Pokemon)randomTempPokemon).getDefense() + System.lineSeparator() + "spDefense: " + ((Pokemon)randomTempPokemon).getSpDefense() + System.lineSeparator() + "spAttack: " + ((Pokemon)randomTempPokemon).getSpAttack() + System.lineSeparator() + "Speed: " + ((Pokemon)randomTempPokemon).getSpeed() + System.lineSeparator() + "Ability: " + ((Pokemon)randomTempPokemon).getAbility1() + System.lineSeparator() + "Type: " + ((Pokemon)randomTempPokemon).getPokemonType() + System.lineSeparator() + "Effectiveness: " + ((Pokemon)randomTempPokemon).getTypeEffectiveness() + System.lineSeparator() + "Weakness: " + ((Pokemon)randomTempPokemon).getTypeWeakness());
                                
                                //chooses random Pokemon from ChallengerPokedex
                            ActualPokemon randomActualPokemon = ChallengerContents.get(rd.nextInt(13)); 
                            
                                // { display table with challenger's pokemon stats }
                            System.out.println("-- Stranger's Pokemon --" + System.lineSeparator() + "Pokemon: " + ((Pokemon)randomActualPokemon).getName() + System.lineSeparator() + "HP: " + ((Pokemon)randomActualPokemon).getHp() + System.lineSeparator() + "Attack: " + ((Pokemon)randomActualPokemon).getAttack() + System.lineSeparator() + "Defense: " + ((Pokemon)randomActualPokemon).getDefense() + System.lineSeparator() + "spDefense: " + ((Pokemon)randomActualPokemon).getSpDefense() + System.lineSeparator() + "spAttack: " + ((Pokemon)randomActualPokemon).getSpAttack() + System.lineSeparator() + "Speed: " + ((Pokemon)randomActualPokemon).getSpeed() + System.lineSeparator() + "Ability: " + ((Pokemon)randomActualPokemon).getAbility1() + System.lineSeparator() + "Type: " + ((Pokemon)randomActualPokemon).getPokemonType() + System.lineSeparator() + "Effectiveness: " + ((Pokemon)randomActualPokemon).getTypeEffectiveness() + System.lineSeparator() + "Weakness: " + ((Pokemon)randomActualPokemon).getTypeWeakness());

                            System.out.println("Would you like to compare another pokemon?");
                            userResponse = userScanner.nextLine();
                        }
                        System.out.println("The stranger wishes you a good day and walks off.");
                    }
                    else {
                        System.out.println("The stranger looks disappointed, but they wish you a good day and walk off"); 
                    }
                    
                //what color is it?
                }  
                else {
                    System.out.println("I'm sorry I don't think that's a Pokedex.");
                }
            //what shape is it?  
            }
            else {
                System.out.println("hmm...I don't think that's a pokedex. Better luck next time.");
            }
        } 
        //will you pick it up?   
        else {
            System.out.println("You needed to enter Yes or No, the instructions were pretty simple...not sure how you messed that one up.");
        } 

        userScanner.close();
    }
}
