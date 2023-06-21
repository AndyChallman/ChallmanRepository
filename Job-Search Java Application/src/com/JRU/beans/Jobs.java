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
import com.JRU.beans.JobListing;

//import com.skillstorm.Person;
public class Jobs {
	
		User user = new User();

	private final String csvFile = "Project2JobsRUs\\src\\com\\JRU\\Listings\\Listings.csv";
	private final String csvFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Listings\\Listings.csv";
	private final String txtFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\UsersListingApplications.txt";
	//private final String userName = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\"+ user.getUserName() + "ListingApplications.txt";
//	private final String userName ="C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + userName +"\\" + user.getUserName() + "ListingApplications.txt";
	JobListing reader2 = new JobListing();
	//Jobs reader = new Jobs();   -----cannot do this, causes fubar error
	List<Listing> jobs2 = reader2.viewAllListings();//	
	JobListing jl = new JobListing();
	
	
	public static Scanner jru = new Scanner(System.in);		

	Listing chosenOne;
	String[] jobDeets;
	
	
	User un = new User();
	String userName = un.getUserName();
	
	public void jobSearchOptions(JobListing jl , Scanner jru) {

		System.out.println(" What would you like to do? \n" + " 1. View all listings in their entirety. \n"
				+ " 2. View available career areas. \n" + " 3. View available locations. \n"
				+ " 4. View available salaries. \n" + " 5. Apply to a listing. \n" + " 6. Go back to Main menu. \n");

		int options = jru.nextInt();

		if (options == 1) {
			
			System.out.println(	jl.viewAllListings());
							;
		} else if (options == 2) {
							browseCareerArea(jl.viewAllListings());
		} else if (options == 3) {
							browseLocation(jl.viewAllListings());
		} else if (options == 4) {
							browseSalary(jl.viewAllListings());
		} else if (options == 5) {
							chooseListing(jl.viewAllListings(), jru, userName);
		} else if (options == 6) {
			try {
				AppMechanics.mainMenu(jru);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			try {
				AppMechanics.startupScreen(jru);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// mechanics for taking in, displaying, and saving jobs
	// I am thinking using multi-dimensional array might be good for this, so we
	// could
	// display listing count by specific filter criteria, but not sure how that
	// would go...

	

	public void browseCareerArea(List<Listing> jobs) { // PERFECT, DONT TOUCH IT! -bt
		// option to browse listings by career area
		// must group listings by similar career areas, manual labor, customer service,
		// tech etc.
		// This would be jobDeets[8] but how do we display just this portion of the
		// lists?
		System.out.println("Listing    Career  \n ID        Field ");
		System.out.println("--------------------------------");
		for (int i = 1; i < jobs.size(); i++) {

			System.out.println(" " + jobs.get(i).getListingId() + ". --  " + jobs.get(i).getCareerField());
		}
		System.out.println("\n\n");
		jobSearchOptions(jl, jru);
	}

	public void browseLocation(List<Listing> jobs) {// PERFECT, DONT TOUCH IT! -bt
		// option to browse listings by state location
		// could use city/state, but then we would have to know cities and states,
		// I think states would suffice. However, the requirements do say we have to
		// list city
		System.out.println("Listing    CITY  \n ID             STATE ");
		System.out.println("--------------------------------");
		for (int i = 1; i < jobs.size(); i++) {

			System.out.println(" " + jobs.get(i).getListingId() + ".  --   " + jobs.get(i).getCity() + ",  "
					+ jobs2.get(i).getState());
		}
		System.out.println("\n\n");
		jobSearchOptions(jl, jru);

	}

	public void browseSalary(List<Listing> jobs) {// PERFECT, DONT TOUCH IT! -bt
		// browse by expected salary range
		System.out.println("Listing    Annual  \n ID        Salary ");
		System.out.println("--------------------------------");
		for (int i = 1; i < jobs.size(); i++) {

			System.out.println(
					" " + jobs.get(i).getListingId() + ".  --   $" + jobs.get(i).getSalary() + ".00 annually  ");
		}
		System.out.println("\n\n");
		jobSearchOptions(jl, jru);

	}

	public void chooseListing(List<Listing> jobs, Scanner jru, String userName) { // need to add exception handling to this method via
																	// try catch
		String go;
		// System.out.println(" " + jobs.get(1)); this retrieves the specified
		// listing...
		// choosing which listing to apply to...
		System.out.println("To which listing would you like to apply? : (Enter 1-" + jobs.size() + ") ");// this works
		// scanner to allow user to input their choice
		int listingnum = jru.nextInt(); // this works
		// print the listing of their choice
		System.out.println(" " + jobs.get(listingnum));// this works
		// clear the buffer
		jru.nextLine();

		// System.out.println("\n \n ***Hit ENTER to continue*** \n \n ");
		// go = jru.nextLine();

		System.out.println("Is this correct : (yes or no)");

		String correct = jru.nextLine();

		if (correct.equalsIgnoreCase("no")) {
			System.out.println("try again:");
			System.out.println("To which listing would you like to apply? : (Enter 1-" + jobs.size() + ") ");
			listingnum = jru.nextInt();
			System.out.println(" " + jobs.get(listingnum));
			jru.nextLine();
			System.out.println("Is this correct : (yes or no)");
		} else {
			System.out.println("Great, let's continue...");
		}

		System.out.println("\n \n  ***Hit ENTER to continue*** \n \n ");
		go = jru.nextLine();
		chosenOne = jobs.get(listingnum);

		// return jobs.get(listingnum);
		saveListingToFile(chosenOne, userName);

	}

	public void saveListingToFile(Listing chosenOne, String userName) {
		userName ="C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Users\\" + userName +"\\" + userName + "ListingApplications.txt";

		File file = new File(userName);

		// check if file exists
		if (file.exists()) {
			System.out.println("The file is real.");
		} else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(userName, true))) {// if the file does not exist
																							// this creates it and
																							// writes to it
				bw.write(" Chosen Listing : \n" + chosenOne);
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
			bw.write(" Chosen Listing : \n" + chosenOne);
			bw.write(" \n ***************************  \n");

		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("Success! Please contact " + chosenOne.getContactEmail() + " for follow up.");
	}

	public void notes() {

		// Need to add option to chose
		// a. browse all, b. browse location, c. browse career field, d. browse salary
		// then give option for "do you want to choose one of these?
		//Jobs reader = new Jobs();
		//List<Listing> jobs = reader.viewAllListings();
		// reader.browseCareerArea(jobs);//this works
		// reader.browseLocation(jobs);//this works
		// reader.browseSalary(jobs);//this works
		//reader.chooseListing(jobs, jru);// working on this

		// if user is "logged in" allow them to apply to the job.
		// ie. load basic contact info,
		// upload resume
		// app would then add a secure copy of, or clone of their resume under the
		// listing
		// so admin could pull up listing folder and see job applications and resumes
		// saved in a
		// sub folder.
		/*
		 * scanner input code... println what listing would you like to apply to? take
		 * in int for job listing id
		 * 
		 * where do we store applications? in a CSV marked applications? Reqs say to
		 * save applications under their account. use class example for this
		 * 
		 * 
		 * store name phone number and email address store resume
		 * 
		 * 
		 * print POC email , contact POC for more information and to follow up.
		 * 
		 * public List<Listing> viewAllListings() {// this works
		// initial method to figure out how to view all jobs.
		/// Project2JobsRUs/src/com/JRU/Listings/Listings.csv this is my CSV with job
		// listings

		List<Listing> jobs = new LinkedList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
			String line;
			// if there is a header row of some sort
			line = br.readLine();

			while ((line = br.readLine()) != null) {
				// CSV is a comma separated value fileS
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
	
		
		/*Startup screen
		 * 	create account
		 * 	existing user
		 * 	browse jobs
		*/	
		
		/*Create account
		 * 	create account
		 *  create resume 
		 */
		
		/*Login
		 * 	Enter username and password (saved in csv)
		 */
		
		/*Browse Jobs (not logged in)
		 * can view and filter information
		 * cannot apply for jobs
		 */
		
		/* Main menu
		 * 	1. Edit Account info
		 * 	2. Edit Resume
		 * 	3. Browse/Apply for jobs
		 * 	4. Log out 
		 */
		
		/* Browse/Apply for jobs
		 * 	Browse jobs (able to apply filters)
		 * 	Apply for a job
		 * 	Save job application to said user 
		 */
		
		
		//A
		//Account editing 
		//

	//CreateAccount.accountBuild();
	
//<<<<<<< Updated upstream

		

//		Jobs reader = new Jobs();
//		//reader.readFile();
//		//reader.readFile2();
//		//reader.readFile3();
//		//reader.writeFile();
//		//reader.readCSV();
		
//		
//		//reader.writeCSV(people, "csvFile2.csv");
//		//relative path. places this file under whatever
//		//folder the app is running from
//		reader.browseCareerArea();
//=======
		// moved to app mechanics -- //Jobs reader = new Jobs();
		//reader.readFile();
		//reader.readFile2();
		//reader.readFile3();
		//reader.writeFile();
		//reader.readCSV();
		//List<Listing> jobs = reader.viewAllListings();
		//System.out.println(jobs);
		// moved to app mechanics -- //List<Listing> jobs = reader.viewAllListings();
		//System.out.println(jobs);//this prints the all of the entire job listings
		//reader.writeCSV(people, "csvFile2.csv");
		//relative path. places this file under whatever
		//folder the app is running from
		//reader.browseCareerArea(jobs);//this works
		//reader.browseLocation(jobs);//this works
		//reader.browseSalary(jobs);//this works
		//reader.chooseListing(jobs, jru);//working on this 
		
		
	
	
	//}

	
	
	
	//TODO 
	/*  ---see project requirements class for full instructions---
	 - develop collection/storage process/solution for storing data, may be difficult since there are
	 	three different computers working on this code.
	 - develop group of job listings to be able to browse through
	 - develop group of users to be able to test that functionality with resumes
	 	ensure one user cannot see other user data
	 - create file/folder system with names EXACTLY as listed in the requirements
	 - how do we deal with differences between mac and windows etc. ?
	 - from what I can tell, we need to build everything in java, and have it save to the user's file system, 
	 	then read from the user's file system to display it... does not make a lot of sense to me, 
	 	but what do I know?
	 - make sure we properly encapsulate and protect everything... 
	 		I have made everything public void just to make it easy to get it down.
	 
	 
	 */
		

	}

}
