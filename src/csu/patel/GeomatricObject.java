package csu.patel;

import java.util.Date;

public abstract class GeomatricObject {

	//class variables
	private String color = "white";
	private boolean filled = false;
	private Date dateOfCreation;
	//constructors
	public GeomatricObject(String color, boolean filled ) {
	this.color = color;
	this.filled = filled;
	this.dateOfCreation = new Date();
	}
	public GeomatricObject( ) {
	this.dateOfCreation = new Date();
	}
	//Accessory
	public String getColor() {
	return color;
	}
	public void setColor(String color) {
	this.color = color;
	}
	public boolean isFilled() {
	return filled;
	}
	public void setFilled(boolean filled) {
	this.filled = filled;
	}
	public Date getDateOfCreation() {
	return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
	this.dateOfCreation = dateOfCreation;
	}
	//user-defined methods
	@Override
	public String toString() {
	return "GeometricObject [color=" + color
	+ ", filled=" + filled
	+ ", dateOfCreation=" + dateOfCreation + "]";
	}
	//children MUST implement the following methods
	public abstract double getArea();
	public abstract double getPerimeter();
	

}
