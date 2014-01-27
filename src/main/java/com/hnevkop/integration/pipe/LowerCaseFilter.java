package com.hnevkop.integration.pipe;

public class LowerCaseFilter extends FilterBase<String>{

	@Override
	protected String process(String input) {
		return input.toLowerCase();
	}
	
}
