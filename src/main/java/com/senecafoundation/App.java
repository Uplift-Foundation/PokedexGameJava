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
//      - Skills list -
        List<String> NormalSkills = new ArrayList<String>();
        NormalSkills.add("normal skill");

        // List<PokemonType> PonytaType = new ArrayList<PokemonType>();

        // List<PokemonType> CharmanderType = new ArrayList<PokemonType>();

        // List<PokemonType> GlameowType = new ArrayList<PokemonType>();

        // List<PokemonType> RuffletType = new ArrayList<PokemonType>();

        // List<PokemonType> OnixType = new ArrayList<PokemonType>();
        
        // List<PokemonType> MantineType = new ArrayList<PokemonType>();
        
        // List<PokemonType> SquirtleType = new ArrayList<PokemonType>();
        
        // List<PokemonType> ArbokType = new ArrayList<PokemonType>();

        // List<PokemonType> DeerlingType = new ArrayList<PokemonType>();

        // List<PokemonType> DiglettType = new ArrayList<PokemonType>();
        
        // List<PokemonType> DrowzeeType = new ArrayList<PokemonType>();

        // List<PokemonType> EeveeType = new ArrayList<PokemonType>();

        // List<PokemonType> EkansType = new ArrayList<PokemonType>();
        
        // List<PokemonType> FearowType = new ArrayList<PokemonType>();

        // List<PokemonType> TepigType = new ArrayList<PokemonType>();
        
        // List<PokemonType> GoldeenType = new ArrayList<PokemonType>();
        
        // List<PokemonType> IllumiseType = new ArrayList<PokemonType>();
    
        // List<PokemonType> KabutoType = new ArrayList<PokemonType>();

        // List<PokemonType> LaprasType = new ArrayList<PokemonType>();
        
        // List<PokemonType> MarillType = new ArrayList<PokemonType>();
        
        // List<PokemonType> SnorlaxType = new ArrayList<PokemonType>();

        // List<PokemonType> LunatoneType = new ArrayList<PokemonType>();
        
        // List<PokemonType> SnivyType = new ArrayList<PokemonType>();
//     - Lists for pokemon types -
        PokemonType normalType = new PokemonType();
        normalType.setName("normal");
        normalType.setWeakness("rock, ghost, steel");
        normalType.setEffectiveness("none");
        normalType.setAbilities(NormalAbilities);
        
        PokemonType fireType = new PokemonType();
        fireType.setName("fire");
        fireType.setWeakness("Rock, Fire, Water, Dragon");
        fireType.setEffectiveness("Bug, Steel, Grass, Ice");
        fireType.setAbilities(FireAbilities);
        
        PokemonType waterType = new PokemonType();
        waterType.setName("water");
        waterType.setWeakness("Water, Grass, Dragon");
        waterType.setEffectiveness("Ground, Rock, Fire");
        waterType.setAbilities(WaterAbilities);
        
        // PokemonType electricType = new PokemonType();
        // electricType.setName("electric");
        // electricType.setWeakness("Ground, Grass, Electric, Dragon");
        // electricType.setEffectiveness("Flying, Water");
        // electricType.setAbilities(ElectricAbilities);
        // //pokemon.add(type)

        PokemonType grassType = new PokemonType();
        grassType.setName("grass");
        grassType.setWeakness("Flying, Poison, Bug, Steel, Fire, Grass, Dragon");
        grassType.setEffectiveness("Ground, Rock, Water");
        grassType.setAbilities(GrassAbilities);
    
        PokemonType iceType = new PokemonType();
        iceType.setName("ice");
        iceType.setWeakness("Steel, Fire, Water, Ice");
        iceType.setEffectiveness("Flying, Ground, Grass, Dragon");
        iceType.setAbilities(IceAbilities);

        PokemonType fightingType = new PokemonType();
        fightingType.setName("fighting");
        fightingType.setWeakness("Flying, Poison, Psychic, Bug, Ghost, Fairy");
        fightingType.setEffectiveness("Normal, Rock, Steel, Ice, Dark");
        fightingType.setAbilities(FightingAbilities);
        
        PokemonType poisonType = new PokemonType();
        poisonType.setName("poison");
        poisonType.setWeakness("Poison, Ground, Rock, Ghost, Steel");
        poisonType.setEffectiveness("Grass, Fairy");
        poisonType.setAbilities(PoisonAbilities);
        
        PokemonType groundType = new PokemonType();
        groundType.setName("ground");
        groundType.setWeakness("Flying, Bug, Grass");
        groundType.setEffectiveness("Poison, Rock, Steel, Fire, Electric");
        groundType.setAbilities(GroundAbilities);

        PokemonType flyingType = new PokemonType();
        flyingType.setName("flying");
        flyingType.setWeakness("rock, steel, electric");
        flyingType.setEffectiveness("fighting, bug, grass");
        flyingType.setAbilities(FlyingAbilities);
        
        PokemonType psychicType = new PokemonType();
        psychicType.setName("psychic");
        psychicType.setWeakness("Steel, Psychic, Dark");
        psychicType.setEffectiveness("Fighting, Poison");
        psychicType.setAbilities(PsychicAbilities);
        
        PokemonType bugType = new PokemonType();
        psychicType.setName("bug");
        psychicType.setWeakness("Fighting, Flying, Poison, Ghost, Steel, Fire, Fairy");
        psychicType.setEffectiveness("Grass, Psychic, Dark");
        psychicType.setAbilities(BugAbilities);

        PokemonType rockType = new PokemonType();
        psychicType.setName("rock");
        psychicType.setWeakness("Fighting, Ground, Steel");
        psychicType.setEffectiveness("Flying, Bug, Fire, Ice");
        psychicType.setAbilities(RockAbilities);

        // PokemonType ghostType = new PokemonType();
        // psychicType.setName("ghost");
        // psychicType.setWeakness("Normal, Dark");
        // psychicType.setEffectiveness("Ghost, Pshycic");
        // psychicType.setAbilities(GhostAbilities);

        // PokemonType dragonType = new PokemonType();
        // psychicType.setName("Dragon");
        // psychicType.setWeakness("Dragon, Steel, Fairy");
        // psychicType.setEffectiveness("Dragon");
        // psychicType.setAbilities(DragonAbilities);

        // PokemonType darkType = new PokemonType();
        // psychicType.setName("dark");
        // psychicType.setWeakness("Fighting, Dark, Fairy");
        // psychicType.setEffectiveness("Ghost, Psychic");
        // psychicType.setAbilities(DarkAbilities);

        // PokemonType steelType = new PokemonType();
        // psychicType.setName("steel");
        // psychicType.setWeakness("Steel, Fire, Water?, Eletric");
        // psychicType.setEffectiveness("Rock, Ice, Fairy, Not Steel Even Though It's weak to Steel"); //change this
        // psychicType.setAbilities(SteelAbilities);

        PokemonType fairyType = new PokemonType();
        psychicType.setName("fairy");
        psychicType.setWeakness("Poison, Steel, Fire");
        psychicType.setEffectiveness("Fighting, Dragon, Dark");
        psychicType.setAbilities(FairyAbilities);

        Pokemon Pidgey = new Pokemon("Pidgey", "small and chubby", "brown", "flying & normal", 40, 45, 40, 35, 35, 56, "Keen Eye"); 
        Pidgey.types.add(normalType);
        Pidgey.types.add(flyingType);
        //.add normalSkills
        //.add flyingSkills

        Pokemon Ponyta = new Pokemon("Ponyta", "small", "yellow", "fire",50,85,55,65,65,90,"Flash Fire");
        Ponyta.types.add(fireType);

        Pokemon Charmander = new Pokemon("Charmander", "small", "orange", "Kanto", 39,52,43,50,60,62,"Blaze");
        Charmander.types.add(fireType);

        Pokemon Glameow = new Pokemon("Glameow", "small", "grey", "Sinnoh",49,55,42,37,42,85,"Own Tempo");
        Glameow.types.add(normalType);

        Pokemon Rufflet = new Pokemon("Rufflet", "small", "white & dark blue", "Unova",70,83,50,50,37,60,"Sheer Force");
        Rufflet.types.add(normalType);
        Rufflet.types.add(flyingType);

        Pokemon Onix = new Pokemon("Onix", "humongous", "grey", "Kanto",35,45,160,45,30,70,"Sturdy");
        Onix.types.add(rockType);
        Onix.types.add(groundType);

        Pokemon Mantine = new Pokemon("Mantine", "humongous", "blue & white", "Alola",85,40,70,140,80,70,"Swift Swim");
        Mantine.types.add(waterType);
        Mantine.types.add(flyingType);

        Pokemon Squritle = new Pokemon("Squritle", "small", "blue", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent");
        Mantine.types.add(waterType);

        Pokemon Arbok = new Pokemon("Arbok", "large", "purple", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate");
        Mantine.types.add(poisonType);

        Pokemon Deerling = new Pokemon("Deerling", "small", "pink & white with yellow accents", "Unova", 60, 60, 50, 50, 40, 74,"Chlorophyll");
        Mantine.types.add(normalType);
        Mantine.types.add(grassType);

       Pokemon Diglett = new Pokemon("Diglett", "small", "brown", "Kanto", 10, 55, 25, 45, 35, 95, "Sand Veil");
       Diglett.types.add(groundType);
        
       Pokemon Drowzee = new Pokemon("Drowzee", "small", "yellow & brown", "Kanto", 60, 48,45, 90, 43, 42, "Insomnia");
       Drowzee.types.add(psychicType);

       Pokemon Eevee = new Pokemon("Eevee", "small", "brown", "Kanto", 55, 55, 50, 65, 45, 55, "Adaptability");
       Eevee.types.add(normalType);

       Pokemon Ekans = new Pokemon("Ekans", "small", "purple & yellow", "Kanto", 35, 60, 44, 54, 40, 55, "Shed Skin");
       Ekans.types.add(poisonType);

       Pokemon Fearow = new Pokemon("Fearow", "large", "brown", "Kanto", 65, 90, 65, 61, 61, 100, "Keen Eye");
       Fearow.types.add(normalType);
       Fearow.types.add(flyingType);

       Pokemon Tepig = new Pokemon("Tepig","small","orange and red", "Unova",65,63,45,45,45,45,"Blaze");
       Tepig.types.add(fireType);

       Pokemon Goldeen = new Pokemon("Goldeen", "small", "white & orange", "Kanto", 45, 67, 60, 50, 35, 63, "Swift Swim");
       Goldeen.types.add(waterType);

       Pokemon Illumise = new Pokemon("Illumise", "small", "blue, purple, & black", "Hoenn", 65, 47, 75, 85, 73, 85, "Tinted Lense");
       Illumise.types.add(bugType);

       Pokemon Kabuto = new Pokemon("Kabuto", "small", "brown", "Kanto", 30, 80, 90, 45, 55, 55, "Battle Armor");
       Kabuto.types.add(waterType);
       Kabuto.types.add(rockType);

       Pokemon Lapras = new Pokemon("Lapras","large","blue", "Kanto",130,85,80,95,85,60,"Water Absorb");
       Lapras.types.add(waterType);
       Lapras.types.add(iceType);

       Pokemon Marill = new Pokemon("Marill","small","blue and white", "Johto",70,20,50,50,20,40,"Thick Fat");
       Marill.types.add(waterType);
       Marill.types.add(fairyType);

       Pokemon Snorlax = new Pokemon("Snorlax","large","white and blue", "Kanto",160,110,65,110,65,30,"Immunity");
       Snorlax.types.add(normalType);

       Pokemon Lunatone = new Pokemon("Lunatone", "large", "tan", "Hoenn", 90, 55, 65, 85, 95, 70, "Levitate");
       Lunatone.types.add(psychicType);
       Lunatone.types.add(rockType);

       Pokemon Snivy = new Pokemon("Snivy","small","green", "Unova",45,45,55,55,45,63,"Overgrow");
       Snivy.types.add(grassType);

//      - Lists of Pokemon -
        List<PokedexItem> PokedexContents = new ArrayList<PokedexItem>();
        PokedexContents.add(Pidgey);
        PokedexContents.add(Charmander);
        PokedexContents.add(Glameow);
        PokedexContents.add(Rufflet);
        PokedexContents.add(Onix);
        PokedexContents.add(Mantine);
        PokedexContents.add(Squritle);
        PokedexContents.add(Arbok);
        PokedexContents.add(Deerling);
        PokedexContents.add(new Plant("green","short", "fresh", true, true, true, true));
        PokedexContents.add(new Bear("brown", "circle", true, 200)); 
        PokedexContents.add(new Homework("white","circle" ,20, true));

        List<ActualPokemon> TempPokemon = new ArrayList<ActualPokemon>();
        TempPokemon.add(Pidgey);
        TempPokemon.add(Charmander);
        TempPokemon.add(Glameow);
        TempPokemon.add(Rufflet);
        TempPokemon.add(Onix);
        TempPokemon.add(Mantine);
        TempPokemon.add(Squritle);
        TempPokemon.add(Arbok);
        TempPokemon.add(Deerling);

        List<ActualPokemon> ChallengerContents = new ArrayList<ActualPokemon>();
        ChallengerContents.add(Diglett);
        ChallengerContents.add(Drowzee);
        ChallengerContents.add(Eevee);
        ChallengerContents.add(Ekans);
        ChallengerContents.add(Fearow);
        ChallengerContents.add(Tepig);
        ChallengerContents.add(Goldeen);
        ChallengerContents.add(Illumise);
        ChallengerContents.add(Kabuto);
        ChallengerContents.add(Lapras);
        ChallengerContents.add(Marill);
        ChallengerContents.add(Snorlax);
        ChallengerContents.add(Lunatone);
        ChallengerContents.add(Snivy);
        
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
                        //    for(PokemonType type : ((Pokemon)randomTempPokemon.types)
                        //     {
                        //         type.displayPokemonType();
                        //     }
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