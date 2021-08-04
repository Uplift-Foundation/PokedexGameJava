//'package <Program>;' figure out how to do namespace conversion from C# to Java

public class PokedexProgram {
   
    static Void Main(String[]args)
    {
        List<PokedexItem> PokedexContents = new List<PokedexItem>();

        PokedexContents.Add(new Pokemon("Pidgey", "small and chubby", "brown", "flying & normal", "Kanto & Johto, ", 40, 45, 40, 35, 35, 56, "Keen Eye", "bug and grass","eletcric, ice, and rock"));
        PokedexContents.Add(new Pokemon("Ponyta", "small", "yellow", "fire", " Galar ",50,85,55,65,65,90,"Flash Fire","grass, ice, bug, steel and fairy","water, ground, and rock" ));
        PokedexContents.Add(new Pokemon("Charmander", "small", "orange", "fire", "Kanto", 39,52,43,50,60,62,"Blaze","Grass, Ice, Bug, Steel, Fairy","Water,Ground,Rock"));
        PokedexContents.Add(new Pokemon("Glameow", "small", "grey", "normal", "Sinnoh",49,55,42,37,42,85,"Own Tempo", "None","Fighting and Ghost" ));
        PokedexContents.Add(new Pokemon("Rufflet", "small", "white & dark blue", "flying & normal", "Unova",70,83,50,50,37,60,"Sheer Force"," Bug and Grass ", "Electric, Ice, and Rock"));
        PokedexContents.Add(new Pokemon("Onix", "humongous", "grey", "rock & ground", "Kanto",35,45,160,45,30,70,"Sturdy","Fire, Electric, Poison, Bug, Rock, Steel, Flying","Water, Grass, Fighting"));
        PokedexContents.Add(new Pokemon("Mantine", "humongous", "blue & white", "water & flying", "Alola",85,40,70,140,80,70,"Swift Swim","Fire,Ground,Fighting,Rock,Bug,Grass","Electric"));
        PokedexContents.Add(new Plant("green", "fresh", true, true, true, true));
        PokedexContents.Add(new Bear("brown", "circle", 200, true));
        PokedexContents.Add(new Homework("white","circle" ,20, true));
        PokedexContents.Add(new Pokemon("Squritle", "small", "blue", "water", "Kanto", 44, 48, 65, 64, 50, 43, "Torrent", "ground, rock, & dragon", "water, grass, & dragon"));
        PokedexContents.Add(new Pokemon("Arbok", "large", "purple", "poison", "Kanto", 60, 95, 69, 79, 65, 80, "Intimidate", "grass & fairy", "poison, ground, rock, ghost, & steel"));
        PokedexContents.Add(new Pokemon("Deerling", "small", "pink & white with yellow accents", "normal & grass", "Unova", 60, 60, 50, 50, 40, 74, "Chlorophyll", "ground, rock, & water", "rock, ghost, steel, flying, poison, bug, fire, grass, & dragon"));
    }

    Console.WriteLine("You found an object. Will you pick it ")
    
}