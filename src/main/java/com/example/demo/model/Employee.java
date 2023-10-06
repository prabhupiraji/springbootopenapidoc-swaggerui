package com.example.demo.model;
import java.io.Serializable;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@JsonIgnoreProperties({"hibernateLazyInitializer"})

@Schema(description = "employee entity class for saving object data in Db")
@Table
@Entity
public class Employee implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
public long id;
@Column(name="firstname")
public String firstname;
@Column(name="lastname")
public String lastname;
@Column(name="email")
public String email;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Employee() {
	super();
}
public Employee(long id, String firstname, String lastname, String email) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
}

}

