package com.hemebiotech.analytics;

import java.util.List;

/**
 * Provides a method that will read symptom data from a source.
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications.
 * The implementation does not need to order the list.
 */
public interface ISymptomReader {
	/**
	 * Reads data from a text file which is a list of symptoms.
	 * If no data is available, returns an empty List.
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	List<String> getSymptoms();
}
