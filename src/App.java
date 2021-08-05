import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!"); 
        //PokedexItem meow = new PokedexItem("red");
        //System.out.println(meow.getColor());
        //Console.WriteLine = System.out.println
        //Ask Warren how to convert Console.ReadLine() to Java
        //Ask Warren if importing List by right clicking List will fix the problem and why. 
        //Imported java List and ArrayList. What does this do? 
            List<PokedexItem> PokedexContents = new ArrayList<PokedexItem>();
            //to fix list we have to add in ability 2. 
            PokedexContents.add(new Pokemon("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto, ", 40, 45, 40, 35, 35, 56, "Keen Eye","SomeOtherAbility", "bug and grass","eletcric, ice, and rock"));
            PokedexContents.add(new Pokemon("Ponyta", "small", "yellow", "fire", " Galar ",50,85,55,65,65,90,"Flash Fire","Something cooler than this","grass, ice, bug, steel and fairy","water, ground, and rock" ));
            PokedexContents.add(new Pokemon("Charmander", "small", "orange", "fire", "Kanto", 39,52,43,50,60,62,"Blaze","SomeAbility2","Grass, Ice, Bug, Steel, Fairy","Water,Ground,Rock"));
            PokedexContents.add(new Pokemon("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo", "Ability2" ,"None","Fighting and Ghost" ));
            PokedexContents.add(new Pokemon("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force","Ability2"," Bug and Grass ", "Electric, Ice, and Rock"));
            PokedexContents.add(new Pokemon("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Ability2","Fire, Electric, Poison, Bug, Rock, Steel, Flying","Water, Grass, Fighting"));
            PokedexContents.add(new Pokemon("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Ability2","Fire,Ground,Fighting,Rock,Bug,Grass","Electric"));
            PokedexContents.add(new Plant("green","short", "fresh", true, true, true, true));
            PokedexContents.add(new Bear("brown", "circle", 200, true)); //swap 200 and true. Did we write this the same way as C#???? Some of the Strings/Booleans/Integers might not be in the right place. 
            PokedexContents.Add(new Homework("white","circle" ,20, true));
            PokedexContents.add(new Pokemon("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent", "ground, rock, & dragon", "water, grass, & dragon"));
            PokedexContents.add(new Pokemon("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate", "grass & fairy", "poison, ground, rock, ghost, & steel"));
            PokedexContents.add(new Pokemon("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74, "Chlorophyll", "ground, rock, & water", "rock, ghost, steel, flying, poison, bug, fire, grass, & dragon")); //stop

            List<ActualPokemon> TempPokemon = new ArrayList<ActualPokemon>();
            TempPokemon.add(new Pokemon("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto, ", 40, 45, 40, 35, 35, 56, "Keen Eye", "bug and grass","eletcric, ice, and rock"));
            TempPokemon.add(new Pokemon("Ponyta", "small", "yellow", "fire", " Galar ",50,85,55,65,65,90,"Flash Fire","grass, ice, bug, steel and fairy","water, ground, and rock" ));
            TempPokemon.add(new Pokemon("Charmander", "small", "orange", "fire", "Kanto", 39,52,43,50,60,62,"Blaze","Grass, Ice, Bug, Steel, Fairy","Water,Ground,Rock"));
            TempPokemon.add(new Pokemon("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo", "None","Fighting and Ghost" ));
            TempPokemon.add(new Pokemon("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force"," Bug and Grass ", "Electric, Ice, and Rock"));
            TempPokemon.add(new Pokemon("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Fire, Electric, Poison, Bug, Rock, Steel, Flying","Water, Grass, Fighting"));
            TempPokemon.add(new Pokemon("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Fire,Ground,Fighting,Rock,Bug,Grass","Electric"));
            TempPokemon.add(new Pokemon("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent", "ground, rock, & dragon", "water, grass, & dragon"));
            TempPokemon.add(new Pokemon("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate", "grass & fairy", "poison, ground, rock, ghost, & steel"));
            TempPokemon.add(new Pokemon("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74, "Chlorophyll", "ground, rock, & water", "rock, ghost, steel, flying, poison, bug, fire, grass, & dragon"));

            List<ActualPokemon> ChallengerContents = new ArrayList<ActualPokemon>();
            ChallengerContents.add(new Pokemon ("Diglett", "small", "brown", "ground", "Kanto", 10, 55, 25, 45, 35, 95, "Sand Veil", "poison, rock, steel ,fire, & electric", "flying, bug, & grass"));
            ChallengerContents.add(new Pokemon ("Drowzee", "small", "yellow & brown", "psychic", "Kanto", 60, 48,45, 90, 43, 42, "Insomnia", "fighting & poison", "steel, psychic, & dark"));
            ChallengerContents.add(new Pokemon ("Eevee", "small", "brown", "normal", "Kanto", 55, 55, 50, 65, 45, 55, "Adaptability", "none", "rock, ghost, & steel"));
            ChallengerContents.add(new Pokemon ("Ekans", "small", "purple & yellow", "poison", "Kanto", 35, 60, 44, 54, 40, 55, "Shed Skin", "grass & fairy", "poison, ground, rock, steel, & ghost"));
            ChallengerContents.add(new Pokemon ("Fearow", "large", "brown", "normal & flying", "Kanto", 65, 90, 65, 61, 61, 100, "Keen Eye", "fighting, bug, & grass", "rock, steel , & electric"));
            ChallengerContents.add(new Pokemon ("Tepig","small","orange and red","fire","Unova",65,63,45,45,45,45,"Blaze","Grass, Steel, Bug, and Ice","Ground, Rock, and Water"));
            ChallengerContents.add(new Pokemon ("Toldeen", "small", "white & orange", "water", "Kanto", 45, 67, 60, 50, 35, 63, "Swift Swim", "ground, rock, & fire", "water, grass, & dragon"));
            ChallengerContents.add(new Pokemon ("Illumise", "small", "blue, purple, & black", "bug", "Hoenn", 65, 47, 75, 85, 73, 85, "Tinted Lense", "grass, psychic, & dark", "fighting, flying, poison, ghost, steel, fire, & fairy"));
            ChallengerContents.add(new Pokemon ("Kabuto", "small", "brown", "rock & water", "Kanto", 30, 80, 90, 45, 55, 55, "Battle Armor", "flying, bug, fire, ice, & ground", "fighting, ground, steel, water, grass, & dragon"));
            ChallengerContents.add(new Pokemon ("Lapras","large","blue","water and ice","Kanto",130,85,80,95,85,60,"Water Absorb","ground, dragon, flying, rock","steel and rock"));
            ChallengerContents.add(new Pokemon ("Marill","small","blue and white","water and fairy","Johto",70,20,50,50,20,40,"Thick Fat","fire,rock,ground,fighting,dark,dragon","electric, grass, poison"));
            ChallengerContents.add(new Pokemon ("Snorlax","large","white and blue","normal","Kanto",160,110,65,110,65,30,"Immunity","None","fighting"));
            ChallengerContents.add(new Pokemon ("Lunatone", "large", "tan", "rock & psychic", "Hoenn", 90, 55, 65, 85, 95, 70, "Levitate", "flying, bug, fire, ice, fighting, & poison", "fighting, ground, steel, psychic, & dark"));
            ChallengerContents.add(new Pokemon ("Snivy","small","green","grass","Unova",45,45,55,55,45,63,"Overgrow","Ground,Rock, and Water","Bug,Fire,Flying,Ice, Poison"));
            //add pokemon
          

            System.out.println("It looks like you've found an object! Will you pick it up? (Yes or No)");
            String userResponse = System.out.ReadLine(); //ask how to fix this line. Why is userResponse not highlighted blue like this line? 
            if(userResponse == "Yes") {
//pokedex 1
                Pokedex foundPokedex = new Pokedex(true);
                foundPokedex.PokemonsAndStuff = PokedexContents;
                foundPokedex.TempPokemon = TempPokemon;
//pokedex 2
                ChallengerPokedex StrangerPokedex = new ChallengerPokedex(true);
                StrangerPokedex.Pokemons = ChallengerContents;

                Random rd = new Random();

                System.out.println("You might have found a pokedex...what shape is it?");
                userResponse = System.out.ReadLine(); 
                if (userResponse == Pokedex.Shape) {
                    System.out.println("Oh, that sounds like it might be a Pokedex...what color is it?");
                    userResponse = Console.ReadLine(); 
                    if (userResponse == Pokedex.Color) {
                        System.out.println("Wow you found a pokedex! Would you like to hear about some pokemon?");
                        userResponse = Console.ReadLine();
                        //do {
                        if(userResponse == "Yes") {
                            while (userResponse == "Yes") {
                                var randomPokemonItem = foundPokedex.PokemonsAndStuff[rd.Next(0,13)]; //find random pokedexItem
                                if (randomPokemonItem is Plant) {
                                    System.out.println(((Plant)randomPokemonItem).Grows());
                                }
                                else if (randomPokemonItem is Bear) {
                                    System.out.println(((Bear)randomPokemonItem).roll());
                                }
                                else if (randomPokemonItem is Homework) {
                                    System.out.println(((Homework)randomPokemonItem).getsCrumbled());
                                }
                                else if (randomPokemonItem is Pokemon) {
                                    System.out.println("You got it boss. Here's one, this is a " + ((Pokemon)randomPokemonItem).Name + ". " + ((Pokemon)randomPokemonItem).Name + " is " + ((Pokemon)randomPokemonItem).Color + ". They are usually " + ((Pokemon)randomPokemonItem).AvgSize + ". " + ((Pokemon)randomPokemonItem).Name + " is a " + ((Pokemon)randomPokemonItem).PokemonType + " type pokemon and can be found in the " + ((Pokemon)randomPokemonItem).Region + " Region.");
                                }
                                System.out.println("Would you like to hear about another pokemon?");
                                userResponse = Console.ReadLine();
                            }
                        }
                        else {
                            System.out.println("Aw, okay. Maybe another time.");
                        }
                        //} while (userResponse == "Yes");
                        //Console.WriteLine("Aw okay. Maybe another time then.");

                        //A stranger approaches
            System.out.println("...A stranger approaches, they ask if you would like to compare pokemon. Would you like to? (Yes or No)");
            userResponse = Console.ReadLine();
            if (userResponse == "Yes") {

                while (userResponse == "Yes") {
                    var randomTempPokemon = foundPokedex.TempPokemon[rd.Next(0,9)];

                    // { display table with player's pokemon stats }
                System.out.println("-- Your Pokemon --" + Environment.NewLine + "Pokemon: " + ((Pokemon)randomTempPokemon).Name + Environment.NewLine + "HP: " + ((Pokemon)randomTempPokemon).Hp + Environment.NewLine + "Attack: " + ((Pokemon)randomTempPokemon).Attack + Environment.NewLine + "Defense: " + ((Pokemon)randomTempPokemon).Defense + Environment.NewLine + "spDefense: " + ((Pokemon)randomTempPokemon).SpDefense + Environment.NewLine + "spAttack: " + ((Pokemon)randomTempPokemon).SpAttack + Environment.NewLine + "Speed: " + ((Pokemon)randomTempPokemon).Speed + Environment.NewLine + "Ability: " + ((Pokemon)randomTempPokemon).Ability + Environment.NewLine + "Type: " + ((Pokemon)randomTempPokemon).PokemonType + Environment.NewLine + "Effectiveness: " + ((Pokemon)randomTempPokemon).TypeEffectiveness + Environment.NewLine + "Weakness: " + ((Pokemon)randomTempPokemon).TypeWeekness);
                    //does the above line have to be indented? 
                    var randomActualPokemon = StrangerPokedex.Pokemons[rd.Next(0,13)];
                
                    // { display table with challenger's pokemon stats }
                System.out.println("-- Stranger's Pokemon --" + Environment.NewLine + "Pokemon: " + ((Pokemon)randomActualPokemon).Name + Environment.NewLine + "HP: " + ((Pokemon)randomActualPokemon).Hp + Environment.NewLine + "Attack: " + ((Pokemon)randomActualPokemon).Attack + Environment.NewLine + "Defense: " + ((Pokemon)randomActualPokemon).Defense + Environment.NewLine + "spDefense: " + ((Pokemon)randomActualPokemon).SpDefense + Environment.NewLine + "spAttack: " + ((Pokemon)randomActualPokemon).SpAttack + Environment.NewLine + "Speed: " + ((Pokemon)randomActualPokemon).Speed + Environment.NewLine + "Ability: " + ((Pokemon)randomActualPokemon).Ability + Environment.NewLine + "Type: " + ((Pokemon)randomActualPokemon).PokemonType + Environment.NewLine + "Effectiveness: " + ((Pokemon)randomActualPokemon).TypeEffectiveness + Environment.NewLine + "Weakness: " + ((Pokemon)randomActualPokemon).TypeWeekness);

                System.out.println("Would you like to compare another pokemon?");
                userResponse = Console.ReadLine();
                    }
                    System.out.println("The stranger wishes you a good day and walks off.");
            }
            else {System.out.println("The stranger looks disappointed, but they wish you a good day and walk off"); //The stranger wishes you a good day and walks off.
            }
                        //
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

        



        
    }
}
