package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class Dog {
	private final String name;
	private final String breed;
	private final LocalDateTime dateOfBirth;
	private final String favouriteFood;

	public Dog(String name, String breed, LocalDateTime dateOfBirth, String favouriteFood) {
		this.name = name;
		this.breed = breed;
		this.dateOfBirth = dateOfBirth;
		this.favouriteFood = favouriteFood;
	}

	public Dog(String name, String breed, LocalDateTime dateOfBirth) {
		this(name, breed, dateOfBirth, null);
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
}
