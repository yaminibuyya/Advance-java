package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="car_id")
	    private int id;
	@Column(name = "car_name",length=80)
	    private String carname;
	@Column(name="color",length=80)
	    private  String color;
	@Temporal(TemporalType.DATE)
	    private Date date;
	    
	    public Car() {
			// TODO Auto-generated constructor stub
		}

		public Car(int id, String carname, String color, Date date) {
			super();
			this.id = id;
			this.carname = carname;
			this.color = color;
			this.date = date;
		}
		public Car( String carname, String color, Date date) {
			super();
			this.carname = carname;
			this.color = color;
			this.date = date;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getCarname() {
			return carname;
		}

		public void setCarname(String carname) {
			this.carname = carname;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Car [id=" + id + ", carname=" + carname + ", color=" + color + ", date=" + date + "]";
		}
		

		

}
