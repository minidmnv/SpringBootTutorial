package pl.michaljava.SpringBootTutorial.domain.tool;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author mnicinski
 */
@Entity
public class Tool {

	public Tool() {
		id = null;
		name = null;
	}

	public Tool(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private final Long id;
	private final String name;
}
