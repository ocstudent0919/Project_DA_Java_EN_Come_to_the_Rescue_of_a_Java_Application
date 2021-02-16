package com.hemebiotech.analytics;

import java.util.*;

/**
 * Implementation of the {@link ISymptomCounter} interface
 */
public class SymptomCounterImpl implements ISymptomCounter {
    private final List<String> symptoms; //Unordered list of symptoms

    /**
     * Creates a SymptomCounterImpl using the specified list of symptoms to count
     *
     * @param symptoms An unordered list of symptoms
     */
    public SymptomCounterImpl(List<String> symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public List<String> countSymptoms() {
        Map<String, Integer> map = new HashMap<>();
        for (String symptom : symptoms) {
            Integer count = map.get(symptom);
/*          If the map doesn't contain the element,
            we put a new map entry (element, 1) to the map ;
            otherwise, we increment a counter by 1
            */
            map.put(symptom, (count == null) ? 1 : count + 1);
        }
//      A TreeMap allows the entries to be displayed in alphabetical order
        Map<String, Integer> treeMap = new TreeMap<>(map);
        return getRecords(treeMap);
    }

    /*
     * Creates a List of Strings to hold the values obtained by iterating map entries
     * and transforming each key-value pair to a String record
     * @param map A Map object, which contains all symptoms from the input list as keys
     *            and the count of each symptom as value.
     * @return A List of symptoms with related number of occurrences in the form of String records
     */
    private List<String> getRecords(Map<String, Integer> map) {
        List<String> records = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            records.add(entry.getKey() + " : " + entry.getValue());
        }
        return records;
    }
}
