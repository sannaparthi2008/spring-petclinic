package org.springframework.samples.petclinic.owner;

import java.util.Set;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.samples.petclinic.visit.Visit;
import org.springframework.validation.Errors;
import org.springframework.web.bind.EscapedErrors;

public class PetValidatorTest {
	
	PetValidator validator = new PetValidator();
	Errors error = Mockito.mock(EscapedErrors.class);
	
	@Test
	public void validateTest() {
		Pet pet = new Pet();
		pet.setName("");
		Mockito.doNothing().when(error).rejectValue(Mockito.anyString(), Mockito.anyString(), Mockito.anyString());
		validator.validate(pet, error);
	}
	
	@Test
	public void testGetVisitsInternal() {
		Pet pet = new Pet();
		pet.setVisits(null);
		Set<Visit> set = pet.getVisitsInternal();
		Assert.assertNotNull(set);
	}

}
