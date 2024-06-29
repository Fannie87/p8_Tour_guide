package com.openclassrooms.tourguide.user;

import gpsUtil.location.Location;

public class JSONAttraction {
	private String attractionName;
	private Location attractionLocation;
	private Location userLocation;
	private double distance;
	private int rewardPoints;

	public String getAttractionName() {
		return attractionName;
	}

	public void setAttractionName(String attractionName) {
		this.attractionName = attractionName;
	}

	public Location getAttractionLocation() {
		return attractionLocation;
	}

	public void setAttractionLocation(Location attractionLocation) {
		this.attractionLocation = attractionLocation;
	}

	public Location getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(Location userLocation) {
		this.userLocation = userLocation;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

}
