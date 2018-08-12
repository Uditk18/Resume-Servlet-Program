//this is POJO class declaring all objects

package com.cg.model;

import java.util.Arrays;

public class ResumeModel {

private String fname;
private String lname;
private String gender;
private String highestQualification;
private String dob;
private String[] hobbies;
private String address;
private String[] skills;
private String email;
private String description;
private String phone;
public ResumeModel()
{
	super();
}

public ResumeModel(String fname, String lname, String gender, String highestQualification, String dob,
		String[] hobbies, String address, String[] skills, String email, String description,String phone) {
	
	this.fname = fname;
	this.lname = lname;
	this.gender = gender;
	this.highestQualification = highestQualification;
	this.dob = dob;
	this.hobbies = hobbies;
	this.address = address;
	this.skills = skills;
	this.email = email;
	this.description = description;
	this.phone=phone;
}


@Override
public String toString() {
	return "ResumeModel [fname=" + fname + ", lname=" + lname + ", gender=" + gender + ", highestQualification="
			+ highestQualification + ", dob=" + dob + ", hobbies=" + Arrays.toString(hobbies) + ", address=" + address
			+ ", skills=" + Arrays.toString(skills) + ", email=" + email + ", description=" + description + "]";
}

public String getFname() {
	return fname;
}


public void setFname(String fname) {
	this.fname = fname;
}


public String getLname() {
	return lname;
}


public void setLname(String lname) {
	this.lname = lname;
}


public String getGender() {
	return gender;
}


public void setGender(String gender) {
	this.gender = gender;
}


public String getHighestQualification() {
	return highestQualification;
}


public void setHighestQualification(String highestQualification) {
	this.highestQualification = highestQualification;
}


public String getDob() {
	return dob;
}


public void setDob(String dob) {
	this.dob = dob;
}


public String[] getHobbies() {
	return hobbies;
}


public void setHobbies(String[] hobbies) {
	this.hobbies = hobbies;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String[] getSkills() {
	return skills;
}


public void setSkills(String[] skills) {
	this.skills = skills;
}


public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}


}