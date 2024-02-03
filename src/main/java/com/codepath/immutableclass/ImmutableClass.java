package com.codepath.immutableclass;

public class ImmutableClass {
	public static void main(String[] args) {

		Engine engine = new Engine("I-4", "1500", "6500");
		
		Car car = new Car("Honda", "2020", "Accord", engine);
		
		// original car object
		System.out.println(car);
		
		
		engine.setType("V-6");
		engine.setTorque("2500");
		engine.setHorsePower("7000");
	
		//value wont changed, since in constructor of car we are assigning new engine object.
		System.out.println(car);
		
		
		
		Engine carEngine = car.getEngine();
		
		carEngine.setType("V-6");
		carEngine.setTorque("2500");
		carEngine.setHorsePower("7000");
		
		// value wont changed, since we are returning engine object in getter method.
		System.out.println(car);
		
		
		
	}
}
