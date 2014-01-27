package com.hnevkop.integration.pipe;

/**
 * 
 * @author Premysl Hnevkovsky
 *
 * @param <T>
 */
public interface Filter<T> {
	public T execute(T input);
	public void register(Filter<T> filter);
}
