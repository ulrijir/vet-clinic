package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBuilder implements WithColor {
	private String name;
	private String breed;
	private String color;
	private String food;
	private String pet;


	public static WithColor dog() {
		return new DogBuilder();
	}
	
	public DogBuilder ofColor(String color) {
		this.color = color;
		return this;
	}
	
	public DogBuilder called(String name) {
		this.name = name;
		return this;
	}
	
	public DogBuilder ofBreed(String breed) {
		this.breed = breed;
		return this;
	}

	public DogBuilder favouritePet(String pet) {
		this.pet = pet;
		return this;
	}
	
	public DogBuilder favouriteFood(String food) {
		this.food = food;
		return this;
	}

	public Dog bornOn(LocalDateTime born) {
		return new Dog(name, breed, color, born, food, pet);
	}
	
}
