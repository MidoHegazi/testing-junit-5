package guru.springframework.sfgpetclinic.model;

import guru.springframework.ModelTests;
import guru.springframework.RepeatedTests;
import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest implements ModelTests  {

		private Person person ;
    @BeforeEach
    public void beforeEach() {
			person = new Person(1L,"Mido","Hegazi");
    }
		@Test
		public void groupedAssertions() {
			// given person ^
			//then
			assertAll("test probs",
					()-> assertEquals("Mido",person.getFirstName()),
					()-> assertEquals(person.getLastName(),"Hegazi"));
		}

		@Test
		public void groupedAssertionsWithMsgs() {
				// give person initialized up
				// then
				assertAll(
						"Asssertion with messages",
						() -> assertEquals("Mido",person.getFirstName(),"the name is not matching"));
		}


}