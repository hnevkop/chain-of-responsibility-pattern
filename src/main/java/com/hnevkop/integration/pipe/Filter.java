package com.hnevkop.integration.pipe;

public interface Filter<T> {
	T execute(T input);
	void register(Filter<T> filter);
}
