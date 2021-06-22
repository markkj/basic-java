package com.example.helorestwithgradle.user;

import java.util.Objects;

public class Address{
	private String zipcode;
	private Geo geo;
	private String suite;
	private String city;
	private String street;

	public Address(String zipcode, Geo geo, String suite, String city, String street) {
		this.zipcode = zipcode;
		this.geo = geo;
		this.suite = suite;
		this.city = city;
		this.street = street;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Address address = (Address) o;
		return Objects.equals(zipcode, address.zipcode) && Objects.equals(geo, address.geo) && Objects.equals(suite, address.suite) && Objects.equals(city, address.city) && Objects.equals(street, address.street);
	}

	@Override
	public int hashCode() {
		return Objects.hash(zipcode, geo, suite, city, street);
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Geo getGeo() {
		return geo;
	}

	public void setGeo(Geo geo) {
		this.geo = geo;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "{" +
				"zipcode='" + zipcode + '\'' +
				", geo=" + geo +
				", suite='" + suite + '\'' +
				", city='" + city + '\'' +
				", street='" + street + '\'' +
				'}';
	}
}
