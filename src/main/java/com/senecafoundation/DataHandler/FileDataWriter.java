package com.senecafoundation.DataHandler;

import com.senecafoundation.PokedexItem;

public class FileDataWriter extends DataWriter {

    private String fileLocation;

    public FileDataWriter(String fileLocationFromUser) {
        super();
        this.fileLocation = fileLocationFromUser;
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation;
    }



    @Override
    public void Create(PokedexItem item) {
        // JSON psuedocode
        // Open file location
        // load proper json array from file (bear, plant, etc)
        // deseralize json array to java array of objects
        // add java object to java array of objects
        // reseralize java array of objects to json array
        // write json array back to file in correct location
        //
        // CSV pseudocode
        // Open file location
        // Serialize java object properties to CSV
        // Write CSV row to file
    }


	@Override
    public PokedexItem Read(String ID) {
        // JSON psuedocode
        // Open file location
        // load proper json array from file (bear, plant, etc)
        // deseralize json array to java array of objects
        // search java array of objects to find correct object with correct id
        // return that object
        //
        // CSV pseudocode
        // Open file location
        // Iterate through rows in file to find row with matching ID
        // Load text from that row into java object
        // return that object
        return null;
    }

    @Override
    public PokedexItem Update(PokedexItem itemToUpdate) {
        // Update an item in a file
        return null;
    }

    @Override
    public Boolean Delete(String ID) {
        // Delete an item from a file
        return null;
    }

}