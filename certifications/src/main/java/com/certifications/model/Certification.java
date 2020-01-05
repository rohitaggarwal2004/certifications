package com.certifications.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "Certification")
public class Certification {
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Id
	private Long id;
	protected Certification() {

	}

	public Certification(String name, String description, String imagePath, String year) {
		this.name = name;
		this.description = description;
		this.imagePath = imagePath;
		this.year = year;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	//@Column(name = "name")
	public String name;
	//@Column(name = "description")
	public String description;
	//@Column(name = "year")
	public String year;
	//@Column(name = "imagePath")
	public String imagePath;
}
