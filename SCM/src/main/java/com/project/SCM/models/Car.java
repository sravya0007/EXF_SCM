package com.project.SCM.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DeviceData")
public class Car {
	
	
	
	private int Id;
	private double BatteryLevel;
	private double FirstSensortemperature;
	private String RouteFrom;
	private String RouteTo;


//	private String id;
//	
//	private String make;
//	
//	private String model;
//	
//	private String description;
//	
//	private Integer year;
//	
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//	public String getMake() {
//		return make;
//	}
//
//	public void setMake(String make) {
//		this.make = make;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public double getBatteryLevel() {
		return BatteryLevel;
	}

	public void setBatteryLevel(double batteryLevel) {
		BatteryLevel = batteryLevel;
	}

	public double getFirstSensortemperature() {
		return FirstSensortemperature;
	}

	public void setFirstSensortemperature(double firstSensortemperature) {
		FirstSensortemperature = firstSensortemperature;
	}

	public String getRouteFrom() {
		return RouteFrom;
	}

	public void setRouteFrom(String routeFrom) {
		RouteFrom = routeFrom;
	}

	public String getRouteTo() {
		return RouteTo;
	}

	public void setRouteTo(String routeTo) {
		RouteTo = routeTo;
	}

//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public Integer getYear() {
//		return year;
//	}
//
//	public void setYear(Integer year) {
//		this.year = year;
//	}
	
}
