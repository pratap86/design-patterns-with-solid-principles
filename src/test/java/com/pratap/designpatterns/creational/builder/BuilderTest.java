package com.pratap.designpatterns.creational.builder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class BuilderTest {

	private User user;
	
	@Test
	void testBuilder() {

		user = createUser();
		UserDTO userDTO = directBuild(new UserWebDTOBuilder(), user);
		assertNotNull(userDTO);
		assertEquals("Pratap Narayan", userDTO.getName());
		
	}
	
	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
	}

	/**
	 * Returns a sample user.
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1986, 8, 10));
		user.setFirstName("Pratap");
		user.setLastName("Narayan");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("New Avenue Road");
		address.setCity("Noida");
		address.setState("UP");
		address.setZipcode("260230");
		user.setAddress(address);
		return user;
	}

}
