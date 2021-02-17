package com.hemebiotech.analytics;

import java.util.List;
/**
 * Provides a method to calculate the count of every element (symptom) in a List.
 * The implementation needs to order the output list of Strings.
 */
public interface ISymptomCounter {
    /**
     * Calculates the number of occurrences for each symptom.
     * If no data is available, returns an empty List.
     * No duplicates are possible in the output list.
     * @return An ordered List of Strings; each String element includes
     *         the symptom name with related number of occurrences,
     *         for example, "nausea: 5"
     */
    List<String> countSymptoms();
}
