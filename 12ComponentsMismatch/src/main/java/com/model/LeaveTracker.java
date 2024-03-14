package com.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class LeaveTracker {

	@Column
	private int sickLeave = 3;
	@Column
	private int earnedLeave = 15;  
	@Column
	private int meternityLeave = 180;
	@Column
	private int emergencyLeave = 7;

	public LeaveTracker() {
	}

	public LeaveTracker( int earnedLeave, int meternityLeave, int emergencyLeave) {

		this.earnedLeave = earnedLeave;
		this.meternityLeave = meternityLeave;
		this.emergencyLeave = emergencyLeave;
	}


	public int getSickLeave() {
		return sickLeave;
	}

	public void setSickLeave(int sickLeave) {
		this.sickLeave = sickLeave;
	}

	public int getEarnedLeave() {
		return earnedLeave;
	}

	public void setEarnedLeave(int earnedLeave) {
		this.earnedLeave = earnedLeave;
	}

	public int getMeternityLeave() {
		return meternityLeave;
	}

	public void setMeternityLeave(int meternityLeave) {
		this.meternityLeave = meternityLeave;
	}

	public int getEmergencyLeave() {
		return emergencyLeave;
	}

	public void setEmergencyLeave(int emergencyLeave) {
		this.emergencyLeave = emergencyLeave;
	}

	@Override
	public String toString() {
		return "LeaveTracker [sickLeave=" + sickLeave + ", earnedLeave=" + earnedLeave
				+ ", meternityLeave=" + meternityLeave + ", emergencyLeave=" + emergencyLeave + "]";
	}

}