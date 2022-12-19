package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.junitestextentions.TimeExtention;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(TimeExtention.class)
class PetTypeSDJpaServiceIT {

	@BeforeAll
	public static void beforeAll() {
	System.out.println("-------------------------------------------------------------");
	System.out.println("|******************* INTEGRATION TEST ***********************|");
	System.out.println("-------------------------------------------------------------");
}
	@BeforeEach
	void setUp() {

	}

	@Test
	void findAll() {
	}

	@Test
	void findById() {
	}

	@Test
	void save() {
	}

	@Test
	void delete() {
	}

	@Test
	void deleteById() {
	}
}