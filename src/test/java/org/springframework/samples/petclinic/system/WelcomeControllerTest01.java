package org.springframework.samples.petclinic.system;

import org.junit.Assert;
import org.junit.jupiter.api.Test;



public class WelcomeControllerTest {
	
	WelcomeController welcome = new WelcomeController();
	
	@Test
	public void testWelcome() {
		String str = welcome.welcome();
		Assert.assertEquals("welcome", str);
		
	}

}
