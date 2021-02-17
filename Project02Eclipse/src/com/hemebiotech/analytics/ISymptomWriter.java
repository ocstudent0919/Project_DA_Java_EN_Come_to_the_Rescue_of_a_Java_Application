package com.hemebiotech.analytics;

/**
 * Provides a method to write symptom records with related number of occurrences to file.
 */
public interface ISymptomWriter {
	/**
	 * Writes a list of strings to a newly created or existed file.
	 * The content is not appended.
	 * If no data is available, a newly created file will be empty.
	 */
	void writeSymptoms();
}
