package com.senecafoundation.DataHandler;
import com.senecafoundation.Bear;
import com.senecafoundation.PokedexItem;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileDataWriter extends DataWriter {

    private String fileLocation;
    private File file;
    Scanner scanner;

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

}