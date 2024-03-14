package com.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class CricketPlayer extends Player  {
	private String TeamName;
	private String PlayerType;
	public CricketPlayer(String name, int dob,String teamName, String playerType) {
		super(name,dob);
		TeamName = teamName;
		PlayerType = playerType;
	}
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public String getPlayerType() {
		return PlayerType;
	}
	public void setPlayerType(String playerType) {
		PlayerType = playerType;
	}
	@Override
	public String toString() {
		return "CricketPlayer [TeamName=" + TeamName + ", PlayerType=" + PlayerType + "]";
	}
	
	
	
	
	
	


}
