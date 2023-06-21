package com.JRU;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.JRU.beans.Listing;
import com.JRU.beans.Login;
import com.JRU.beans.updateUserInfo;
import com.JRU.beans.AppMechanics;
import com.JRU.beans.CreateAccount;
import com.JRU.beans.Jobs;
import com.JRU.beans.CreateFolder;
import com.JRU.beans.JobListing;

public class JobsRus {
	public static Scanner jru = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		
		
		//CreateFolder folder = new CreateFolder();
		//folder.createUserFolder(userName);
		
		//Jobs j =new Jobs();
		//JobListing jl = new JobListing();
		//j.browseCareerArea(jl.viewAllListings());
		
		AppMechanics.startupScreen(jru);
		
		//CreateAccount.accountBuild();
		//CreateAResume.create();
		
	
}
}