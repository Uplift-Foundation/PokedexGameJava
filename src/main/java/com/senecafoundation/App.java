package com.senecafoundation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
//      Edgardo and Cristian helped too Warren :)
//      - Lists for type abilities -
        List<String> NormalAbilities = new ArrayList<String>();
        NormalAbilities.add("Intimidate");

        List<String> FireAbilities = new ArrayList<String>();
        FireAbilities.add("Flame Absorb");

        List<String> WaterAbilities = new ArrayList<String>();
        WaterAbilities.add("Water Absorb");

        List<String> ElectricAbilities = new ArrayList<String>();
        ElectricAbilities.add("Magnet Pull");

        List<String> GrassAbilities = new ArrayList<String>();
        GrassAbilities.add("Overgrow");

        List<String> IceAbilities = new ArrayList<String>();
        IceAbilities.add("Snow Cloak");
        
        List<String> FightingAbilities = new ArrayList<String>();
        FightingAbilities.add("Reckless");

        List<String> PoisonAbilities = new ArrayList<String>();
        PoisonAbilities.add("Immunity");

        List<String> GroundAbilities = new ArrayList<String>();
        GroundAbilities.add("Sand Viel");

        List<String> FlyingAbilities = new ArrayList<String>();
        FlyingAbilities.add("dive bomb");
        
        List<String> PsychicAbilities = new ArrayList<String>();
        PsychicAbilities.add("Synchronize");

        List<String> BugAbilities = new ArrayList<String>();
        BugAbilities.add("Swarm");

        List<String> RockAbilities = new ArrayList<String>();
        RockAbilities.add("Solid Rock");

        List<String> GhostAbilities = new ArrayList<String>();
        GhostAbilities.add("Levitate");
        
        List<String> DragonAbilities = new ArrayList<String>();
        DragonAbilities.add("Sniper");
        
        List<String> DarkAbilities = new ArrayList<String>();
        DarkAbilities.add("RandomMove");
        
        List<String> SteelAbilities = new ArrayList<String>();
        SteelAbilities.add("Steel Ability");

        List<String> FairyAbilities = new ArrayList<String>();
        FairyAbilities.add("Fairy Ability");

//     - Lists for specific pokemon -
        List<PokemonType> PidgyType = new ArrayList<PokemonType>();
//      ask Travis if we need any code here. No right? 
        List<PokemonType> PonytaType = new ArrayList<PokemonType>();

        List<PokemonType> CharmanderType = new ArrayList<PokemonType>();

        List<PokemonType> GlameowType = new ArrayList<PokemonType>();

        List<PokemonType> RuffletType = new ArrayList<PokemonType>();

        List<PokemonType> OnixType = new ArrayList<PokemonType>();
        
        List<PokemonType> MantineType = new ArrayList<PokemonType>();
        
        List<PokemonType> SquirtleType = new ArrayList<PokemonType>();
        
        List<PokemonType> ArbokType = new ArrayList<PokemonType>();

        List<PokemonType> DeerlingType = new ArrayList<PokemonType>();

        List<PokemonType> DiglettType = new ArrayList<PokemonType>();
        
        List<PokemonType> DrowzeeType = new ArrayList<PokemonType>();

        List<PokemonType> EeveeType = new ArrayList<PokemonType>();

        List<PokemonType> EkansType = new ArrayList<PokemonType>();
        
        List<PokemonType> FearowType = new ArrayList<PokemonType>();

        List<PokemonType> TepigType = new ArrayList<PokemonType>();
        
        List<PokemonType> GoldeenType = new ArrayList<PokemonType>();
        
        List<PokemonType> IllumiseType = new ArrayList<PokemonType>();
    
        List<PokemonType> KabutoType = new ArrayList<PokemonType>();

        List<PokemonType> LaprasType = new ArrayList<PokemonType>();
        
        List<PokemonType> MarillType = new ArrayList<PokemonType>();
        
        List<PokemonType> SnorlaxType = new ArrayList<PokemonType>();

        List<PokemonType> LunatoneType = new ArrayList<PokemonType>();
        
        List<PokemonType> SnivyType = new ArrayList<PokemonType>();
        
//     - Lists for pokemon types -
        PokemonType normalType = new PokemonType();
        normalType.setName("normal");
        normalType.setWeakness("rock, ghost, steel");
        normalType.setEffectiveness("none");
        normalType.setAbilities(NormalAbilities);
        //pokemon.add(type)

        PokemonType fireType = new PokemonType();
        fireType.setName("fire");
        fireType.setWeakness("Rock, Fire, Water, Dragon");
        fireType.setEffectiveness("Bug, Steel, Grass, Ice");
        fireType.setAbilities(FireAbilities);
        //pokemon.add(type)

        PokemonType waterType = new PokemonType();
        waterType.setName("water");
        waterType.setWeakness("Water, Grass, Dragon");
        waterType.setEffectiveness("Ground, Rock, Fire");
        waterType.setAbilities(WaterAbilities);
        //pokemon.add(type)

        PokemonType electricType = new PokemonType();
        electricType.setName("electric");
        electricType.setWeakness("Ground, Grass, Electric, Dragon");
        electricType.setEffectiveness("Flying, Water");
        electricType.setAbilities(ElectricAbilities);
        //pokemon.add(type)
        
        PokemonType grassType = new PokemonType();
        grassType.setName("grass");
        grassType.setWeakness("Flying, Poison, Bug, Steel, Fire, Grass, Dragon");
        grassType.setEffectiveness("Ground, Rock, Water");
        grassType.setAbilities(GrassAbilities);
        //pokemon.add(type)

        PokemonType iceType = new PokemonType();
        iceType.setName("ice");
        iceType.setWeakness("Steel, Fire, Water, Ice");
        iceType.setEffectiveness("Flying, Ground, Grass, Dragon");
        iceType.setAbilities(IceAbilities);
        //pokemon.add(type)

        PokemonType fightingType = new PokemonType();
        fightingType.setName("fighting");
        fightingType.setWeakness("Flying, Poison, Psychic, Bug, Ghost, Fairy");
        fightingType.setEffectiveness("Normal, Rock, Steel, Ice, Dark");
        fightingType.setAbilities(FightingAbilities);
        //pokemon.add(type)

        PokemonType poisonType = new PokemonType();
        poisonType.setName("poison");
        poisonType.setWeakness("Poison, Ground, Rock, Ghost, Steel");
        poisonType.setEffectiveness("Grass, Fairy");
        poisonType.setAbilities(PoisonAbilities);
        //pokemon.add(type)

        PokemonType groundType = new PokemonType();
        groundType.setName("ground");
        groundType.setWeakness("Flying, Bug, Grass");
        groundType.setEffectiveness("Poison, Rock, Steel, Fire, Electric");
        groundType.setAbilities(GroundAbilities);
        //pokemon.add(type)

        PokemonType flyingType = new PokemonType();
        flyingType.setName("flying");
        flyingType.setWeakness("rock, steel, electric");
        flyingType.setEffectiveness("fighting, bug, grass");
        flyingType.setAbilities(FlyingAbilities);
        PidgyType.add(flyingType);
         //pokemon.add(type)

        PokemonType psychicType = new PokemonType();
        psychicType.setName("psychic");
        psychicType.setWeakness("Steel, Psychic, Dark");
        psychicType.setEffectiveness("Fighting, Poison");
        psychicType.setAbilities(PsychicAbilities);
        //pokemon.add(type)
        
        PokemonType bugType = new PokemonType();
        psychicType.setName("bug");
        psychicType.setWeakness("Fighting, Flying, Poison, Ghost, Steel, Fire, Fairy");
        psychicType.setEffectiveness("Grass, Psychic, Dark");
        psychicType.setAbilities(BugAbilities);
        //pokemon.add(type)

        PokemonType rockType = new PokemonType();
        psychicType.setName("rock");
        psychicType.setWeakness("Fighting, Ground, Steel");
        psychicType.setEffectiveness("Flying, Bug, Fire, Ice");
        psychicType.setAbilities(RockAbilities);
        //pokemon.add(type)

        PokemonType ghostType = new PokemonType();
        psychicType.setName("ghost");
        psychicType.setWeakness("Normal, Dark");
        psychicType.setEffectiveness("Ghost, Pshycic");
        psychicType.setAbilities(GhostAbilities);
        //pokemon.add(type)

        PokemonType dragonType = new PokemonType();
        psychicType.setName("Dragon");
        psychicType.setWeakness("Dragon, Steel, Fairy");
        psychicType.setEffectiveness("Dragon");
        psychicType.setAbilities(DragonAbilities);
        //pokemon.add(type)

        PokemonType darkType = new PokemonType();
        psychicType.setName("dark");
        psychicType.setWeakness("Fighting, Dark, Fairy");
        psychicType.setEffectiveness("Ghost, Psychic");
        psychicType.setAbilities(DarkAbilities);
        //pokemon.add(type)

        PokemonType steelType = new PokemonType();
        psychicType.setName("steel");
        psychicType.setWeakness("Steel, Fire, Water?, Eletric");
        psychicType.setEffectiveness("Rock, Ice, Fairy, Not Steel Even Though It's weak to Steel"); //change this
        psychicType.setAbilities(SteelAbilities);
        //pokemon.add(type)

        PokemonType fairyType = new PokemonType();
        psychicType.setName("fairy");
        psychicType.setWeakness("Poison, Steel, Fire");
        psychicType.setEffectiveness("Fighting, Dragon, Dark");
        psychicType.setAbilities(FairyAbilities);
        //pokemon.add(type)

//      - Lists of Pokemon -
        List<PokedexItem> PokedexContents = new ArrayList<PokedexItem>();
        PokedexContents.add(new Pokemon("Pidgey", "small and chubby", "brown", "flying & normal", 40, 45, 40, 35, 35, 56, "Keen Eye", PidgyType));
        PokedexContents.add(new Pokemon("Ponyta", "small", "yellow", "fire",50,85,55,65,65,90,"Flash Fire", PonytaType));
        PokedexContents.add(new Pokemon("Charmander", "small", "orange", "Kanto", 39,52,43,50,60,62,"Blaze", CharmanderType));
        PokedexContents.add(new Pokemon("Glameow", "small", "grey", "Sinnoh",49,55,42,37,42,85,"Own Tempo", GlameowType));
        PokedexContents.add(new Pokemon("Rufflet", "small", "white & dark blue", "Unova",70,83,50,50,37,60,"Sheer Force", RuffletType));
        PokedexContents.add(new Pokemon("Onix", "humongous", "grey", "Kanto",35,45,160,45,30,70,"Sturdy", OnixType));
        PokedexContents.add(new Pokemon("Mantine", "humongous", "blue & white", "Alola",85,40,70,140,80,70,"Swift Swim", MantineType));
        PokedexContents.add(new Plant("green","short", "fresh", true, true, true, true));
        PokedexContents.add(new Bear("brown", "circle", true, 200)); 
        PokedexContents.add(new Homework("white","circle" ,20, true));
        PokedexContents.add(new Pokemon("Squritle", "small", "blue", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent", SquirtleType));
        PokedexContents.add(new Pokemon("Arbok", "large", "purple", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate", ArbokType));
        PokedexContents.add(new Pokemon("Deerling", "small", "pink & white with yellow accents", "Unova", 60, 60, 50, 50, 40, 74,"Chlorophyll", DeerlingType)); //stop

        List<ActualPokemon> TempPokemon = new ArrayList<ActualPokemon>();
        TempPokemon.add(new Pokemon("Pidgey", "small and chubby", "brown", "Kanto & Johto, ", 40, 45, 40, 35, 35, 56, "Keen Eye", PidgyType));
        TempPokemon.add(new Pokemon("Ponyta", "small", "yellow", " Galar ",50,85,55,65,65,90,"Flash Fire",PidgyType ));
        TempPokemon.add(new Pokemon("Charmander", "small", "orange", "Kanto", 39,52,43,50,60,62,"Blaze", PonytaType));
        TempPokemon.add(new Pokemon("Glameow", "small", "grey", "Sinnoh",49,55,42,37,42,85,"Own Tempo", GlameowType));
        TempPokemon.add(new Pokemon("Rufflet", "small", "white & dark blue", "Unova",70,83,50,50,37,60,"Sheer Force", RuffletType));
        TempPokemon.add(new Pokemon("Onix", "humongous", "grey", "Kanto",35,45,160,45,30,70,"Sturdy", OnixType));
        TempPokemon.add(new Pokemon("Mantine", "humongous", "blue & white", "Alola",85,40,70,140,80,70,"Swift Swim", MantineType));
        TempPokemon.add(new Pokemon("Squritle", "small", "blue", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent", SquirtleType));
        TempPokemon.add(new Pokemon("Arbok", "large", "purple", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate", ArbokType));
        TempPokemon.add(new Pokemon("Deerling", "small", "pink & white with yellow accents", "Unova", 60, 60, 50, 50, 40, 74, "Chlorophyll", DeerlingType));

        List<ActualPokemon> ChallengerContents = new ArrayList<ActualPokemon>();
        ChallengerContents.add(new Pokemon("Diglett", "small", "brown", "Kanto", 10, 55, 25, 45, 35, 95, "Sand Veil", DiglettType));
        ChallengerContents.add(new Pokemon("Drowzee", "small", "yellow & brown", "Kanto", 60, 48,45, 90, 43, 42, "Insomnia", DrowzeeType));
        ChallengerContents.add(new Pokemon("Eevee", "small", "brown", "Kanto", 55, 55, 50, 65, 45, 55, "Adaptability", EeveeType));
        ChallengerContents.add(new Pokemon("Ekans", "small", "purple & yellow", "Kanto", 35, 60, 44, 54, 40, 55, "Shed Skin", EkansType));
        ChallengerContents.add(new Pokemon("Fearow", "large", "brown", "Kanto", 65, 90, 65, 61, 61, 100, "Keen Eye", FearowType));
        ChallengerContents.add(new Pokemon("Tepig","small","orange and red", "Unova",65,63,45,45,45,45,"Blaze", TepigType));
        ChallengerContents.add(new Pokemon("Goldeen", "small", "white & orange", "Kanto", 45, 67, 60, 50, 35, 63, "Swift Swim", GoldeenType));
        ChallengerContents.add(new Pokemon("Illumise", "small", "blue, purple, & black", "Hoenn", 65, 47, 75, 85, 73, 85, "Tinted Lense", IllumiseType));
        ChallengerContents.add(new Pokemon("Kabuto", "small", "brown", "Kanto", 30, 80, 90, 45, 55, 55, "Battle Armor", KabutoType));
        ChallengerContents.add(new Pokemon("Lapras","large","blue", "Kanto",130,85,80,95,85,60,"Water Absorb", LaprasType));
        ChallengerContents.add(new Pokemon("Marill","small","blue and white", "Johto",70,20,50,50,20,40,"Thick Fat", MarillType));
        ChallengerContents.add(new Pokemon("Snorlax","large","white and blue", "Kanto",160,110,65,110,65,30,"Immunity", SnorlaxType));
        ChallengerContents.add(new Pokemon("Lunatone", "large", "tan", "Hoenn", 90, 55, 65, 85, 95, 70, "Levitate", LunatoneType));
        ChallengerContents.add(new Pokemon("Snivy","small","green", "Unova",45,45,55,55,45,63,"Overgrow", SnivyType));
        
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
                                System.out.println("You got it boss. Here's one, this is a " + ((Pokemon)randomPokemonItem).getName() + ". " 
                                + ((Pokemon)randomPokemonItem).getName() + " is " + ((Pokemon)randomPokemonItem).getColor() 
                                + ". They are usually " + ((Pokemon)randomPokemonItem).getAvgSize() + ". " 
                                + ((Pokemon)randomPokemonItem).getName() + " is a " 
                                //+ ((Pokemon)randomPokemonItem).getPokemonType() 
                                + " pokemon and can be found in the " + ((Pokemon)randomPokemonItem).getRegion() + " Region."
                                );
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
                            System.out.println("-- Your Pokemon --" + System.lineSeparator() 
                            + "Pokemon: " + ((Pokemon)randomTempPokemon).getName() + System.lineSeparator() 
                            + "HP: " + ((Pokemon)randomTempPokemon).getHp() + System.lineSeparator() 
                            + "Attack: " + ((Pokemon)randomTempPokemon).getAttack() + System.lineSeparator() 
                            + "Defense: " + ((Pokemon)randomTempPokemon).getDefense() + System.lineSeparator() 
                            + "spDefense: " + ((Pokemon)randomTempPokemon).getSpDefense() + System.lineSeparator() 
                            + "spAttack: " + ((Pokemon)randomTempPokemon).getSpAttack() + System.lineSeparator() 
                            + "Speed: " + ((Pokemon)randomTempPokemon).getSpeed() + System.lineSeparator() 
                            + "Ability: " + ((Pokemon)randomTempPokemon).getAbility1() + System.lineSeparator() 
                            //+ "Type: " + ((Pokemon)randomTempPokemon).getPokemonType() + System.lineSeparator()
                            + "Type"
                            //+ "Effectiveness: " + ((Pokemon)randomTempPokemon).getTypeEffectiveness() + System.lineSeparator()
                            + "Effectivness"
                            //+ "Weakness: " + ((Pokemon)randomTempPokemon).getTypeWeakness()
                            + "Weakness"
                            );
                                //chooses random Pokemon from ChallengerPokedex
                            ActualPokemon randomActualPokemon = ChallengerContents.get(rd.nextInt(13)); 
                            
                                // { display table with challenger's pokemon stats }
                            System.out.println("-- Stranger's Pokemon --" + System.lineSeparator() 
                            + "Pokemon: " + ((Pokemon)randomActualPokemon).getName() + System.lineSeparator() 
                            + "HP: " + ((Pokemon)randomActualPokemon).getHp() + System.lineSeparator() 
                            + "Attack: " + ((Pokemon)randomActualPokemon).getAttack() + System.lineSeparator() 
                            + "Defense: " + ((Pokemon)randomActualPokemon).getDefense() + System.lineSeparator() 
                            + "spDefense: " + ((Pokemon)randomActualPokemon).getSpDefense() + System.lineSeparator() 
                            + "spAttack: " + ((Pokemon)randomActualPokemon).getSpAttack() + System.lineSeparator() 
                            + "Speed: " + ((Pokemon)randomActualPokemon).getSpeed() + System.lineSeparator() 
                            + "Ability: " + ((Pokemon)randomActualPokemon).getAbility1() + System.lineSeparator() 
                           // + "Type: " + ((Pokemon)randomActualPokemon).getPokemonType() + System.lineSeparator()
                            + "Type" 
                            //+ "Effectiveness: " + ((Pokemon)randomTempPokemon).getTypeEffectiveness() + System.lineSeparator()
                            + "Effectivness"
                            //+ "Weakness: " + ((Pokemon)randomTempPokemon).getTypeWeakness()
                            + "Weakness"
                            );
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
