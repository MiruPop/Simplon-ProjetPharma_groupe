package com.parapharma.analytics;

import java.util.*;

public interface ISymptomReader {
	
	/**
	 * A container that will read symptom data from a source
	 * and returns them as an ordered list of symptoms,
	 * linked with the number of times they occur in the document
	 * 
	 */
	 Map<String, Integer> counter = new TreeMap<>();
		/**
		 * If no data is available, return an empty List
		 * 
		 * @return an ordered Map (no symptom duplication),
		 * the Values serving as counters
		 */
}
