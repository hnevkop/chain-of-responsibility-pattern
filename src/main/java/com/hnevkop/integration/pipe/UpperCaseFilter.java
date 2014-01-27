package com.hnevkop.integration.pipe;

public class UpperCaseFilter extends FilterBase<String>{

	@Override
	protected String process(String input) {
		return input.toUpperCase();
	}
	
}
