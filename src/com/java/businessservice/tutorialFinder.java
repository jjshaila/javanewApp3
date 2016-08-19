package com.java.businessservice;

public class tutorialFinder {

	public String getBestTutorialSite(String language) {
		if(language.equals("Java")){
			return "Java Brains";
		}else{
			return "Language unknown";
		}
		
	}

	
}
