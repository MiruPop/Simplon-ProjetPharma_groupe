package com.parapharma.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadSymptomDataFromFile implements ISymptomReader{

    private final String filepath;
    
	/**
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
    public ReadSymptomDataFromFile (String filepath) {
        this.filepath = filepath;
    }
    
    /**
     * specific method, to create a TreeMap
     */
    public void GetSymptoms() {
        if (filepath != null) {
            try {
                BufferedReader reader = new BufferedReader (new FileReader(filepath));
                String line;
                
                /**
                 * parsing the symptom list line by line
                 * Keys = symtoms, Values = number of occurence
                 **/
                while ((line = reader.readLine()) != null){
                    if(counter.containsKey(line)) {
                        counter.put(line, counter.get(line)+1);
                    }else {
                        counter.put(line, 1);
                    }

                }

                reader.close(); //prevent ressource leak
                } catch (IOException e) {
                	e.printStackTrace();
                	}
            }
        }
    }