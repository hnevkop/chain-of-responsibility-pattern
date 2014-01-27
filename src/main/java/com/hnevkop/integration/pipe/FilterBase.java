package com.hnevkop.integration.pipe;

public abstract class FilterBase<T> implements Filter<T>{

	private Filter<T> next;
	protected abstract T process (T input);
	Filter<T> members;
	
	public void register(Filter<T> filter) {
		if (next == null) {
			next = filter;
		} else {
			next.register(filter);
		}
	}

	public T execute(T input) {
		T out = process(input);
		if(next != null) {
			out = next.execute(out);
		}
		return  out;
	}
	
	
}
