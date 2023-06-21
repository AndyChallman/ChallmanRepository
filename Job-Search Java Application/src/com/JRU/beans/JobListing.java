package com.JRU.beans;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import com.JRU.beans.User;
import com.JRU.beans.Listing;
import com.JRU.beans.AppMechanics;


public class JobListing {
	User user = new User();
	//Jobs reader = new Jobs();   -----cannot do this, causes fubar error
	//List<Listing> jobs = reader.viewAllListings();	-----cannot do this, causes fubar error
	public static Scanner jru = new Scanner(System.in);
	private final String csvFile = "Project2JobsRUs\\src\\com\\JRU\\Listings\\Listings.csv";
	private final String csvFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Listings\\Listings.csv";
	private final String txtFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\UsersListingApplications.txt";
	private final String userName = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\"
			+ user.getUserName() + "ListingApplications.txt";

	Listing chosenOne;
	String[] jobDeets;
	
	
	
	public List<Listing> viewAllListings() {// this works
		// initial method to figure out how to view all jobs.
		/// Project2JobsRUs/src/com/JRU/Listings/Listings.csv this is my CSV with job
		// listings

		List<Listing> jobs = new LinkedList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
			String line;
			// if there is a header row of some sort
			line = br.readLine();

			while ((line = br.readLine()) != null) {
				// CSV is a comma separated value file
				// I know the delimiters (the comma) and I know what order the data is in
				// because I have the file in front of me

				jobDeets = line.split(",");
				// first thing is the listingId, title, description, address, city, state,
				// zipcode, salary, careerField, contactEmail
				Listing job = new Listing(jobDeets[0].trim(), jobDeets[1].trim(), jobDeets[2].trim(),
						jobDeets[3].trim(), jobDeets[4].trim(), jobDeets[5].trim(), jobDeets[6].trim(),
						jobDeets[7].trim(), jobDeets[8].trim(), jobDeets[9].trim());

				jobs.add(job);

			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return jobs;
	}
	
	
	
	
	
	
}
