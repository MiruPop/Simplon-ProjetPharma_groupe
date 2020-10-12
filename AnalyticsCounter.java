package com.parapharma.analytics;

public class AnalyticsCounter {
    
	public static void main(String[] args) {
        
		ReadSymptomDataFromFile readSymp = new ReadSymptomDataFromFile("D:\\Miruna\\_Simplon\\Formation Simplon\\Pharma\\ProjectParaPharma_test\\symptoms.txt");
        readSymp.GetSymptoms();

        WriteSymptomDataFromFile writeSym = new WriteSymptomDataFromFile("D:\\Miruna\\_Simplon\\Formation Simplon\\Pharma\\ProjectParaPharma_test\\result.out");
        writeSym.WriteSymptoms();
    }

}
