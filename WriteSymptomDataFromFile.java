package com.parapharma.analytics;

import java.io.*;
import java.util.*;

public class WriteSymptomDataFromFile implements ISymptomReader{

    private final String filepath;

    public WriteSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    /**
     * internal method, applied to the TreeMap inherited from the interface
     */
    public void WriteSymptoms() {
        if (filepath != null) {
            try {
                File file = new File(filepath);
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));

                for(Map.Entry<String, Integer> entry: counter.entrySet()){
                	writer.write(entry.getKey() + " => " + entry.getValue());
                	writer.newLine();
                }
                writer.close();
                } catch (IOException e) {
                	System.out.println("An error occurred.");
                	e.printStackTrace();
                	}
            }
        }
    }
