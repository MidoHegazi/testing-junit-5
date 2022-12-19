package guru.springframework.sfgpetclinic.model;

import guru.springframework.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {
		@Test
		public void dependentTest() {
				Owner owner = new Owner(1L,"Mido","Hegazi");
				owner.setCity("Roma");
				owner.setTelephone("3891493092");
				assertAll("Mixed Owner and Person Properties",
						()->assertAll("Person properties",
								()->assertEquals("Mido",owner.getFirstName(),"first names are different"),
								()->assertEquals("Hegazi",owner.getLastName(),"last names are different")
						),
						()->assertAll("Owner Properties ",
								()->assertEquals("Roma",owner.getCity(),"city name are not matching"),
								()->assertEquals("3891493092",owner.getTelephone(),"Phone numbers are not matching")
						)
				);
		}

		@DisplayName("Value source method")
		@ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
		@ValueSource(strings = {"Mido","Mohamed","Hamada"})
	    void parmeterizedTest(String value) {
			  System.out.println(value);
		}
		@DisplayName("Enum Sourse")
		@ParameterizedTest(name="{displayName} - [{index}] - {arguments}")
	  @EnumSource(OwnerType.class)
	  public void enumSourceClass(OwnerType ownerType) {
			System.out.println(ownerType);
		}
	@ParameterizedTest(name ="{displayName}-[{index}] {arguments}" )
	@CsvSource({
			"Mohamed Hegazi,30,40",
			"Ahmed Adel,50,60"
	})
	@DisplayName("csv-source")

	public void csvMethod(String name,int age,int salary){
		//TO-imple
	}

	@ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
	@DisplayName("CsvFileTestMethod")
	@CsvFileSource(resources = "/autput.csv",numLinesToSkip = 1)
	public void csvFileTest(String name,int age,int salary){
		System.out.println(name+ " - " + age+ " - "+ salary);
	}


}