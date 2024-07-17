package com.hnevkop.integration.pipe;

public interface FilterChain<T> {
	T execute(T input);
	FilterChain<T> register(Filter<T> filter);
}
