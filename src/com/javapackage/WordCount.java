package com.javapackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args)throws IOException {
		FileReader f = new FileReader("D:/Java/test.txt");
		BufferedReader br= new BufferedReader(f);
		String line;
        int wordCount = 0;
        int characterCount = 0;
        int sentenceCount = 0;
  
        while ((line = br.readLine()) != null) {
            if (line.equals("")) {
        }
            else {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                wordCount += words.length;
                String sentence[] = line.split("[!?.:]+");
                sentenceCount += sentence.length;
            }
        }
        System.out.println("Total word count =" +wordCount);
        System.out.println("Total number of sentences =" +sentenceCount);
        System.out.println("Total number of characters =" +characterCount);

	}

}
