package com.entity;

public class Specialist {
	private int id;
	private String specialistNameString;
	public Specialist(int id, String specialistNameString) {
		super();
		this.id = id;
		this.specialistNameString = specialistNameString;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialistNameString() {
		return specialistNameString;
	}
	public void setSpecialistNameString(String specialistNameString) {
		this.specialistNameString = specialistNameString;
	}
	public Specialist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
