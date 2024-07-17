package com.hnevkop.integration.pipe;
import org.junit.Assert;
import org.junit.Test;

import com.hnevkop.integration.pipe.UpperCaseFilter;
import com.hnevkop.integration.pipe.Pipeline;
import com.hnevkop.integration.pipe.ReplaceEby3Filter;


public class CharactersTest {

	@Test
	public void testThePipeline() {
		// define input string
		String input = "whatever";
		
		// create the pipeline
		Pipeline<String> pipeline = new Pipeline<>();
		
		// add a first filter in the pipe
		UpperCaseFilter upperCaseFilter = new UpperCaseFilter();
		pipeline.register(upperCaseFilter);
		Assert.assertEquals("WHATEVER", pipeline.execute(input));
		
		// add a second filter in the pipe
		ReplaceEby3Filter replaceFilter = new ReplaceEby3Filter();
		pipeline.register(replaceFilter);
		
		Assert.assertEquals("WHAT3V3R", pipeline.execute(input));
		
	}

}
