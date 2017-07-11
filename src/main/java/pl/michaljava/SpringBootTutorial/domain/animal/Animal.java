package pl.michaljava.SpringBootTutorial.domain.animal;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mnicinski
 */
@Entity
public class Animal {

	public Animal() {
		id = null;
		name = null;
		dateOfBirth = null;
	}

	public Animal(Long id, String name, LocalDate dateOfBirth) {
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	private final String name;
	private final LocalDate dateOfBirth;
}
