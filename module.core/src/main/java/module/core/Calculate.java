package module.core;

@FunctionalInterface
public interface Calculate<K, V> {
	public V calculate(K k) throws Exception;
}