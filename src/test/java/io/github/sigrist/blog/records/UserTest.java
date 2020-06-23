package io.github.sigrist.blog.records;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * UnitTests for record User.
 *
 */
public class UserTest {

	/**
	 * Test create an User and assert if the fields are ok.
	 */
	@Test
	public void testCreateUser() {
		final User user = new User(1L, "sigrist");

		assertEquals(1L, user.id());
		assertEquals("sigrist", user.login());
	}

	/**
	 * Test if two different instances created with same parameters are equals and
	 * have the same hash code.
	 */
	@Test
	public void testEqualsAndHashCode() {

		final User user1 = new User(1L, "sigrist");
		final User user2 = new User(1L, "sigrist");

		assertEquals(user1, user2);
		assertEquals(user1.hashCode(), user2.hashCode());

	}

	/**
	 * Test if two different instances created with different parameters are not equals and
	 * have the different hash code.
	 */
	@Test
	public void testNotEqualsAndHashCode() {

		final User user1 = new User(1L, "sigrist");
		final User user2 = new User(2L, "paulo");

		assertNotEquals(user1, user2);
		assertNotEquals(user1.hashCode(), user2.hashCode());

	}

	/**
	 * Test the generated toString method.
	 */
	@Test
	public void testToString() {
		final User user = new User(1L, "sigrist");

		assertEquals("User[id=1, login=sigrist]", user.toString());
	}
		
}
