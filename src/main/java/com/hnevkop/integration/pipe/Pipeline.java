package com.hnevkop.integration.pipe;

public class Pipeline<T> implements FilterChain<T> {

	private Filter<T> root; 
	
	FilterChain<T> members;
	
	public T execute(T input) {
	    return	root.execute(input);
	}

	public FilterChain<T> register(Filter<T> filter) {
		
		if(root == null) {
			root = filter;
		} else {
			root.register(filter);
		}
		
		return this;		
	}
}
