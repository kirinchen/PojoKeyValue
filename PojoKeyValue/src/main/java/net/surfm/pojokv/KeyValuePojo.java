package net.surfm.pojokv;

import java.util.Collection;

/**
 * 
 * @author Kirin
 *
 * @param <POJO>
 */
public interface KeyValuePojo<POJO> {
	
	Collection<AttributeKey<POJO, ?>> listKeys();
	
	<T> T get(AttributeKey<POJO, T> key);
	
	<T> void put(AttributeKey<POJO, T> key,T o);

}
