package com.codepath.immutableclass;

public final class Car {

	private final String make;
	private final String year;
	private final String model;
	private final Engine engine;

	public Car(String make, String year, String model, Engine engine) {
		this.make = make;
		this.year = year;
		this.model = model;
		this.engine = new Engine(engine.getType(), engine.getTorque(), engine.getHorsePower());
	}

	public String getMake() {
		return make;
	}

	public String getYear() {
		return year;
	}

	public String getModel() {
		return model;
	}

	public Engine getEngine() {
		return new Engine(engine.getType(), engine.getTorque(), engine.getHorsePower());
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", model=" + model + ", engine=" + engine + "]";
	}

}
