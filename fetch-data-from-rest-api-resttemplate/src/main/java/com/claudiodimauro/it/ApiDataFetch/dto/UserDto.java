package com.claudiodimauro.it.ApiDataFetch.dto;

public class UserDto {
	private int id;
	private String name;
	private String username;
	private String email;
	private AddressDto address;
	private String phone;
	private String website;
	private CompanyDto company;

	public UserDto() {		
	}

	public UserDto(int id, String name, String username, String email, AddressDto address, String phone, String website,
			CompanyDto company) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public CompanyDto getCompany() {
		return company;
	}
	public void setCompany(CompanyDto company) {
		this.company = company;
	}

}