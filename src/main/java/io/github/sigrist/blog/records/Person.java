package io.github.sigrist.blog.records;

/**
 * Recording represeting a Person.
 * 
 * @since 1.0.0
 * 
 * @param id   The person ID.
 * @param name The person name.
 * @param user The person user in the system.
 *
 */
public record Person(final Long id, final String name, final User user) {

}
