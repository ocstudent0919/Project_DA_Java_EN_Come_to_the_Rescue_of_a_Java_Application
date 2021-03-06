package com.hemebiotech.analytics;

/**
 * A trend analysis program aimed at describing the symptoms
 * as well as the number of their occurrences.
 */
public class AnalyticsCounter {
	/**
	 * Indicates the name of the input file
	 */
	public static final String FILE_NAME_IN = "symptoms.txt";
	/**
	 * Indicates the name of the output file
	 */
	public static final String FILE_NAME_OUT = "results.out";

	/**
	 * Reads data from a text file which is a list of symptoms (one symptom per line).
	 * Counts all occurrences of any symptom listed in the file.
	 * Generates a new text file named "results.out" which lists each symptom
	 * in alphabetical order, with the number of its occurrences in the file.
	 * @param args A string array containing the command line arguments,
	 *             it can be empty if no arguments were used
	 */
	public static void main(String[] args) {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(FILE_NAME_IN);
		SymptomCounterImpl counter = new SymptomCounterImpl(reader.getSymptoms());
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(FILE_NAME_OUT, counter.countSymptoms());
		writer.writeSymptoms();
	}
}