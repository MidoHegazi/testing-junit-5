package guru.springframework.sfgpetclinic.services.springdatajpa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Tag("Owner-spring-data-jpa-Test")
class OwnerSDJpaServiceTest {
// the main purpose here is to understand how we can skipp different tests. using the @Disabled annotation
	OwnerSDJpaService ownerSDJpaService;

	@BeforeEach
	void setUp() {
		ownerSDJpaService = new OwnerSDJpaService(null,null,null);
	}

	@Test
	@Disabled(value="Disabled untill we study the Mockito frame work")
	void findByLastName() {
		assertEquals("Mido",ownerSDJpaService.findByLastName("Mido"));
	}

	@Test
	void findAllByLastNameLike() {
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