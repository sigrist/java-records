package io.github.sigrist.blog.records;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

	@Test
	public void testCreatePerson() {
		final User user = new User(1L, "sigrist");
		final Person person = new Person(1L, "Paulo Sigrist", user);
		
		assertEquals(1L, person.id());
		assertEquals("Paulo Sigrist", person.name());
		assertEquals(user, person.user());
	}
	
	@Test
	public void testEqualsAndHashCode() {
		final User user1 = new User(1L, "sigrist");
		final Person person1 = new Person(1L, "Paulo Sigrist", user1);
		final User user2 = new User(1L, "sigrist");
		final Person person2 = new Person(1L, "Paulo Sigrist", user2);
		
		assertEquals(person1, person2);
		assertEquals(person1.hashCode(), person2.hashCode());
	}
	
	@Test
	public void testNotEqualsAndHashCode() {
		final User user1 = new User(1L, "sigrist");
		final Person person1 = new Person(1L, "Paulo Sigrist", user1);
		final User user2 = new User(1L, "paulo");
		final Person person2 = new Person(1L, "Paulo Roberto", user2);
		
		assertNotEquals(person1, person2);
		assertNotEquals(person1.hashCode(), person2.hashCode());

	}
	
	/**
	 * Test the generated toString method.
	 */
	@Test
	public void testToString() {
		final User user = new User(1L, "sigrist");
		final Person person = new Person(1L, "Paulo Sigrist", user);

		assertEquals("Person[id=1, name=Paulo Sigrist, user=User[id=1, login=sigrist]]", person.toString());
	}


}
