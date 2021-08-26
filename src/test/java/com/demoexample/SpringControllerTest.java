package com.demoexample;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import junit.framework.Assert;



@RunWith(MockitoJUnitRunner.class)
public class SpringControllerTest {

	SpringController con=new SpringController();
	
	
	
	
	@Test
	public void mTest() {
		String res=con.methodofstring();
		assertEquals("Welcome", res);
	}
	


}
