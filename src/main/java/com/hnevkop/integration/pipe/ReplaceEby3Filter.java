package com.hnevkop.integration.pipe;

public class ReplaceEby3Filter extends FilterBase<String>{

	@Override
	protected String process(String input) {
		return input.replace("E","3");
	}
	
}
