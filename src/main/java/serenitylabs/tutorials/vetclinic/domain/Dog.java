package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
	private final String name;
	private final String breed;
	private final String color;
	private final LocalDateTime dateOfBirth;
	private final String favouriteFood;
	private final String favouritePet;

	public Dog(String name, String breed, String color, LocalDateTime dateOfBirth, String favouriteFood, String favouritePet) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.dateOfBirth = dateOfBirth;
		this.favouriteFood = favouriteFood;
		this.favouritePet = favouritePet;
	}

	public String getBreed() {
		return breed;
	}

	public LocalDateTime getDateOfBirth() {
		return dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public String getFavouriteFood() {
		return favouriteFood;
	}

	public String getColor() {
		return color;
	}

	public String getFavouritePet() {
		return favouritePet;
	}
}
