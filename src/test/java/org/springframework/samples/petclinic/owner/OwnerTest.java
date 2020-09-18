package org.springframework.samples.petclinic.owner;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;





public class OwnerTest {

	Owner owner = new Owner();

	@Test
	public void getPetTest() {
		Set<Pet> pet = new HashSet<Pet>();
		Pet p = Mockito.mock(Pet.class);
		pet.add(p);
		owner.setPets(pet);
		Mockito.doReturn(false).when(p).isNew();
		Mockito.doReturn("lucky").when(p).getName();
		Pet name = owner.getPet("lucky");
		Assert.assertNotNull(name);
	

	}

}
