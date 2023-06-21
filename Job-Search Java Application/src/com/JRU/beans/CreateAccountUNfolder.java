package com.JRU.beans;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class CreateAccountUNfolder {
	
	static Random rnd = new Random();
	static int number = rnd.nextInt(999999);
	public static  String userId = String.format("%06d", number);

	
	public void accountBuildUN(Scanner jru) throws IOException  {
		
		Map<String, String> map = new LinkedHashMap<String, String>();
		
        System.out.println("We will now create your account!");

		System.out.println("Please enter desired Username: " );
		String userName = jru.next();
		map.put("Username", userName);

		CreateFolder folder = new CreateFolder();
		folder.createUserFolder(userName);
		
		System.out.println("Please enter desired Password: ");
		String password = jru.next();
		map.put("Password", password);
		
		System.out.println("Your unique userId number is: " + userId);
		map.put("userId", userId);

		System.out.println("Please enter your name: ");
		String name = jru.next() ;//+ " " + jru.next();
		map.put("Name", name);

		System.out.println("Please enter email: ");
		String email = jru.next();
		map.put("Email", email);

		System.out.println("Please enter Phonenumber: ");
		String phone = jru.next();
		map.put("Phonenumber", phone);
		
		System.out.println(map);
		saveUserAccountToFile(map,userName);
		
		
		try {
			File f = new File("Users.csv");
			if (!f.exists()) {
				
				FileWriter writer = new FileWriter("Users.csv", true);
				
				writer.write("Username,");
				writer.write("Password,");
				writer.write("userid,");
				writer.write("Name,");
				writer.write("Email,");
				writer.write("Phonenumber\n");
					
				writer.close();
			}
			BufferedReader br = new BufferedReader(new FileReader("Users.csv"));
			if (br.readLine() == null) {
				FileWriter writer = new FileWriter("Users.csv", true);
				
				writer.write("Username,");
				writer.write("Password,");
				writer.write("userId,");
				writer.write("Name,");
				writer.write("Email,");
				writer.write("Phonenumber\n");
					
				writer.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileWriter writer = new FileWriter("Users.csv", true);
		
		writer.write(map.get("Username") + "," );
		writer.write(map.get("Password") + "," );
		writer.write(map.get("userId") + "," );
		writer.write(map.get("Name") + "," );
		writer.write(map.get("Email") + "," );
		writer.write(map.get("Phonenumber") + "\n" );
			
		writer.close();
		
		AppMechanics.mainMenu(jru);
			
	
	}
	
	public void saveUserAccountToFile(Map<String, String> map, String userName) {
		userName ="C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + userName +"\\" + userName + "AccountInfo.txt";

		File file = new File(userName);

		// check if file exists
		if (file.exists()) {
			System.out.println("The file is real.");
		} else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(userName, true))) {// if the file does not exist
																							// this creates it and
																							// writes to it
				bw.write(" User Account Information : \n" + map);
				bw.write(" \n ***************************  \n");

			}

			catch (IOException ex) {
				ex.printStackTrace();
			}

		}
		if (file.isDirectory()) {
			System.out.println("It's a directory!");
		} else {
			System.out.println("It's not a directory.");
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(userName, true))) {// if the file does not exist this
																						// creates it and writes to it
			bw.write(" Chosen Listing : \n" + map);
			bw.write(" \n ***************************  \n");

		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Success! ");
	}
}
