package com.praxify.pojos;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Patient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7341653405392826883L;

	@Id
    private String id;

    private String firstName;
    private String lastName;
    private String contactNumber;
    private String aadharId;
    public Patient() {
	}
    
    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAadharId() {
		return aadharId;
	}

	public void setAadharId(String aadharId) {
		this.aadharId = aadharId;
	}

	@Override
    public String toString() {
    	return "[PatientDetails: id: "+id+" firstName : "+firstName+" lastName : "+lastName+" contactNumber: "+contactNumber+" aadharID :"+aadharId+" ]";
    }
    

}
