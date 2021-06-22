package com.example.helorestwithgradle.user;

import java.util.Objects;

public class Geo{
	private String lng;
	private String lat;

	public Geo(String lng, String lat) {
		this.lng = lng;
		this.lat = lat;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Geo geo = (Geo) o;
		return Objects.equals(lng, geo.lng) && Objects.equals(lat, geo.lat);
	}

	@Override
	public int hashCode() {
		return Objects.hash(lng, lat);
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	@Override
	public String toString() {
		return "{" +
				"lng='" + lng + '\'' +
				", lat='" + lat + '\'' +
				'}';
	}
}
