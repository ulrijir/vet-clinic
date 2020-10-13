package serenitylabs.tutorials.vetclinic.domain;

import static org.junit.Assert.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;


public class WhenCreatingANewDog {

	/**
	 * 
	 */
	@Test
	public void it_should_have_a_name() {
		LocalDateTime t = LocalDateTime.now();
		
 		Dog d = DogBuilder.dog().ofColor("White").called("Alf").ofBreed("Labrador").bornOn(t);
		
		assertEquals("Alf", d.getName());
		assertEquals("Labrador", d.getBreed());
		assertEquals(t, d.getDateOfBirth());
	}

	
}
