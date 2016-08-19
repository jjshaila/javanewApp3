package com.java.action;

import com.java.businessservice.tutorialFinder;

public class getTutorialAction {
	/*public String execute(){
		return "success";
	}*/
	private String tutorialSite;
	private String language;//This is passed as request parameter in query parameter accessed from intercepter
	public String getTutorialSite() {
		return tutorialSite;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setTutorialSite(String tutorialSite) {
		this.tutorialSite = tutorialSite;
	}
	public String execute(){
		tutorialFinder finder = new tutorialFinder();
		//String tutorialName = finder.getBestTutorialSite();
		//setTutorialSite(tutorialName);
		String tutorialName = finder.getBestTutorialSite(getLanguage());
		setTutorialSite(tutorialName);
		System.out.println("Best tutorial site Name"+tutorialName);
		return "success";
	}

}
