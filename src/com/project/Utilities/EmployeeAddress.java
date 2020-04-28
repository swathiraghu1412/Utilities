package com.project.Utilities;

public class EmployeeAddress {
	private int aptNum;
	private String streetName;
	private String City;
	private String State;
	private long Zipcode;
	private String Country;

	public void setaptNum(int aptNum) {
		this.aptNum = aptNum;
	}

	public int getaptNum() {
		return this.aptNum;
	}

	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getstreetName() {
		return this.streetName;
	}

	public void setCity(String City) {
		this.City = City;
	}

	public String getCity() {
		return this.City;
	}

	public void setZipcode(long Zipcode) {
		this.Zipcode = Zipcode;
	}

	public long getZipcode() {
		return this.Zipcode;
	}

	public void setState(String State) {
		this.State = State;
	}

	public String getState() {
		return this.State;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public String getCountry() {
		return this.Country;
	}
}
