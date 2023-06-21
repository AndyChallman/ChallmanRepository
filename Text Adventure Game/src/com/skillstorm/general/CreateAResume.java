package com.skillstorm.general;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateAResume {

	static Scanner sc = new Scanner(System.in);
	

	public static void create() throws IOException {	
	
		System.out.println("Let's create your resume!");
	
			
		File file1 = new File("UserResume.txt");
		FileWriter  fw = new FileWriter(file1);	
		PrintWriter pw = new PrintWriter(fw);
	
			pw.println();
			pw.println(" " + contactInfo() + " ");
			pw.println();
			pw.println(" " + work1() + " ");
			pw.println();
			pw.println(" " + work2() + " ");
			pw.println();
			pw.println(" " + work3() + " ");
			pw.println();
			pw.println(" " + education() + " ");
			pw.println();
			pw.println(" " + skills() + " ");
	
			pw.close();
	}
	
	public static String contactInfo() {
		
		System.out.println("Your Name (first and last): ");
		String name = "---------- " + sc.nextLine() + " ----------\n";
		System.out.println("Your job title: ");
		String title = sc.nextLine();
		System.out.println("Your address: ");
		String address = sc.nextLine();
		System.out.println("Your email: ");
		String email = sc.nextLine();
		
		String contactInfo = name + "\n" +  title + "\n" + address + "\n" + email + "\n" ;
		return contactInfo;
	}
	
	public static String work1() {
		
		System.out.println("Work Experience 1 job title: ");
		String jobTitle = sc.nextLine();
		System.out.println("Work Experience 1 description:");
		String description = sc.nextLine();
		String work1 = "------Professional Experience #1------\n " + jobTitle + "\n\n" + description ;
		return work1;
	}
	
	public static String work2() {
		
		System.out.println("Work Experience 2 job title:");
		String jobTitle = sc.nextLine();
		System.out.println("Work Experience 2 description:");
		String description = sc.nextLine();
		String work2 = "------Professional Experience #2------\n" + jobTitle + "\n\n" + description ;
		return work2;
	}
	
	public static String work3() {
		
		System.out.println("Work Experience 3 job title:");
		String jobTitle = sc.nextLine();
		System.out.println("Work Experience 3 description:");
		String description = sc.nextLine();
		String work3 = "------Professional Experience #3------\n" + jobTitle + "\n\n" + description ;
		return work3;
	}
	
	public static String skills() {
		
		System.out.println("Additional Skills:");
		String skills = "------Skills------ \n\n" + sc.nextLine();
		return skills;
	}
	public static String education() {
		
		System.out.println("Education:");
		String education = "------Education------ \n\n" + sc.nextLine();
		return education;
	}
}


