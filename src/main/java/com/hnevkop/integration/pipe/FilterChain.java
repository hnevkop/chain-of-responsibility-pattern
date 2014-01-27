package com.hnevkop.integration.pipe;

public interface FilterChain<T> {

	public T execute(T input);
	public FilterChain<T> register(Filter<T> filter);
}
