package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class SoccerPlayer extends Player{
	private String jersyName;
	private int NoOfGoals;
	public SoccerPlayer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SoccerPlayer(String name, int dob,String jersyName,int NoOfGoals) {
		super(name, dob);
       this.jersyName=jersyName;
       this.NoOfGoals=NoOfGoals;
	}
	public String getJersyName() {
		return jersyName;
	}
	public void setJersyName(String jersyName) {
		this.jersyName = jersyName;
	}
	public int getNoOfGoals() {
		return NoOfGoals;
	}
	public void setNoOfGoals(int noOfGoals) {
		NoOfGoals = noOfGoals;
	}
	@Override
	public String toString() {
		return "SoccerPlayer [jersyName=" + jersyName + ", NoOfGoals=" + NoOfGoals + "]";
	}
	
	
	
	

}
