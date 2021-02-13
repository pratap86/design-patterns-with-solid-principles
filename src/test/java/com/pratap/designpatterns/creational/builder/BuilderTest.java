package com.pratap.designpatterns.creational.builder;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
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
	
	@Test
	void testBuilder_By_Name_Only() {

		user = createUser();
		UserDTO userDTO = directBuildByUserName(new UserWebDTOBuilder(), user);
		assertNotNull(userDTO);
		assertEquals("Pratap Narayan", userDTO.getName());
		
	}
	
	@Test
	void testBuilder_By_User_Address_Only() {

		user = createUser();
		UserDTO userDTO = directBuildByUserAddress(new UserWebDTOBuilder(), user);
		assertNotNull(userDTO);
		assertThat(userDTO.getAddress(), containsString("Noida"));
		assertThat(userDTO.getAddress(), endsWith("260230"));
	}
	
	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
	}
	
	private static UserDTO directBuildByUserName(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName()).build();
	}
	
	private static UserDTO directBuildByUserAddress(UserDTOBuilder builder, User user) {
		return builder.withAddress(user.getAddress()).build();
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
