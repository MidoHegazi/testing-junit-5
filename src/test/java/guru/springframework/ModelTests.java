package guru.springframework;

import org.junit.jupiter.api.*;

@Tag("model")
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public interface ModelTests {
	@BeforeAll
	default void beforeAll() {
		System.out.println("test before each in the interface method ..... lets do something here!!!");
	}
	@BeforeEach
	default void  beforeEach(TestInfo testInfo) {
		System.out.println("test is running... - "+testInfo.getDisplayName());
	}
}
