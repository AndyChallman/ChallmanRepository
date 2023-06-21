package com.JRU.beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import com.JRU.beans.User;
import com.JRU.beans.Listing;

public class CreateFolder {
	//String userName = "B_Terry";
	//	User user = new User();
	//private final String userFolder = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + user.getUserName() + "\\" + user.getUserName() + "ListingApplications.txt" ;
	//private final String userFolder = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + userName ;
	//private final String userFile = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + userName + "\\" + userName + "ListingApplications.txt";

	public void createUserFolder(String userName) { 
final String userFolder = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + userName ;
		File folder = new File(userFolder);
		if(!(folder.exists())) {
		//File is an object, objects can be null. your files can be null
		boolean bool = folder.mkdir();  
	      if(bool){  
	         System.out.println("Folder is created successfully");  
	      }else{  
	         System.out.println("Error Found!");  
	      }  
		}else{  
	         System.out.println("Folder exists already!");  
	      }  
	}
	      
	      
	      /*
			
			 //check if file exists 
			if (file.exists()) {
			  System.out.println("The file is real.");} 
			else
			  {System.out.println("No idea what that is.");} 
			if (file.isDirectory())
			  {System.out.println("It's a directory!");} 
			else
			 {System.out.println("It's not a directory.");}
			 
			 //bufferedReader and File Reader read from the file //bufferedWriter and FileWriter write to the file
			  
			  //adding true tells java to append this which adds text rather than overwrite
			  // BufferedWriter creates the file if it doesnt exist, and overwrites it if it does 
			  // by default it overwrites, but if i set append to be true, then it doesnt 
			  //try(BufferedWriter bw = new BufferedWriter(newFileWriter(txtFile2))) 
			  //try(BufferedWriter bw = new BufferedWriter(newFileWriter(userName, true)))
			  
			  
			  
			  
			  
			  { //if the file does not exist this creates it and writes to it
			  
			  bw.write("My new text for my new file\n");
			  bw.write(" Some more text for good measure"); bw.newLine();
			  
			  bw.write(" ***************************  \n");
			  
			  
			  }
			  
			  catch(IOException ex) {ex.printStackTrace();}
			 */
	}//write brace	

