package guru.springframework.sfgpetclinic.model;

import guru.springframework.RepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PersonRepeatedTest implements RepeatedTests {
	@RepeatedTest(value=1, name="{displayName} : {currentRepetition} / {totalRepetitions}")
	@DisplayName("MyRepeatedTest")
	void repeatedTest() {
		System.out.println(" this test is repeating ");
		List<Person> list = Arrays.asList(
				new Person(1L,"Mido","Hegazi"),
				new Person(2L,"Ahmed","Adel"),
				new Person(3L,"Mohamed","Nabil")
		);
		list.stream().map(t->t.getFirstName()).forEach( t-> System.out.println(t.toUpperCase(Locale.ROOT)));
	}
	//		@RepeatedTest(3)
//		@DisplayName("Repetition test with Dependency Injection")
//		void myRepeatedTestWithDipendencyInjection(TestInfo testInfo, RepetitionInfo repetitionInfo) {
//				System.out.println(testInfo.getDisplayName()+" : "+repetitionInfo.getCurrentRepetition() );
//
//		}
	@RepeatedTest(2)
	void assignmentRepTest(){
		System.out.println("assignment repeated test");
	}
}
