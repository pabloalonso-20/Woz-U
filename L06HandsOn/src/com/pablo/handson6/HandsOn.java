package com.pablo.handson6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandsOn {

	public static void main(String[] args) {
		

		//array
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		
		
		//String builder
		StringBuilder sb = new StringBuilder();
		
		
		//loop through strings in songs array
		for(int i=0; i<songs.length;i++) {
			//concatenate song names with comma between them
			sb.append(songs[i]);
			sb.append(", ");
		}
		
		File file = new File ("songs.txt");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
			writer.write(sb.toString());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println(sb);
		}

	}

}
