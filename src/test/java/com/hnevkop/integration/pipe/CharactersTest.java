package com.hnevkop.integration.pipe;
import org.junit.Assert;
import org.junit.Test;

import com.hnevkop.integration.pipe.LowerCaseFilter;
import com.hnevkop.integration.pipe.Pipeline;
import com.hnevkop.integration.pipe.UpperCaseFilter;


public class CharactersTest {

	@Test
	public void test() {
		String input = new String ("whaTevER");
		System.out.println(input);
		
		Pipeline<String> pipeline = new Pipeline<String>();
		LowerCaseFilter lowerCaseFilter = new LowerCaseFilter();
		
		pipeline.register(lowerCaseFilter);
		Assert.assertEquals("whatever", pipeline.execute(input));
		
		UpperCaseFilter upperCaseFilter = new UpperCaseFilter();
		lowerCaseFilter.register(upperCaseFilter);
		Assert.assertEquals("WHATEVER", pipeline.execute(input));
		
	}

}
