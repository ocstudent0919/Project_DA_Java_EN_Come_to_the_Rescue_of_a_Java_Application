package com.hemebiotech.analytics;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Implementation of writeSymptoms() method
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter{

	private String filepath;
	private List<String> contents;
	
	/**
	 * 
	 * @param filepathOut 
	 * 					a full or partial path to output file
	 * @param contents 
	 * 					a list of symptoms with related number of occurrences to print
	 */
	public WriteSymptomDataToFile(String filepathOut, List<String> contents) {
		this.filepath = filepathOut;
		this.contents = contents;
	}

	@Override
	public void writeSymptoms() {
		Path path;
		if (filepath != null && !filepath.isEmpty()) {
			try {
				path = Paths.get(filepath);
				Files.write(path, contents, StandardCharsets.UTF_8);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}





}
