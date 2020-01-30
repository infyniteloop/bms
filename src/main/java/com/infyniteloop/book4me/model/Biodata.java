package com.infyniteloop.book4me.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "biodata_mst")
public class Biodata {
	
	
	// Private Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(name="user_id_v")
	private String guestId;
	
	//@Column(name="first_name" , length=100, nullable=false)
	@Column(name="first_name_v" , length=50)
	private String firstName;
	
	@Column(name="last_name_v", length=50)
	private String lastName;
	
	@Column(name="desig_v", length=50)
	private String designation;
	
	@Column(name="father_name_v", length=50)
	private String fathersName;
	
	@Column(name="gender_v", length=10)
	private String gender;
	
	@Column(name="dob_d", length=20)
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Column(name="blood_group_v", length=5)
	private String bloodGroup;
		
	@Column(name="address_v", length=50)
	private String address;
	
	@Column(name="city_v", length=50)
	private String city;
	
	@Column(name="state_v", length=50)
	private String state;
	
	@Column(name="pincode_i")
	private int pincode;
	
	@Column(name="mobile_i")
	private int mobile;
	
	@Column(name="emergency_contact_v", length=50)
	private String emergencyContact;
	
	@Column(name="emergency_mobile_i")
	private int emergencyMobile;
	
	@Column(name="bio_enable_v", length=1)
	private String bioEnable;
	
	@Column(name="password_enable_v", length=1)
	private String passwordEnable;
	
	
	
	
	// GETTER & SETTERS
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGuestId() {
		return guestId;
	}
	public void setGuestId(String guestId) {
		this.guestId = guestId;
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
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
		
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}	
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getEmergencyMobile() {
		return emergencyMobile;
	}
	public void setEmergencyMobile(int emergencyMobile) {
		this.emergencyMobile = emergencyMobile;
	}
	public String getEmergencyContact() {
		return emergencyContact;
	}
	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}
	
	public String getBioEnable() {
		return bioEnable;
	}
	public void setBioEnable(String bioEnable) {
		this.bioEnable = bioEnable;
	}
	public String getPasswordEnable() {
		return passwordEnable;
	}
	public void setPasswordEnable(String passwordEnable) {
		this.passwordEnable = passwordEnable;
	}
	
	
	
	
	// TO STRING
	@Override
	public String toString() {
		return "Biodata [id=" + id + ", guestId=" + guestId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", designation=" + designation + ", fathersName=" + fathersName + ", gender=" + gender + ", dob="
				+ dob + ", bloodGroup=" + bloodGroup + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + ", mobile=" + mobile + ", emergencyContact=" + emergencyContact
				+ ", emergencyMobile=" + emergencyMobile + ", bioEnable=" + bioEnable + ", passwordEnable="
				+ passwordEnable + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
