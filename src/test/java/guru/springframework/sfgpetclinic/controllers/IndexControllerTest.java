package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@Tag("controllers")
class IndexControllerTest {
		IndexController indexController;
		@BeforeEach
		void setUp() {
				indexController = new IndexController();
		}

		@Test
		void index() {
				assertEquals("index",indexController.index());
				assertEquals("index",indexController.index(),"The values are different");
		}

		@Test
		void oupsHandler() {
			//	assertTrue("notimplemented".equals(indexController.oupsHandler()),()->"the values are not equal");
		}

		@Test
		void testIndex() {
		}

		@Test
		void testOupsHandlerWithException() {
				assertThrows(ValueNotFoundException.class,()->indexController.oupsHandler());
		}


		@Test
		@EnabledOnOs(OS.WINDOWS)
		void windows11Test() {
		}

		@Test
		@EnabledOnJre(JRE.JAVA_11)
		void nameJre18Test() {
		}
		@Test
		@EnabledIfEnvironmentVariable(named = "user",matches = "39389")
		void enableOnENvironmentUser() {
		}

		@Test
		void assertj() {
			assertThat(indexController.index()).isEqualTo("index");

		}


}