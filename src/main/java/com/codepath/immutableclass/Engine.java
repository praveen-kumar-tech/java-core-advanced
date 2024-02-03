package com.codepath.immutableclass;

public class Engine {
	
	private String type;
	private String torque;
	private String horsePower;
	
	public Engine(String type, String torque, String horsePower) {
		this.type = type;
		this.torque = torque;
		this.horsePower = horsePower;
	}

	public String getType() {
		return type;
	}

	public String getTorque() {
		return torque;
	}

	public String getHorsePower() {
		return horsePower;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public void setTorque(String torque) {
		this.torque = torque;
	}

	public void setHorsePower(String horsePower) {
		this.horsePower = horsePower;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", torque=" + torque + ", horsePower=" + horsePower + "]";
	}
	
	

}
