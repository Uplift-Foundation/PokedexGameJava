package com.senecafoundation;

//import java.time.temporal.Temporal;
//import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.senecafoundation.DataHandler.FileDataWriter;

//import javax.swing.RowFilter.ComparisonType;

public class App 
{
    public static void main( String[] args )
    {
        FileDataWriter dataWriter = new FileDataWriter("./PokedexContents.csv");
        List<PokedexItem> PokedexContents = dataWriter.ReadAll();
        FileDataWriter dataWriter2 = new FileDataWriter("./ChallengerContents.csv");
        List<PokedexItem> ChallengerContents = dataWriter2.ReadAll();
        FileDataWriter dataWriter3 = new FileDataWriter("./TempPokemon.csv");
        List<PokedexItem> TempPokemon = dataWriter3.ReadAll();
        
        Scanner userScanner = new Scanner(System.in);
        System.out.println("It looks like you've found an object! Will you pick it up? (Yes or No)");
        String userResponse = userScanner.nextLine();
        if(userResponse.equals("Yes")) {
//pokedex 1
            Pokedex foundPokedex = new Pokedex(true);
            foundPokedex.setPokemonsAndStuff(PokedexContents);
            foundPokedex.setTempPokemon(TempPokemon);
            
//pokedex 2
            //ChallengerPokedex StrangerPokedex = new ChallengerPokedex(true); 
            //StrangerPokedex.setChallengerContents(ChallengerContents); 
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
                            PokedexItem randomPokemonItem = PokedexContents.get(rd.nextInt(PokedexContents.size())); 
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
                        while (userResponse.equals("Yes")) { 
                            PokemonWithSecondAbility randomTempPokemon = (PokemonWithSecondAbility) TempPokemon.get(rd.nextInt(TempPokemon.size())); 
                            PokemonWithSecondAbility randomActualPokemon = (PokemonWithSecondAbility) ChallengerContents.get(rd.nextInt(ChallengerContents.size()));
                           
                            Comparer ComparePokemon1And2 = new Comparer();
                            ComparePokemon1And2.comparePokemon(randomTempPokemon, randomActualPokemon);
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
