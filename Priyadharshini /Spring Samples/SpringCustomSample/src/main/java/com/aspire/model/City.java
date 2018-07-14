package com.aspire.model;

public class City {
	private String cityName;
	private int population;
	public City () {}
	public City(String cityName, int population){
		this.cityName = cityName;
		this.population = population;
	}
	public String getCityName() {
		return cityName;
	}
	public int getPopulation() {
		return population;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
}
