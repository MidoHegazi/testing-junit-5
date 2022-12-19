package guru.springframework;

import jdk.jfr.Percentage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

@Tag("repeatedTests")
public interface RepeatedTests {

		@BeforeEach
		default void beforeEach(TestInfo testInfo, RepetitionInfo repetitionInfo){
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("|Repeated tests interface -> " + testInfo.getDisplayName() + ":" + repetitionInfo.getCurrentRepetition()+"|");

		}
}
