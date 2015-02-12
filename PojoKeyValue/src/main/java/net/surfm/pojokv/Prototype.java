package net.surfm.pojokv;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 
 * @author Kirin
 *
 */
public class Prototype implements KeyValuePojo<Prototype> {
	
	private Integer id;
	private String name = "Kan";
	private boolean actived;

	

	@Override
	public Collection<AttributeKey<Prototype, ?>> listKeys() {
		List<AttributeKey<Prototype, ?>> ans = new ArrayList<AttributeKey<Prototype,?>>();
		ans.add(ACTIVED);
		ans.add(NAME);
		ans.add(ID);
		return ans;
	}
	
	@Override
	public <T> T get(AttributeKey<Prototype, T> key) {
		if(key == ID){
			return (T) id;
		}else if(key == NAME){
			return (T) name;
		}else if(key == ACTIVED){
			return (T) (Boolean)actived;
		}else{
			throw new NotFindKeyException("key="+key);
		}
	}
	
	@Override
	public <T> void put(AttributeKey<Prototype, T> key, T o) {
		if(key == ID){
			id = (Integer) o;
		}else if(key == NAME){
			name = (String) o;
		}else if(key == ACTIVED){
			actived = (boolean) o;
		}else{
			throw new NotFindKeyException("key="+key);
		}
	}
	
	public static AttributeKey<Prototype,Integer> ID;
	public static AttributeKey<Prototype,String> NAME;
	public static AttributeKey<Prototype,Boolean> ACTIVED;









	
}
