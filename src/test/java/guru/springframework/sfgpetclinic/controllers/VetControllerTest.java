package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@Tag("controllers")
class VetControllerTest {
	VetController vetController;
	VetService vetService;
	@BeforeEach
	void setUp() {

	}

	@Test
	void listVets() {
	}
}