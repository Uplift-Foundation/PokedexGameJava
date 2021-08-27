package com.senecafoundation.DataHandler;
import com.senecafoundation.Bear;
import com.senecafoundation.Homework;
import com.senecafoundation.Plant;
import com.senecafoundation.PokedexItem;
import com.senecafoundation.PokemonWithSecondAbility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter extends DataWriter {

    private String fileLocation;
    private File file;
    private Scanner scanner;

    public FileDataWriter(String fileLocationFromUser) {
        this.fileLocation = fileLocationFromUser;
        try {
            this.file = new File(fileLocationFromUser);
            this.scanner = new Scanner(this.file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    @Override
    public void Create(PokedexItem item) {
        try {
            // See if it exists in the file already
            this.Read(item.getID());
        }
        catch (Exception e) { // We catch the custom error here (from line 60)
            if (e.getMessage() == "Item not found with that ID" || e instanceof FileNotFoundException) {
                // Was not found in the file - add it
                BufferedWriter bw;
                try {
                    bw = new BufferedWriter(new FileWriter(this.fileLocation, true));
                    bw.write(item.toString());
                    bw.newLine();
                    bw.flush();
                    bw.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }



	@Override
    public PokedexItem Read(String ID) throws Exception {
        //now read the file line by line...
        if (this.file != null) {
            this.scanner = new Scanner(this.file);
            while (this.scanner != null && this.scanner.hasNextLine()) {
                String line = this.scanner.nextLine();
                if(line.contains(ID)) { 
                    String[] props = line.split(",");
                    if (props[0].equals("Bear")) {
                        Bear bearToReturn = new Bear(props[2], props[3], Boolean.parseBoolean(props[4]), Integer.parseInt(props[5]), this);
                        bearToReturn.setID(props[1]);
                        return bearToReturn;
                    }
                }
            }
        }
        // We throw a custom error here if we can't find anything with that ID
        throw new Exception("Item not found with that ID");
    }

    

    @Override
    public PokedexItem Update(PokedexItem itemToUpdate) {
        try {
            this.Delete(itemToUpdate.getID());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.Create(itemToUpdate);
        return itemToUpdate;
    }

    @Override
    public Boolean Delete(String ID) throws Exception {
        //now read the file line by line...
        ArrayList<String> lines = new ArrayList<String>();
        if (this.file != null) {
            this.scanner = new Scanner(this.file);
            while (this.scanner != null && this.scanner.hasNextLine()) {
                String line = this.scanner.nextLine();
                if(!line.contains(ID)) { 
                    lines.add(line);
                }
            }
        }

        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter(this.fileLocation));
            lines.forEach(lineToWrite ->
                { 
                    try {
                        bw.write(lineToWrite);
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            );
            bw.flush();
            bw.close();
            return true;
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        // We throw a custom error here if we can't find anything with that ID
        throw new Exception("Item not found with that ID");
    }

    @Override
    public List<PokedexItem> ReadAll() {
        List<PokedexItem> pokedexItemstoReturn = new ArrayList<PokedexItem>();
        try {
            this.file = new File(fileLocation);
            this.scanner = new Scanner(this.file);
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (this.scanner != null && this.scanner.hasNextLine()) {

            String line = this.scanner.nextLine();

            String[] props = line.split(",");

            if(props[0].equals("PokemonWithSecondAbility")) {
                PokemonWithSecondAbility pokemonToAdd = new PokemonWithSecondAbility(
                    props[2], 
                    props[3], 
                    props[4], 
                    props[5], 
                    props[6], 
                    Integer.parseInt(props[7]), 
                    Integer.parseInt(props[8]), 
                    Integer.parseInt(props[9]), 
                    Integer.parseInt(props[10]), 
                    Integer.parseInt(props[11]), 
                    Integer.parseInt(props[12]), 
                    props[13], 
                    props[14], 
                    props[15], 
                    props[16], 
                    this
                );
                pokemonToAdd.setID(props[1]);       
                pokedexItemstoReturn.add(pokemonToAdd);
            }
            else if (props[0].equals("Bear")) {
                Bear bearToAdd = new Bear(
                    props[2],
                    props[3],
                    Boolean.parseBoolean(props[4]),
                    Integer.parseInt(props[5]),
                    this
                );
                bearToAdd.setID(props[1]);
                pokedexItemstoReturn.add(bearToAdd);
            }
            else if (props[0].equals("Plant")) {
                Plant plantToAdd = new Plant (
                    props [2],
                    props [3],
                    Boolean.parseBoolean(props[4]),
                    Boolean.parseBoolean(props[5]),
                    Boolean.parseBoolean(props[6]),
                    Boolean.parseBoolean(props[7]),
                    this
                );
                plantToAdd.setID(props[1]);
                pokedexItemstoReturn.add(plantToAdd);
            }
            else if (props[0].equals("Homework")) {
                Homework homeworkToAdd = new Homework (
                    props [2],
                    props [3], 
                    Integer.parseInt(props[4]),
                    Boolean.parseBoolean(props[5]),
                    new PokemonWithSecondAbility(
                        props[8], 
                        props[9], 
                        props[10], 
                        props[11], 
                        props[12], 
                        Integer.parseInt(props[13]), 
                        Integer.parseInt(props[14]), 
                        Integer.parseInt(props[15]), 
                        Integer.parseInt(props[16]), 
                        Integer.parseInt(props[17]), 
                        Integer.parseInt(props[18]), 
                        props[19], 
                        props[20], 
                        props[21], 
                        props[22], 
                        this
                    ),
                    this
                );
                homeworkToAdd.setID(props[1]);
                pokedexItemstoReturn.add(homeworkToAdd);
                
            }
        }
        return pokedexItemstoReturn;
    }

    @Override
    public List<PokemonWithSecondAbility> ReadAll2() {
        List<PokemonWithSecondAbility> pokedexItemstoReturn = new ArrayList<PokemonWithSecondAbility>();
        try {
            this.file = new File(fileLocation);
            this.scanner = new Scanner(this.file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (this.scanner != null && this.scanner.hasNextLine()) {

            String line = this.scanner.nextLine();

            String[] props = line.split(",");

            if(props[0].equals("PokemonWithSecondAbility")) {
                
                PokemonWithSecondAbility pokemonToAdd = new PokemonWithSecondAbility(
                    props[2],
                    props[3],
                    props[4],
                    props[5],
                    props[6],
                    Integer.parseInt(props[7]), 
                    Integer.parseInt(props[8]), 
                    Integer.parseInt(props[9]), 
                    Integer.parseInt(props[10]), 
                    Integer.parseInt(props[11]), 
                    Integer.parseInt(props[12]), 
                    props[13], 
                    props[14], 
                    props[15], 
                    props[16], 
                    this
                );
                pokemonToAdd.setID(props[1]);
                pokedexItemstoReturn.add(pokemonToAdd);
                
            }


        }
        return pokedexItemstoReturn;
    }

    @Override
    public List<PokemonWithSecondAbility> ReadAll3() {
        List<PokemonWithSecondAbility> pokedexItemstoReturn = new ArrayList<PokemonWithSecondAbility>();
        try {
            this.file = new File(fileLocation);
            this.scanner = new Scanner(this.file);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (this.scanner != null && this.scanner.hasNextLine()) {

            String line = this.scanner.nextLine();

            String[] props = line.split(",");

            if(props[0].equals("PokemonWithSecondAbility")) {
                
                PokemonWithSecondAbility pokemonToAdd = new PokemonWithSecondAbility(
                    props[2],
                    props[3],
                    props[4],
                    props[5],
                    props[6],
                    Integer.parseInt(props[7]), 
                    Integer.parseInt(props[8]), 
                    Integer.parseInt(props[9]), 
                    Integer.parseInt(props[10]), 
                    Integer.parseInt(props[11]), 
                    Integer.parseInt(props[12]), 
                    props[13], 
                    props[14], 
                    props[15], 
                    props[16], 
                    this
                );
                pokemonToAdd.setID(props[1]);
                pokedexItemstoReturn.add(pokemonToAdd);
                
            }


        }
        return pokedexItemstoReturn;
    }
    
    




}